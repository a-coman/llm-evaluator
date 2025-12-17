package es.uma.LlmAsAJudge;

import es.uma.Table;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.LongAdder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JudgeUtils {
    private static final Pattern RESPONSE_PATTERN = Pattern
            .compile("(?im)^\\*\\*Response\\*\\*:\\s*(Realistic|Unrealistic|Unknown)\\b");

    public record WorkItem(
            String system,
            String gen,
            String filePath,
            String sectionName,
            String sortKey,
            String context
        ) {
    }

    public record Section(String sortKey, String markdown) { }

    public static Table buildSystemResultsTable(
            String title,
            List<String> systems,
            Map<String, LongAdder> realisticBySystem,
            Map<String, LongAdder> unrealisticBySystem,
            Map<String, LongAdder> unknownBySystem) {

        String[] rowsHeader = new String[systems.size() + 1];
        String[] columnsHeader = { "Realistic", "Unrealistic", "Unknown", "Success Rate" };
        float[][] tableData = new float[systems.size() + 1][4];

        float totalRealistic = 0.0f;
        float totalUnrealistic = 0.0f;
        float totalUnknown = 0.0f;

        for (int i = 0; i < systems.size(); i++) {
            String system = systems.get(i);

            LongAdder r = realisticBySystem.get(system);
            LongAdder u = unrealisticBySystem.get(system);
            LongAdder unk = unknownBySystem.get(system);

            float realistic = r == null ? 0.0f : r.floatValue();
            float unrealistic = u == null ? 0.0f : u.floatValue();
            float unknown = unk == null ? 0.0f : unk.floatValue();
            float total = realistic + unrealistic + unknown;

            rowsHeader[i] = system;
            tableData[i][0] = realistic;
            tableData[i][1] = unrealistic;
            tableData[i][2] = unknown;
            tableData[i][3] = total == 0.0f ? 0.0f : (100.0f * (realistic / total));

            totalRealistic += realistic;
            totalUnrealistic += unrealistic;
            totalUnknown += unknown;
        }

        int totalRow = systems.size();
        rowsHeader[totalRow] = "Total";
        tableData[totalRow][0] = totalRealistic;
        tableData[totalRow][1] = totalUnrealistic;
        tableData[totalRow][2] = totalUnknown;
        float grandTotal = totalRealistic + totalUnrealistic + totalUnknown;
        tableData[totalRow][3] = grandTotal == 0.0f ? 0.0f : (100.0f * (totalRealistic / grandTotal));

        return new Table(title, rowsHeader, columnsHeader, tableData);
    }

    public static String deriveOutDirFromAnyPath(String anySoilPath, int parentLevelsUp) {
        File dir = new File(anySoilPath);
        for (int i = 0; i < parentLevelsUp; i++) {
            dir = dir.getParentFile();
            if (dir == null) {
                throw new IllegalArgumentException(
                        "Cannot derive output directory from path: " + anySoilPath + " (levels=" + parentLevelsUp
                                + ")");
            }
        }
        return dir.getPath() + "/";
    }

    public static String computeSafeOutDir(String derivedOutDirOrNull, String dataset, String modeTitle, String modelName) {
        if (derivedOutDirOrNull != null) {
            return derivedOutDirOrNull;
        }
        return "src/main/java/es/uma/LlmAsAJudge/" + dataset + "/" + modeTitle + "/" + modelName + "/";
    }

    public static String extractResponseLabelOrThrow(String response, String context) {
        Matcher m = RESPONSE_PATTERN.matcher(response == null ? "" : response);
        if (!m.find()) {
            throw new IllegalArgumentException(
                    "Missing '**Response**: Realistic|Unrealistic|Unknown' for " + context);
        }
        return m.group(1);
    }

    public static String safeCategoryFromFilePath(String filePath) {
        return new File(filePath).getName().replaceFirst("(?i)\\.soil$", "");
    }

    public static WorkItem toWorkItem(String system, String gen, String filePath, String modeTitle) {
        // If CoT mode, include category in section name and sort key
        if ("CoT".equalsIgnoreCase(modeTitle)) {
            String category = safeCategoryFromFilePath(filePath);
            String sectionName = gen + " / " + category;
            String sortKey = gen + "/" + category;
            String context = system + "/" + gen + "/" + category;
            return new WorkItem(system, gen, filePath, sectionName, sortKey, context);
        }

        String sectionName = gen;
        String sortKey = gen;
        String context = system + "/" + gen;
        return new WorkItem(system, gen, filePath, sectionName, sortKey, context);
    }

    public static void appendErrorsMarkdown(StringBuilder out, ConcurrentLinkedQueue<String> errors) {
        if (errors == null || errors.isEmpty()) {
            return;
        }
        out.append("# Errors\n\n");
        for (String err : errors) {
            out.append("- ").append(err).append("\n");
        }
        out.append("\n");
    }
}
