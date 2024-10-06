package com.example;

public class GasolineCar extends Car {
    String fuelConsumption;

    public GasolineCar(String id, String name, String brand, String category, double price, int yearOfProduction, Warranty warranty, String fuelConsumption) {
        super(id, name, brand, category, price, yearOfProduction, warranty);
        this.fuelConsumption = fuelConsumption;
    }
}
