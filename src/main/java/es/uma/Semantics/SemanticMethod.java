package es.uma.Semantics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dev.langchain4j.data.embedding.Embedding;
import dev.langchain4j.data.segment.TextSegment;
import dev.langchain4j.model.googleai.GoogleAiEmbeddingModel;
import es.uma.Utils;
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

    public static double averagePairwiseSimilarity(Map<String, Embedding> embeddingMap) {
        List<String> words = new ArrayList<>(embeddingMap.keySet());
        int n = words.size();
        double[][] simMatrix = new double[n][n];

        List<Embedding> embeddings = new ArrayList<>(embeddingMap.values());
        double sum = 0.0;
        int count = 0;

        // Compute similarity matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                double sim;
                if (i == j) {
                    sim = 1.0;
                } else {
                    sim = cosineSimilarity(
                        embeddings.get(i).vector(),
                        embeddings.get(j).vector()
                    );
                    sum += sim;
                    count++;
                }
                simMatrix[i][j] = sim;
                simMatrix[j][i] = sim; // Symmetric
            }
        }

        // Build markdown table
        StringBuilder output = new StringBuilder();
        output.append("\n\n|   |");
        for (String word : words) {
            output.append(" " + word + " |");
        }
        output.append("\n|---|");
        for (int i = 0; i < n; i++) {
            output.append("---|");
        }
        output.append("\n");
        for (int i = 0; i < n; i++) {
            output.append("| " + words.get(i) + " |");
            for (int j = 0; j < n; j++) {
                output.append(String.format(" %.2f |", simMatrix[i][j]));
            }
            output.append("\n");
        }
        output.append("\n");
        Utils.saveFile(output.toString(), "src/main/java/es/uma/Semantics/", "matrix.md", true);
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

        Map<String, Embedding> embeddingMap = new HashMap<>();
        // attribute, embedding

        for (int i = 0; i < values.size(); i++) {
            embeddingMap.put(values.get(i), embeddings.get(i));
        }

        double avgSim = averagePairwiseSimilarity(embeddingMap);
        System.out.println("Average pairwise similarity: " + avgSim);
        
        return avgSim;
    }

}
