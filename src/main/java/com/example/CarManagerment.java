package com.example;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class CarManagerment implements Modify<Car> {
    private List<Car> listCar;
    private String path;

    Scanner r = new Scanner(System.in);

    public CarManagerment(List<Car> listCar, String path) {
        this.listCar = listCar;
        this.path = path;
    }


    @Override
    public void add(Car car) throws IOException {
        this.listCar.add(car);
    }

    @Override
    public void delete(String id) throws IOException {
        System.out.print("Enter car id: ");
        String s = r.nextLine();
        System.out.println();
        searchCar(listCar, "id", s);
        listCar.removeIf(car -> car.getId().equals(id));
        
        
    }

    @Override
    public void edit(String id, Car newObj) throws IOException {
        
        
    }

    @Override
    public void export(String path, Car obj) {
        
        
    }

    @Override
    public void importData(String path, Car obj) throws IOException {
        
        
    }
    
    public static void searchCar(List<Car> carList, String attribute, String value){
        attribute = attribute.toLowerCase();
        value = value.toLowerCase();
        for (Car car : carList) {
            if (attribute.equals("brand") && car.getBrand().equalsIgnoreCase(value)) {
                System.out.println(car);
            } else if (attribute.equals("name") && car.getName().equalsIgnoreCase(value)) {
                System.out.println(car.toString());
            }else if(attribute.equals("id") && car.getId().equalsIgnoreCase(value)){
                System.out.println(car);
            }
        }
    
    }
}
