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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SemanticResult{\n");
        for (Map.Entry<String, Double> entry : results.entrySet()) {
            sb.append("  ").append(entry.getKey()).append(": ").append(String.format("%.4f", entry.getValue())).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
