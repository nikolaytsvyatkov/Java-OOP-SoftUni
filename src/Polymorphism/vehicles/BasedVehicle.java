package Polymorphism.vehicles;

public abstract class BasedVehicle {
    private String type;
    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    protected BasedVehicle(String type, double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.type = type;
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
    }

    public abstract String driving(double distance);
    public abstract void refueling(double liters);

    protected double getTankCapacity() {
        return tankCapacity;
    }


    protected void setFuelQuantity(double fuelQuantity) {
        if (fuelQuantity < 0) {
            throw  new IllegalArgumentException("Fuel must be a positive number");
        }
        if (fuelQuantity > this.tankCapacity) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.fuelQuantity = fuelQuantity;
    }

    public String getType() {
        return type;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
    public String toString() {
        return String.format("%s: %.2f",this.type,this.fuelQuantity);
    }
}
