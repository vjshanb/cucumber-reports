package com.github.mkolisnyk.cucumber.reporting.types.beans;

import com.github.mkolisnyk.cucumber.reporting.types.breakdown.BreakdownTable;
import com.github.mkolisnyk.cucumber.reporting.types.result.CucumberScenarioResult;

public class FeatureMapDataBean extends CommonDataBean {
    private CucumberScenarioResult[][][] scenarios;
    private BreakdownTable table;
    public BreakdownTable getTable() {
        return table;
    }
    public void setTable(BreakdownTable table) {
        this.table = table;
    }
    public CucumberScenarioResult[][][] getScenarios() {
        return scenarios;
    }
    public void setScenarios(CucumberScenarioResult[][][] scenarios) {
        this.scenarios = scenarios;
    }
}