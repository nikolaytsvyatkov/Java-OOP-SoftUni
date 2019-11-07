package Encapsulation.classbox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double a = Double.parseDouble(input.nextLine());
        Double b = Double.parseDouble(input.nextLine());
        Double c = Double.parseDouble(input.nextLine());
        try {
            Box box = new Box(a, b, c);
            System.out.println(box.toString());
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
