package model;

public class Rule {
    private int id;
    private String condition;
    private String operation;

    public Rule(int id,String condition,String operation){
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

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
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
