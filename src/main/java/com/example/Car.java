package com.example;

public class Car {
    private String id, name, brand,category;
    private int yearOfProduction;
    private double price;
    private Warranty warranty;

    public Car(String id,String name ,String brand, String category, double price,int yearOfProduction,Warranty warranty ) {
        this.brand = brand;
        this.category = category;
        this.id = id;
        this.name = name;
        this.price = price;
        this.warranty = warranty;
        this.yearOfProduction = yearOfProduction;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getCategory() {
        return category;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getPrice() {
        return price;
    }

    public Warranty getWarranty() {
        return warranty;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", brand=").append(brand);
        sb.append(", category=").append(category);
        sb.append(", yearOfProduction=").append(yearOfProduction);
        sb.append(", price=").append(price);
        sb.append(", ").append(warranty);
        sb.append('}');
        return sb.toString();
    }

    
    

    
}
