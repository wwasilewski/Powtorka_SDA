package sda.powtorka.tydzien2.oop;

public class Engine {

    private double capacity;
    private int horsePower;
    private double fuelConsumption;

    public Engine(double capacity, int horsePower, double fuelConsumption) {
        this.capacity = capacity;
        this.horsePower = horsePower;
        this.fuelConsumption = fuelConsumption;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
