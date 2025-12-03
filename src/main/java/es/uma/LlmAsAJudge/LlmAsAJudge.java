package es.uma.LlmAsAJudge;

import es.uma.Utils;

public class LlmAsAJudge {

    public static void main(String[] args) {
        final String OUTPUT_PATH = "src/main/java/es/uma/LlmAsAJudge/";
        
        IJudge judge = Llms.getAgent(IJudge.class, Model.TEST);
        String domainModel = Utils.readFile("src/main/resources/prompts/bank/diagram.use");
        String objectModel = Utils.readFile("src/main/resources/dataset/Simple/Bank/21-03-2025--15-41-00/gen1/output.soil");

        String response = judge.chat(domainModel, objectModel);
        Utils.saveFile(response + "\n", OUTPUT_PATH, "response.md", false);
        Logger.save(OUTPUT_PATH, false);
    }
}
