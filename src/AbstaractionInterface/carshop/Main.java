package AbstaractionInterface.carshop;

public class Main {
    public static void main(String[] args) {
         CarImpl    seat = new Seat("Leon", "Gray", 110, "Spain", 11111.1);
        Audi audi = new Audi("A4", "Gray", 110, "Germany", 3, 99.9);

    }

    private static void printCarInfo(Car car) {
        System.out.println(String.format(
                "%s is %s color and have %s horse power",
                car.getModel(),
                car.getColor(),
                car.getHorsePower()));
        System.out.println(car.toString());
    }


}
