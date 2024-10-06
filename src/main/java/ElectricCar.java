class ElectricCar extends Car {
    private int batteryCapacity;
    private int range;

    public ElectricCar(int id, String name, String brand, int yearOfProduction, double price, String category, Warranty warranty, int batteryCapacity, int range) {
        super(id, name, brand, yearOfProduction, price, category, warranty);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getRange() {
        return range;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setRange(int range) {
        this.range = range;
    }

}