package es.uma.Semantics;

import java.util.List;

import dev.langchain4j.data.embedding.Embedding;
import dev.langchain4j.data.segment.TextSegment;
import dev.langchain4j.model.googleai.GoogleAiEmbeddingModel;
import io.github.cdimascio.dotenv.Dotenv;

public class SemanticMethod {

    public static double cosineSimilarity(float[] vecA, float[] vecB) {
        double dotProduct = 0.0;
        double normA = 0.0;
        double normB = 0.0;
        for (int i = 0; i < vecA.length; i++) {
            dotProduct += vecA[i] * vecB[i];
            normA += Math.pow(vecA[i], 2);
            normB += Math.pow(vecB[i], 2);
        }
        return dotProduct / (Math.sqrt(normA) * Math.sqrt(normB));
    }

    public static double averagePairwiseSimilarity(List<Embedding> embeddings) {
        int n = embeddings.size();
        double sum = 0.0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double sim = cosineSimilarity(
                    embeddings.get(i).vector(),
                    embeddings.get(j).vector()
                );
                sum += sim;
                count++;
            }
        }
        return sum / count;
    }

    public static double calculateSemanticSimilarity(List<String> values) {

        Dotenv dotenv = Dotenv.load();
        String apiKey = dotenv.get("GEMINI_KEY");

        GoogleAiEmbeddingModel embeddingModel = GoogleAiEmbeddingModel.builder()
            .apiKey(apiKey)
            .modelName("text-embedding-004")
            .build();

        List<TextSegment> textSegments = values.stream()
            .map(value -> TextSegment.from(value))
            .toList();
        List<Embedding> embeddings = embeddingModel.embedAll(textSegments).content();

        double avgSim = averagePairwiseSimilarity(embeddings);
        System.out.println("Average pairwise similarity: " + avgSim);
        
        return avgSim;
    }

}
