package com.example;

public class Warranty {
    public static String  warrantyPeriod = "5 years";
    private String condition, warrantyType;

    public Warranty(String condition, String warrantyType) {
        this.condition = condition;
        this.warrantyType = warrantyType;
    }
    public String getCondition() {
        return condition;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }
    public String getWarrantyType() {
        return warrantyType;
    }
    public void setWarrantyType(String warrantyType) {
        this.warrantyType = warrantyType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Warranty{");
        sb.append("condition= ").append(condition);
        sb.append(", warrantyType= ").append(warrantyType);
        sb.append(", warranty period= ").append(warrantyPeriod);
        sb.append('}');
        return sb.toString();
    }
    
}
