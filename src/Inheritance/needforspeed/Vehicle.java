package Inheritance.needforspeed;

public class Vehicle {
    private final static double DEFAULT_FUEL_CONSUMPTION = 1.25;
    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public Vehicle(double fuel, int horsePower) {
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.fuelConsumption = getDefaultFuelConsumption();
    }

    public static double getDefaultFuelConsumption() {
        return DEFAULT_FUEL_CONSUMPTION;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }



    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    public void drive(double kilometers) {
        double neededFuel = this.fuelConsumption * kilometers;
        if (this.fuel - neededFuel >= 0) {
            this.setFuel(this.fuel - neededFuel);
        }
    }
}
