package es.uma.LlmAsAJudge;

public enum Model {
    GEMINI_2_5_FLASH("google/gemini-2.5-flash", null, null),
    GPT_OSS("", null, null),
    CLAUDE_OPUS_4_5("", null, null),
    GEMINI_3_PRO("google/gemini-3-pro-preview", null, null),
    TEST("gemini-2.5-flash", null, null),
    QWEN_4B("qwen/qwen3-4b:free", 1000, 0.7);
    
    private final String modelName;
    private final Integer maxTokens;
    private final Double temperature;
    
    Model(String modelName, Integer maxTokens, Double temperature) {
        this.modelName = modelName;
        this.maxTokens = maxTokens;
        this.temperature = temperature;
    }

    public String getModelName() {
        return modelName;
    }

    public Integer getMaxTokens() {
        return maxTokens;
    }
    
    public Double getTemperature() {
        return temperature;
    }
}
