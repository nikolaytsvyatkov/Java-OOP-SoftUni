package AbstaractionInterface.ferrari;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Car ferrari = new Ferrari(name);
        System.out.println(ferrari.toString());
    }
}
