package Inheritance.needforspeed;

public class SportCar extends Car {
    public SportCar(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(10);
    }
}
