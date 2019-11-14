package Polymorphism.vehicles;

import java.text.DecimalFormat;

public class Truck extends BasedVehicle {
    private final static double ADDING_CONSUMPTION = 1.6;
    public Truck(String type, double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(type, fuelQuantity, fuelConsumption + ADDING_CONSUMPTION, tankCapacity);
    }

    @Override
    public String driving(double distance) {
        if (this.getFuelConsumption() * distance <= this.getFuelQuantity()) {
            this.setFuelQuantity(this.getFuelQuantity() - (this.getFuelConsumption()) * distance);
            return String.format("Truck travelled %s km", new DecimalFormat("#.##").format(distance));
        }
            return  ("Truck needs refueling");

    }

    @Override
    public void refueling(double liters) {
        if (liters <= 0) {
            throw  new IllegalArgumentException("Fuel must be a positive number");
        }
        if (this.getFuelQuantity() + liters * 0.95 <= this.getTankCapacity()) {
            this.setFuelQuantity(this.getFuelQuantity() + liters * 0.95);
        } else {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
    }
}
