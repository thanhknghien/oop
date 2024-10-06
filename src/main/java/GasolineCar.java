class GasolineCar extends Car {
    private int fuelConsumption;
    private int tankCapacity;

    public GasolineCar(int id, String name, String brand, int yearOfProduction, double price, String category, Warranty warranty, int fuelConsumption, int tankCapacity) {
        super(id, name, brand, yearOfProduction, price, category, warranty);
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

}