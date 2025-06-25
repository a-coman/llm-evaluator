package es.uma.Semantics;

import dev.langchain4j.data.embedding.Embedding;
import dev.langchain4j.model.googleai.GoogleAiEmbeddingModel;
import io.github.cdimascio.dotenv.Dotenv;

public class Test {
    public static void main(String[] args) {
        // Test the SemanticMethod class
        Dotenv dotenv = Dotenv.load();
        String apiKey = dotenv.get("GEMINI_KEY");

        GoogleAiEmbeddingModel embeddingModel = GoogleAiEmbeddingModel.builder()
            .apiKey(apiKey)
            .modelName("text-embedding-004")
            .build();


        String word1 = "987-654-3210";
        String word2 = "123-456-7890";

        Embedding emb1 =  embeddingModel.embed(word1).content();
        Embedding emb2 = embeddingModel.embed(word2).content();
        double similarity = SemanticMethod.cosineSimilarity(emb1.vector(), emb2.vector());
        System.out.println("Cosine similarity between '" + word1 + "' and '" + word2 + "': " + similarity);
    }
}
