package es.uma.Semantics;

public class Table {

    private String title;
    private String[] rowsHeader;
    private String[] columnsHeader;
    private float[][] data;

    public Table(String title, int size) {
        this.title = title;
        this.rowsHeader = new String[size];
        this.columnsHeader = new String[size];
        this.data = new float[size][size];
    }

    public Table(String title, String[] rowsHeader, String[] columnsHeader) {
        this.title = title;
        this.rowsHeader = rowsHeader;
        this.columnsHeader = columnsHeader;
        this.data = new float[rowsHeader.length][columnsHeader.length];
    }

    public Table(String title, String[] rowsHeader, String[] columnsHeader, float[][] data) {
        this.title = title;
        this.rowsHeader = rowsHeader;
        this.columnsHeader = columnsHeader;
        this.data = data;
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

    public String toMarkdown() {
        StringBuilder sb = new StringBuilder();
        sb.append("| ").append(title).append(" | ").append(String.join(" | ", columnsHeader)).append(" |\n");
        sb.append("|---|").append("---|".repeat(columnsHeader.length)).append("\n");
        // Append data rows
        for (int i = 0; i < rowsHeader.length; i++) {
            sb.append("| ").append("**").append(rowsHeader[i]).append("** | ");
            for (int j = 0; j < columnsHeader.length; j++) {
                sb.append(data[i][j]).append(" | ");
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
    }

}
