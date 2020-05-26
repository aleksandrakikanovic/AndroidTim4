package model;

public class Rule {
    private int id;
    private EnumCondition condition;
    private EnumOperation operation;

    public Rule(int id,EnumCondition condition,EnumOperation operation){
        this.id = id;
        this.condition = condition;
        this.operation = operation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EnumCondition getCondition() {
        return condition;
    }

    public void setCondition(EnumCondition condition) {
        this.condition = condition;
    }

    public EnumOperation getOperation() {
        return operation;
    }

    public void setOperation(EnumOperation operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Rule{" +
                "id=" + id +
                ", condition='" + condition + '\'' +
                ", operation='" + operation + '\'' +
                '}';
    }
}
