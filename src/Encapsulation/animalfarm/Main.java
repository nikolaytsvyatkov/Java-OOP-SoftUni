package Encapsulation.animalfarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int age = Integer.parseInt(input.nextLine());

        try {
            Chicken chicken = new Chicken(name, age);
            System.out.println(chicken.toString());
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
