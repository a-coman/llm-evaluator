package es.uma.Semantics;

import java.util.Map;

public class SemanticResult {
    private final Map<String, Double> results;

    public SemanticResult(Map<String, Double> results) {
        this.results = results;
    }

    public String toMarkdownRow(String label) {
        StringBuilder sb = new StringBuilder();
        sb.append("| ").append(label);
        for (Map.Entry<String, Double> entry : results.entrySet()) {
            sb.append(" | ").append(String.format("%.4f", entry.getValue()));
        }
        sb.append(" |");
        return sb.toString();
    }
}
