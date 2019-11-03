package Inheritance.person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int age = Integer.parseInt(input.nextLine());

        Child child = new Child(name, age);
        System.out.println(child.getName());
        System.out.println(child.getAge());
    }
}
