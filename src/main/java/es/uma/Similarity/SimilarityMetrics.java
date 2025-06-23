package es.uma.Similarity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SimilarityMetrics {
    private final List<Double> numericAttributes;
    private final List<String> stringAttributes;

    public SimilarityMetrics() {
        this.numericAttributes = new ArrayList<>();
        this.stringAttributes = new ArrayList<>();
    }

    public void addNumeric(Collection<Double> values) {
        if (values != null) {
            numericAttributes.addAll(values);
        }
    }

    public void addStrings(Collection<String> values) {
        if (values != null) {
            stringAttributes.addAll(values);
        }
    }

    public SimilarityResult calculate() {
        double numericSimilarity = SimilarityMethod.calculateNumeric(numericAttributes);
        double stringEqualsSimilarity = SimilarityMethod.calculateStringEquals(stringAttributes);
        double stringLvSimilarity = SimilarityMethod.calculateStringLv(stringAttributes);

        return new SimilarityResult(numericSimilarity, stringEqualsSimilarity, stringLvSimilarity);
    }

    public List<Double> getNumericAttributes() {
        return new ArrayList<>(numericAttributes);
    }

    public List<String> getStringAttributes() {
        return new ArrayList<>(stringAttributes);
    }

    public void aggregate(SimilarityMetrics other) {
        numericAttributes.addAll(other.numericAttributes);
        stringAttributes.addAll(other.stringAttributes);
    }
}