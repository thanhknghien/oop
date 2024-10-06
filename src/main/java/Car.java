public class Car {
    protected int id;
    protected String name;
    protected String brand;
    protected int yearOfProduction;
    protected double price;
    protected String category;
    protected Warranty warranty;

    public Car(int id, String name, String brand, int yearOfProduction, double price, String category, Warranty warranty) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.category = category;
        this.warranty = warranty;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public Warranty getWarranty() {
        return warranty;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setWarranty(Warranty warranty) {
        this.warranty = warranty;
    }


}