package es.uma.Shannon.Classifiers;

import java.util.List;

import es.uma.Shannon.GroupClassifier;

public class EnumGroupClassifier implements GroupClassifier {

    private List<String> groups;
    
    public EnumGroupClassifier() {
        this.groups = List.of();
    }

    @Override
    public List<String> getGroups() {
        return groups;
    }

    @Override
    public String classify(String value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'classify'");
    }

    
}
