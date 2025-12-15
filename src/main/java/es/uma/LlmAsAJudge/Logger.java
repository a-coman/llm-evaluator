package es.uma.LlmAsAJudge;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.DoubleAdder;
import java.util.Collections;

import es.uma.Utils;

import java.util.ArrayList;

public class Logger {
    private static AtomicInteger sumOfInputTokens = new AtomicInteger(0);
    private static AtomicInteger sumOfOutputTokens = new AtomicInteger(0);
    private static AtomicInteger sumOfTotalTokens = new AtomicInteger(0);
    private static DoubleAdder genTime = new DoubleAdder();
    // private static Experiment experiment;
    private static List<String> logs = Collections.synchronizedList(new ArrayList<>());

    public static void addLog(String log) {
        logs.add(log);
    }

    public static void inecrementGenTime(double time) {
        genTime.add(time);
    }

    public static void incrementTokens(int input, int output, int total) {
        sumOfInputTokens.addAndGet(input);
        sumOfOutputTokens.addAndGet(output);
        sumOfTotalTokens.addAndGet(total);
    }

    // public static void setExperiment(Experiment experiment) {
    //     Logger.experiment = experiment;
    // }

    private static String getListenerLogs() {
        StringBuilder listenerLogs = new StringBuilder();
        for (String log : logs) {
            listenerLogs.append(log);
        }
        return listenerLogs.toString();
    }

    public static void save(String path, String filename, Boolean append) {

        StringBuilder metrics = new StringBuilder();
        metrics.append(getListenerLogs());

        metrics.append("\n# Summary for all generations\n");
        metrics.append("| Metric | Value |\n");
        metrics.append("| --- | --- |\n");
        // metrics.append("| Model | " + experiment.getModelName() + " |\n");
        // metrics.append("| Type | " + experiment.getType() + " |\n");
        // metrics.append("| System | " + experiment.getSystem() + " |\n");
        // metrics.append("| Context window tokens | " + Llms.MAX_TOKENS + " |\n");
        // metrics.append("| Number of generations | " + experiment.getRepetitions() + "
        // |\n");
        metrics.append("| Generations time | " + String.format("%.2f", genTime.sum()) + " seconds |\n");
        metrics.append("| Sum of input tokens | " + sumOfInputTokens + " |\n");
        metrics.append("| Sum of output tokens | " + sumOfOutputTokens + " |\n");
        metrics.append("| Sum of total tokens | " + sumOfTotalTokens + " |\n");

        Utils.saveFile(metrics.toString(), path, filename, append);
    }

    public static void save(String path) {
        save(path, "logs.md", true);
    }

    public static void save(String path, String filename) {
        save(path, filename, true);
    }

    public static void save(String path, Boolean append) {
        save(path, "logs.md", append);
    }
}
