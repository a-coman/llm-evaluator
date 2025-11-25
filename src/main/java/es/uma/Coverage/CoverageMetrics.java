package es.uma.Coverage;

import java.util.ArrayList;
import java.util.List;

import es.uma.Table;

public class CoverageMetrics {
    int definedCls = 0, definedAttr = 0, definedRel = 0;
    int instantiatedCls = 0, instantiatedAttr = 0, instantiatedRel = 0;
    List<String> uncovered = new ArrayList<>();

    void add(CoverageMetrics other) {
        this.definedCls += other.definedCls;
        this.definedAttr += other.definedAttr;
        this.definedRel += other.definedRel;
        this.instantiatedCls += other.instantiatedCls;
        this.instantiatedAttr += other.instantiatedAttr;
        this.instantiatedRel += other.instantiatedRel;
        this.uncovered.addAll(other.uncovered);
    }

    public String getUncoveredListString() {
        if (!uncovered.isEmpty()) {
            return "Uncovered: " + uncovered.toString() + "\n\n";
        }
        return "";
    }

    Table toTable(String title) {
        String[] tableColumnsHeader = new String[] { "instantiated", "defined", "coverage"};
        String[] tableRowsHeader = new String[] { "classes", "attributes", "relationships" };

        float[][] tableData = {
                { instantiatedCls, definedCls, definedCls != 0 ? (float) instantiatedCls / definedCls : 0},
                { instantiatedAttr, definedAttr, definedAttr != 0 ? (float) instantiatedAttr / definedAttr : 0},
                { instantiatedRel, definedRel, definedRel != 0 ? (float) instantiatedRel / definedRel : 0}
        };

        return new Table(title, tableRowsHeader, tableColumnsHeader, tableData);
    }
}
