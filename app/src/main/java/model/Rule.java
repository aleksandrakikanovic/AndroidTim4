package model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Rule implements Serializable {
    @SerializedName("rule_id")
    private int rule_id;
    @SerializedName("conditionOfRule")
    private EnumCondition conditionOfRule;
    @SerializedName("valueOfRule")
    private String valueOfRule;
    @SerializedName("operationOfRule")
    private EnumOperation operationOfRule;

    public Rule(int id,EnumCondition condition,EnumOperation operation){
        this.rule_id = rule_id;
        this.conditionOfRule = conditionOfRule;
        this.operationOfRule = operationOfRule;
    }

    public int getRule_id() {
        return rule_id;
    }

    public void setRule_id(int rule_id) {
        this.rule_id = rule_id;
    }

    public EnumCondition getConditionOfRule() {
        return conditionOfRule;
    }

    public void setConditionOfRule(EnumCondition conditionOfRule) {
        this.conditionOfRule = conditionOfRule;
    }

    public String getValueOfRule() {
        return valueOfRule;
    }

    public EnumOperation getOperationOfRule() {
        return operationOfRule;
    }

    public void setOperationOfRule(EnumOperation operationOfRule) {
        this.operationOfRule = operationOfRule;
    }

    public void setValueOfRule(String valueOfRule) {
        this.valueOfRule = valueOfRule;
    }

    @Override
    public String toString() {
        return "Rule{" +
                "id=" + rule_id +
                ", condition='" + conditionOfRule + '\'' +
                ", value='" + valueOfRule + '\'' +
                ", operation='" + operationOfRule + '\'' +
                '}';
    }
}
