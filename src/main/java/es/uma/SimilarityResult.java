package es.uma;

public class SimilarityResult {
    private final double numericSimilarity;
    private final double stringEqualsSimilarity;
    private final double stringLvSimilarity;

    public SimilarityResult(double numericSimilarity, double stringEqualsSimilarity, double stringLvSimilarity) {
        this.numericSimilarity = numericSimilarity;
        this.stringEqualsSimilarity = stringEqualsSimilarity;
        this.stringLvSimilarity = stringLvSimilarity;
    }

    public double getNumericSimilarity() {
        return numericSimilarity;
    }

    public double getStringEqualsSimilarity() {
        return stringEqualsSimilarity;
    }

    public double getStringLvSimilarity() {
        return stringLvSimilarity;
    }

    public String toMarkdownRow(String label) {
        return String.format("| %s | %.4f | %.4f | %.4f |", 
            label, numericSimilarity, stringEqualsSimilarity, stringLvSimilarity);
    }
}