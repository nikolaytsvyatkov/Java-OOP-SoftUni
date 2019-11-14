package Polymorphism.vehicles;

import java.text.DecimalFormat;

public class Car extends BasedVehicle {
    public static final double ADD_CONSUMPTION = 0.9;
    public Car(String type, double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(type, fuelQuantity, fuelConsumption + ADD_CONSUMPTION, tankCapacity);
    }

    @Override
    public String driving(double distance) {
        if (this.getFuelConsumption() * distance <= this.getFuelQuantity()) {
            this.setFuelQuantity(this.getFuelQuantity() - this.getFuelConsumption() * distance);
            return String.format("Car travelled %s km",new DecimalFormat("#.##").format(distance));
        }
            return ("Car needs refueling");

    }

    @Override
    public void refueling(double liters) {
        if (liters <= 0) {
            throw  new IllegalArgumentException("Fuel must be a positive number");
        }
        if (this.getFuelQuantity() + liters <= this.getTankCapacity()) {
            this.setFuelQuantity(this.getFuelQuantity() + liters);
        } else {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
    }
}
