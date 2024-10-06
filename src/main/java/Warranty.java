public class Warranty {

    public static int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public static void setWarrantyPeriod(int warrantyPeriod) {
        Warranty.warrantyPeriod = warrantyPeriod;
    }
    private String conditions;
    private static int warrantyPeriod = 5;
    private String warrantyType;

    public Warranty(String conditions, int warrantyPeriod, String warrantyType) {
        this.conditions = conditions;
        Warranty.warrantyPeriod = warrantyPeriod;
        this.warrantyType = warrantyType;
    }

    public String getConditions() {
        return conditions;
    }

    public String getWarrantyType() {
        return warrantyType;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public void setWarrantyType(String warrantyType) {
        this.warrantyType = warrantyType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Warranty{");
        sb.append("conditions=").append(conditions);
        sb.append(", warrantyType=").append(warrantyType);
        sb.append('}');
        return sb.toString();
    }

}