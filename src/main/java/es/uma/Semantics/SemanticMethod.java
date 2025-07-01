package es.uma.Semantics;

import java.util.ArrayList;
import java.util.List;

import dev.langchain4j.data.embedding.Embedding;
import dev.langchain4j.data.segment.TextSegment;
import dev.langchain4j.model.googleai.GoogleAiEmbeddingModel;
import io.github.cdimascio.dotenv.Dotenv;

public class SemanticMethod {

    public static float cosineSimilarity(float[] vecA, float[] vecB) {
        float dotProduct = 0.0f;
        float normA = 0.0f;
        float normB = 0.0f;
        for (int i = 0; i < vecA.length; i++) {
            dotProduct += vecA[i] * vecB[i];
            normA += Math.pow(vecA[i], 2);
            normB += Math.pow(vecB[i], 2);
        }

        return (float) (dotProduct / (Math.sqrt(normA) * Math.sqrt(normB)));
    }

    public static List<Embedding> getEmbeddings(String[] values){
        Dotenv dotenv = Dotenv.load();
        String apiKey = dotenv.get("GEMINI_KEY");

        GoogleAiEmbeddingModel embeddingModel = GoogleAiEmbeddingModel.builder()
            .apiKey(apiKey)
            .modelName("text-embedding-004")
            .build();

        List<TextSegment> textSegments = new ArrayList<>();
        for (String value : values) {
            textSegments.add(TextSegment.from(value));
        }
        List<Embedding> embeddings = embeddingModel.embedAll(textSegments).content();

        return embeddings;
    }

    public static float[][] getSimilarity(String[] values) {
        int n = values.length;
        float[][] data = new float[n][n];
        List<Embedding> embeddingValues = getEmbeddings(values);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    data[i][j] = 0.0f; // Similarity with itself
                } else {
                    float sim = cosineSimilarity(embeddingValues.get(i).vector(), embeddingValues.get(j).vector());
                    data[i][j] = (1.0f - sim) / 2.0f; // Range [0,1] where 0 = very similar, 1 = very different
                    data[j][i] = data[i][j]; // Symmetric
                }
            }
        }
        return data;
    }
}
