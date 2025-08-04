package es.uma.Shannon.Classifiers;
import java.util.List;

import es.uma.Shannon.GroupClassifier;

public class AgeGroupClassifier implements GroupClassifier {

    private final List<String> ageGroups = List.of("Invalid", "Teen", "Young", "Adult", "Senior");

    @Override
    public List<String> getGroups() {
        return ageGroups;
    }

    @Override
    public String classify(String value) {
        try {
            int age = Integer.parseInt(value);
            if (age < 0) return ageGroups.get(0);
            if (age <= 17) return ageGroups.get(1);
            if (age <= 39) return ageGroups.get(2);
            if (age <= 59) return ageGroups.get(3);
            if (age <= 120)  return ageGroups.get(4); // Assuming 120 is the upper limit for human age
            return ageGroups.get(0); // Invalid age
        } catch (NumberFormatException e) {
            return ageGroups.get(0);
        }
    }
}