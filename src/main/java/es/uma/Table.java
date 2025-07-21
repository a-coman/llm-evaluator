package es.uma;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Table {

    private String title;
    private String[] rowsHeader;
    private String[] columnsHeader;
    private float[][] data;

    private int[][] numberAttributes;

    public static class DiagStats {
        public final float mean;
        public final float std;
        public final float min;
        public final float max;

        public DiagStats(float mean, float std, float min, float max) {
            this.mean = mean;
            this.std = std;
            this.min = min;
            this.max = max;
        }

        @Override
        public String toString() {
            return String.format("Top-diag -> Mean: %.2f, Std: %.2f, Min: %.2f, Max: %.2f", mean, std, min, max);
        }
    }

    public Table(String title, int size) {
        this.title = title;
        this.rowsHeader = new String[size];
        this.columnsHeader = new String[size];
        this.data = new float[size][size];
        this.numberAttributes = new int[size][size];
    }

    public Table(String title, String[] rowsHeader, String[] columnsHeader) {
        this.title = title;
        this.rowsHeader = rowsHeader;
        this.columnsHeader = columnsHeader;
        this.data = new float[rowsHeader.length][columnsHeader.length];
        this.numberAttributes = new int[rowsHeader.length][columnsHeader.length];
    }

    public Table(String title, String[] rowsHeader, String[] columnsHeader, float[][] data) {
        this.title = title;
        this.rowsHeader = rowsHeader;
        this.columnsHeader = columnsHeader;
        this.data = data;
        this.numberAttributes = new int[rowsHeader.length][columnsHeader.length];
    }

    public String[] getRowsHeader() {
        return rowsHeader;
    }

    public String[] getColumnsHeader() {
        return columnsHeader;
    }

    public float[][] getData() {
        return data;
    }

    public String getTitle() {
        return title;
    }

    public void setValue(float data, String row, String column) {
        int rowIndex = -1;
        int colIndex = -1;

        for (int i = 0; i < rowsHeader.length; i++) {
            if (rowsHeader[i].equals(row)) {
                rowIndex = i;
                break;
            }
        }

        for (int j = 0; j < columnsHeader.length; j++) {
            if (columnsHeader[j].equals(column)) {
                colIndex = j;
                break;
            }
        }

        if (rowIndex == -1 || colIndex == -1) {
            throw new IllegalArgumentException("Row or column not found.");
        }

        this.data[rowIndex][colIndex] = data;
    }

    // Method to compute stats of the top diagonal
    public DiagStats getTopDiagStats() {
        int n = data.length;

        if (n == 0 || n == 1) {
            return new DiagStats(0, 0, 0, 0);
        }

        List<Float> topDiagValues = new ArrayList<>();

        // Collect values above the main diagonal
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                topDiagValues.add(data[i][j]);
            }
        }

        if (topDiagValues.isEmpty()) {
            throw new IllegalStateException("No top diagonal values found.");
        }

        // Compute mean, min, max
        float sum = 0.0f;
        float min = Float.POSITIVE_INFINITY;
        float max = Float.NEGATIVE_INFINITY;
        for (float val : topDiagValues) {
            sum += val;
            if (val < min) min = val;
            if (val > max) max = val;
        }
        float mean = sum / topDiagValues.size();

        // Compute standard deviation
        float varianceSum = 0.0f;
        for (float val : topDiagValues) {
            varianceSum += (val - mean) * (val - mean);
        }
        float std = (float) Math.sqrt(varianceSum / topDiagValues.size());

        return new DiagStats(mean, std, min, max);
    }

    public void setColumnsNumberAttributes(String gen, Map<String, List<String>> attributes) {

        int rowIndex = -1;
        for (int i = 0; i < rowsHeader.length; i++) {
            if (rowsHeader[i].equals(gen)) {
                rowIndex = i;
                break;
            }
        }

        if (rowIndex == -1) {
            throw new IllegalArgumentException("Gen not found.");
        }


        for (Map.Entry<String, List<String>> entry : attributes.entrySet()) {
            String column = entry.getKey();
            List<String> values = entry.getValue();

            int colIndex = -1;
            for (int j = 0; j < columnsHeader.length; j++) {
                if (columnsHeader[j].equals(column)) {
                    colIndex = j;
                    break;
                }
            }

            if (colIndex == -1) {
                throw new IllegalArgumentException("Column not found.");
            }

            this.numberAttributes[rowIndex][colIndex] = values.size();
        }
    }


    public float getWeightedMean(int rowIndex) {
        float sum = 0.0f;
        int total = 0;
        for (int i = 0; i < columnsHeader.length; i++) {
            sum += data[rowIndex][i] * numberAttributes[rowIndex][i];
            total += numberAttributes[rowIndex][i];
        }
        return total > 0 ? sum / total : 0.0f;
    }

    public float getWeightedStd(int rowIndex) {
        float mean = getWeightedMean(rowIndex);
        float varianceSum = 0.0f;
        int total = 0;

        for (int i = 0; i < columnsHeader.length; i++) {
            float diff = data[rowIndex][i] - mean;
            varianceSum += diff * diff * numberAttributes[rowIndex][i];
            total += numberAttributes[rowIndex][i];
        }

        return total > 0 ? (float) Math.sqrt(varianceSum / total) : 0.0f;
    }

    public void addValue(float data, String row, String column) {
        int rowIndex = -1;
        int colIndex = -1;

        for (int i = 0; i < rowsHeader.length; i++) {
            if (rowsHeader[i].equals(row)) {
                rowIndex = i;
                break;
            }
        }

        for (int j = 0; j < columnsHeader.length; j++) {
            if (columnsHeader[j].equals(column)) {
                colIndex = j;
                break;
            }
        }

        if (rowIndex == -1 || colIndex == -1) {
            throw new IllegalArgumentException("Row or column not found.");
        }

        this.data[rowIndex][colIndex] += data;
    }

    public float getValue(String row, String column) {
        int rowIndex = -1;
        int colIndex = -1;

        for (int i = 0; i < rowsHeader.length; i++) {
            if (rowsHeader[i].equals(row)) {
                rowIndex = i;
                break;
            }
        }

        for (int j = 0; j < columnsHeader.length; j++) {
            if (columnsHeader[j].equals(column)) {
                colIndex = j;
                break;
            }
        }

        if (rowIndex == -1 || colIndex == -1) {
            throw new IllegalArgumentException("Row or column not found.");
        }

        return this.data[rowIndex][colIndex];
    }


    public String toMarkdown() {
        StringBuilder sb = new StringBuilder();
        sb.append("| ").append(title).append(" | ").append(String.join(" | ", columnsHeader)).append(" |\n");
        sb.append("|---|").append("---|".repeat(columnsHeader.length)).append("\n");
        // Append data rows
        for (int i = 0; i < rowsHeader.length; i++) {
            sb.append("| ").append("**").append(rowsHeader[i]).append("** | ");
            for (int j = 0; j < columnsHeader.length; j++) {
                sb.append(String.format("%.4f", data[i][j])).append(" | ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String title = "My Table";
        String[] rows = {"Row1", "Row2", "Row3"};
        String[] columns = {"Col1", "Col2", "Col3"};
        float[][] data = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        Table table = new Table(title, rows, columns, data);
        System.out.println(table.toMarkdown());
        System.out.println(table.getTopDiagStats());

    }

}
