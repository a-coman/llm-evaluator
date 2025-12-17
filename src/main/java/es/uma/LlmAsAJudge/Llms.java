package es.uma.LlmAsAJudge;

import java.time.Duration;
import java.util.List;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.service.AiServices;
import io.github.cdimascio.dotenv.Dotenv;

public class Llms {
    public static final int MEMORY_MAX_MESSAGES = 10;

    public static ChatModel getModel(Model model) {
        Dotenv dotenv = Dotenv.load();

        if (model == Model.TEST) {
            // Return Gemini model for testing
            return GoogleAiGeminiChatModel.builder()
                .apiKey(dotenv.get("GEMINI_KEY"))
                .maxOutputTokens(null) // Limit for testing
                .modelName(model.getModelName())
                .logRequestsAndResponses(true)
                .listeners(List.of(new Listener()))
                .maxRetries(10)
                .timeout(Duration.ofSeconds(180))
                .build();
        } else {
            // TODO: Check as other models might use different parameters, temp, top_p, etc. and here we are using OpenAi defaults.
            // Return OpenRouter model for other models
            return OpenAiChatModel.builder()
                .apiKey(dotenv.get("OPENROUTER_API_KEY"))
                .baseUrl("https://openrouter.ai/api/v1")
                .modelName(model.getModelName())
                .logRequests(true)
                .logResponses(true)
                .listeners(List.of(new Listener()))
                .maxRetries(10)
                .timeout(Duration.ofSeconds(180))
                .temperature(model.getTemperature())
                .maxTokens(model.getMaxTokens())
                .build();
        }
        
    }

    public static <T> T getAgent(Class<T> agent, Model model) {
        Listener.setCurrentAgent(agent.getSimpleName());
        ChatMemory memory = MessageWindowChatMemory.withMaxMessages(MEMORY_MAX_MESSAGES);
        return AiServices.builder(agent)
                .chatModel(getModel(model))
                .chatMemory(memory)
                .build();
    }
}
