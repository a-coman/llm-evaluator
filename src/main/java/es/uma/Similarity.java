package es.uma;

import java.util.ArrayList;
import java.util.List;

public class Similarity {

    public static double calculateNumeric(List<Double> numericAttributes) {
        if (numericAttributes == null || numericAttributes.isEmpty()) {
            return Double.NaN;
        }
        List<Double> values = new ArrayList<>();
        double sum = 0;
        double iterations = 0; // (n * (n - 1)) / 2.0;
        for (int i = 0; i < numericAttributes.size(); i++) {
            for (int j = i+1; j < numericAttributes.size(); j++) {
                iterations++;
                double d1 = numericAttributes.get(i);
                double d2 = numericAttributes.get(j);
                if (d1 != d2) {
                    sum += 1.0;
                    values.add(1.0);
                } else {
                    values.add(0.0);
                }
            }
        }

        return iterations == 0 ? 1.0 : sum / iterations; 
    }

    private static double calculateString(List<String> stringAttributes, String type) {
        if (stringAttributes == null || stringAttributes.isEmpty()) {
            return Double.NaN;
        }

        double sum = 0;
        double iterations = 0;
        for (int i = 0; i < stringAttributes.size(); i++) {
            for (int j = i+1; j < stringAttributes.size(); j++) {
                iterations++;
                
                String a = stringAttributes.get(i);
                String b = stringAttributes.get(j);

                switch (type) {
                    case "equals":
                        sum += !a.equals(b) ? 1.0 : 0.0;        
                        break;
                    case "lv":
                        double lv = Lv.computeLvDistance(a, b);
                        sum += lv / (double) Math.max(a.length(), b.length());
                        break;
                    default:
                        throw new RuntimeException("Invalid type: " + type);
                }
            }
        }
               
        return iterations == 0 ? 1.0 : sum / iterations;
    }

    public static double calculateStringEquals(List<String> stringAttributes) {
        return calculateString(stringAttributes, "equals");
    }

    public static double calculateStringLv(List<String> stringAttributes) {
        return calculateString(stringAttributes, "lv");
    }

    public static void main(String[] args) {
        System.out.println("Numeric: " + calculateNumeric(List.of()));
        System.out.println("Equals: " + calculateStringEquals(List.of("cat", "dog", "per")));
        System.out.println("LV: " + calculateStringLv(List.of("Carlos", "Silva", "February 15, 2024", "February 22, 2024", "February 15, 2024", "February 22, 2024", "Rental of traditional Carnaval costumes.", "Exclusive breakfast with a view of Copacabana Beach.")));
    }
}
