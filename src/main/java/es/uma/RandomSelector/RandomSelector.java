package es.uma.RandomSelector;

import java.util.ArrayList;
import java.util.Collections;
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

        Map<String, Map<String, List<String>>> simplePaths = Utils.getPaths("Simple", "GPT4O-exp1");
        Map<String, Map<String, List<String>>> cotPaths = Utils.getPaths("CoT", "GPT4O-exp1");

        // Used Seed.java to generate seeds
        // Fixed seeds for reproducibility
        long seedForm1 = 8973687696131L;
        // long seedForm2 = 10558747322614L;
        // long seedForm3 = 27615425851431L;

        System.out.println("Seed: " + seedForm1);
        Random random = new Random(seedForm1);

        List<String> analyzedSystems = new ArrayList<>(List.of("Bank", "PickupNet", "HotelManagement", "Statemachine"));
        Collections.shuffle(analyzedSystems, random); // Shuffle to avoid order bias

        for (String system : analyzedSystems) {
            List<String> instances = new ArrayList<>();

            for (int i = 0; i < NUMBER_OF_INSTANCES; i++) {
                Map<String, List<String>> gensSimple = simplePaths.get(system);
                Map<String, List<String>> gensCoT = cotPaths.get(system);
                int genIndex = random.nextInt(1, MAX_GENS + 1); // 1 to MAX_GENS inclusive
                String simpleInstance = gensSimple.get("gen" + genIndex).get(0); // We only have one instance per gen in
                                                                                 // Simple

                // As for CoT gens are grouped by 6 (0-5, 6-11, ...) because we have 5
                // categories, sum = 30 gens
                int group = genIndex % NUMBER_OF_CATEGORIES == 0
                        ? (genIndex / NUMBER_OF_CATEGORIES)
                        : (genIndex / NUMBER_OF_CATEGORIES) + 1; // Casting to int truncates

                int positionInGroup = genIndex - (NUMBER_OF_CATEGORIES * (group - 1)) - 1; // -1 for 0-based index

                List<String> cotInstances = gensCoT.get("gen" + group);
                String cotInstance = cotInstances.get(positionInGroup).contains("invalid") // Do not select invalid instances
                    ? cotInstances.get(positionInGroup+1)
                    : cotInstances.get(positionInGroup);

                instances.add(simpleInstance);
                instances.add(cotInstance);

            }

            // Add 2x "Real" and "Synthetic" instances
            instances.add("Real");
            instances.add("Real");
            instances.add("Synthetic");
            instances.add("Synthetic");

            System.out.println("System: " + system);
            Collections.shuffle(instances, random); // Shuffle to avoid order bias

            char id = system.charAt(0);

            for (int i = 0; i < instances.size(); i++) {
                System.out.println("- [" + id + i + "] " + instances.get(i));
            }
        }
    }
}
