package es.uma;

import es.uma.Coverage.Coverage;
import es.uma.Semantics.Semantics;
import es.uma.Shannon.Shannon;
import es.uma.Similarity.Similarity;

public class Main {
    // Calculate all metrics main
    public static void main(String[] args) {
        // TODO: Add use-checks metrics
        Similarity.calculateSimilarities("GPT4O-exp1");
        Shannon.calculateShannon("GPT4O-exp1");
        Coverage.calculateCoverage("GPT4O-exp1");
        Semantics.calculateSemantics("GPT4O-exp1");
    }
}
