package Polymorphism.vehicles;

import java.text.DecimalFormat;

public class Bus extends BasedVehicle {
    private static final double CONSUMPTION_WITH_PEOPLE = 1.4;

    protected Bus(String type, double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(type, fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public String driving(double distance) {
        if ((this.getFuelConsumption() + CONSUMPTION_WITH_PEOPLE) * distance <= this.getFuelQuantity()) {
            this.setFuelQuantity(this.getFuelQuantity() - (this.getFuelConsumption() + CONSUMPTION_WITH_PEOPLE)  * distance);
            return String.format("Bus travelled %s km",new DecimalFormat("#.##").format(distance));
        }
        return ("Bus needs refueling");
    }
    public String drivingEmpty(double distance) {
        if ((this.getFuelConsumption()) * distance <= this.getFuelQuantity()) {
            this.setFuelQuantity(this.getFuelQuantity() - this.getFuelConsumption() * distance);
            return String.format("Bus travelled %s km",new DecimalFormat("#.##").format(distance));
        }
        return ("Bus needs refueling");
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
