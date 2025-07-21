package es.uma.Shannon.Classifiers;
import es.uma.Shannon.GroupClassifier;

public class AgeGroupClassifier implements GroupClassifier {
    @Override
    public String classify(String value) {
        try {
            int age = Integer.parseInt(value);
            if (age < 0) return "Invalid";
            if (age <= 17) return "Teen";
            if (age <= 39) return "Young";
            if (age <= 59) return "Adult";
            return "Senior";
        } catch (NumberFormatException e) {
            return "Invalid";
        }
    }
}