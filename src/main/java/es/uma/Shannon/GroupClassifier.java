package es.uma.Shannon;

import java.util.List;

public interface GroupClassifier {
    List<String> getGroups();
    String classify(String value);
}