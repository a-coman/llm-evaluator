package es.uma;

import java.util.List;

public class Similarity {

    private static int normalize(List<Integer> values) {
        return 0;
    }

    public static double calculateNumeric(List<Double> numericAttributes) {
        int sum = 0;
        int it = 0;
        for (int i = 0; i < numericAttributes.size(); i++) {
            for (int j = 0; j < numericAttributes.size(); j++) {
                if ( i != j && numericAttributes.get(i) <= numericAttributes.get(j)) {
                    it += 1;
                    if (numericAttributes.get(i).equals(numericAttributes.get(j))) {
                        sum += 1;
                    }
                }
            }
        }
        return it == 0 ? 0.0 : ((double)sum / it);
    }

    private static double calculateString(List<String> stringAttributes, String type) {
        int sum = 0;
        for (int i = 0; i < stringAttributes.size(); i++)
            for (int j = i+1; j < stringAttributes.size(); j++)
                switch (type) {
                    case "equals":
                        sum += stringAttributes.get(i).equals(stringAttributes.get(j)) ? 1 : 0;        
                        break;
                    case "lv":
                        sum += Lv.computeLvDistance(stringAttributes.get(i), stringAttributes.get(j));
                        break;
                    default:
                        throw new RuntimeException("Invalid type: " + type);
                }
                
        return stringAttributes.size() == 0 ? 0.0 : ((double)sum / stringAttributes.size());
    }

    public static double calculateStringEquals(List<String> stringAttributes) {
        return calculateString(stringAttributes, "equals");
    }

    public static double calculateStringLv(List<String> stringAttributes) {
        return calculateString(stringAttributes, "lv");
    }

    public static void main(String[] args) {
        System.out.println(calculateNumeric(List.of(60.0,18.0,18.0,72.0,84.0,14.0,14.0)));
    }
}
