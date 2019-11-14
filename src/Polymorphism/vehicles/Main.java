package Polymorphism.vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] strCar = input.nextLine().split(" ");
        String[] strTruck = input.nextLine().split(" ");
        String[] strBus = input.nextLine().split(" ");

            BasedVehicle car = new Car(strCar[0], Double.parseDouble(strCar[1]), Double.parseDouble(strCar[2]), Double.parseDouble(strCar[3]));
            BasedVehicle truck = new Truck(strTruck[0], Double.parseDouble(strTruck[1]), Double.parseDouble(strTruck[2]), Double.parseDouble(strTruck[3]));
            Bus bus = new Bus(strBus[0], Double.parseDouble(strBus[1]), Double.parseDouble(strBus[2]), Double.parseDouble(strBus[3]));


        int n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = input.nextLine().split(" ");
            StringBuilder toCheck = new StringBuilder();
            toCheck.append(tokens[0]).append(" ").append(tokens[1]);
            switch (toCheck.toString()) {
                case "Drive Car":
                    try {
                        System.out.println(car.driving(Double.parseDouble(tokens[2])));
                    }catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case "Drive Truck":
                    try {
                        System.out.println(truck.driving(Double.parseDouble(tokens[2])));
                    }catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case "Refuel Car":
                    try {
                        car.refueling(Double.parseDouble(tokens[2]));
                    }catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case "Refuel Truck":
                    try {
                        truck.refueling(Double.parseDouble(tokens[2]));
                    }catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case "Drive Bus":
                    try {
                        System.out.println(bus.driving(Double.parseDouble(tokens[2])));
                    }catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "DriveEmpty Bus":
                    try {
                        System.out.println(bus.drivingEmpty(Double.parseDouble(tokens[2])));
                    }catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Refuel Bus":
                    try {
                        bus.refueling(Double.parseDouble(tokens[2]));
                    }catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        }
        System.out.println(car.toString());
        System.out.println(truck.toString());
        System.out.println(bus.toString());

    }
}
