package es.uma;

import es.uma.Coverage.Coverage;
import es.uma.Semantics.Semantics;
import es.uma.Shannon.Shannon;
import es.uma.Similarity.Similarity;

public class Main {
    // Calculate all metrics main
    public static void main(String[] args) {
        // TODO: Add use-checks metrics
        Similarity.calculateSimilarities();
        Shannon.calculateShannon();
        Coverage.calculateCoverage();
        Semantics.calculateSemantics();
    }
}
