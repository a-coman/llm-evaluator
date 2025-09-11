package es.uma.RandomSelector;

import java.util.List;
import java.util.Map;
import java.util.Random;

import es.uma.Utils;

/*
 * Generates random instances selection from instances paths dataset
 */
public class RandomSelector {

    private final static int MAX_GENS = 30;
    private final static int NUMBER_OF_CATEGORIES = 5;
    private final static int NUMBER_OF_INSTANCES = 2;

    public static void main(String[] args) {

        Map<String, Map<String, List<String>>> simplePaths = Utils.getPaths("Simple");
        Map<String, Map<String, List<String>>> cotPaths = Utils.getPaths("CoT");

        // System.out.println("Simple Paths: " + simplePaths);

        // long seed = System.nanoTime();
        long seed = 8973687696131L; // Fixed seed for reproducibility
        System.out.println("Seed: " + seed);
        Random random = new Random(seed);

        List<String> analyzedSystems = List.of("Bank", "PickupNet", "Restaurant", "Statemachine");

        for (String system : analyzedSystems) {
            for (int i = 0; i < NUMBER_OF_INSTANCES; i++) {
                Map<String, List<String>> gensSimple = simplePaths.get(system);
                Map<String, List<String>> gensCoT = cotPaths.get(system);
                int genIndex = random.nextInt(1, MAX_GENS+1); // 1 to MAX_GENS inclusive
                System.out.println("System: " + system);
                String simpleInstance = gensSimple.get("gen" + genIndex).get(0); // We only have one instance per gen in Simple

                // As for CoT gens are grouped by 6 (0-5, 6-11, ...) because we have 5 categories, sum = 30 gens
                int group = genIndex % NUMBER_OF_CATEGORIES == 0
                    ? (genIndex / NUMBER_OF_CATEGORIES) 
                    : (genIndex / NUMBER_OF_CATEGORIES) + 1; // Casting to int truncates
                
                int positionInGroup = genIndex - (NUMBER_OF_CATEGORIES * (group - 1)) - 1; // -1 for 0-based index

                List<String> cotInstances = gensCoT.get("gen" + group);
                String cotInstance = cotInstances.get(positionInGroup);
                System.out.println(simpleInstance);
                System.out.println(cotInstance);

            }
        }
    }
}
