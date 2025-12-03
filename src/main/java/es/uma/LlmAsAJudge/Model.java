package es.uma.LlmAsAJudge;

public enum Model {
    GEMINI_2_5_FLASH(""),
    GPT_OSS(""),
    CLAUDE_OPUS_4_5(""),
    TEST("gemini-2.5-flash");
    
    private final String modelName;
    Model(String modelName) {
        this.modelName = modelName;
    }
    public String getModelName() {
        return modelName;
    }
}
