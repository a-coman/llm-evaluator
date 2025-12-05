package es.uma.LlmAsAJudge;

import es.uma.Utils;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class LlmAsAJudge {

    private static final Map<String, String> PREFIX_TO_DOMAIN = new HashMap<>();

    static {
        PREFIX_TO_DOMAIN.put("s", "statemachine");
        PREFIX_TO_DOMAIN.put("b", "bank");
        PREFIX_TO_DOMAIN.put("p", "pickupnet");
        PREFIX_TO_DOMAIN.put("h", "hotelmanagement");
    }

    public static void main(String[] args) {
        final String OUTPUT_PATH = "src/main/java/es/uma/LlmAsAJudge/";
        final String INSTANCES_PATH = OUTPUT_PATH + "test/";
        final String PROMPTS_PATH = "src/main/resources/prompts/";

        // Clear the responses file first
        Utils.saveFile("", OUTPUT_PATH, "responses.md", false);

        File instancesDir = new File(INSTANCES_PATH);
        File[] soilFiles = instancesDir.listFiles((dir, name) -> name.endsWith(".soil"));

        if (soilFiles == null) {
            throw new RuntimeException("No .soil files found in the Instances directory.");
        }
        
        for (File soilFile : soilFiles) {
            IJudge judge = Llms.getAgent(IJudge.class, Model.TEST);

            String fileName = soilFile.getName();
            String prefix = fileName.substring(0, 1);
            String domainName = PREFIX_TO_DOMAIN.get(prefix);

            if (domainName == null) {
                throw new RuntimeException("Unknown prefix for file: " + fileName);
            }

            String domainModelPath = PROMPTS_PATH + domainName + "/diagram.use";
            String domainModel = Utils.readFile(domainModelPath);
            String objectModel = Utils.readFile(soilFile.getPath());

            String response = judge.chat(domainModel, objectModel);

            // Append to responses.md with title
            String content = "# " + fileName + "\n\n" + response + "\n\n";
            Utils.saveFile(content, OUTPUT_PATH, "responses.md");

            System.out.println("Processed: " + fileName + " with domain: " + domainName);
            
        }

        Logger.save(OUTPUT_PATH, false);
    }
}
