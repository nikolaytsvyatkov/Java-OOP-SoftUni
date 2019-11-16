package Polymorphism.wildfarm;

import Polymorphism.wildfarm.animal.Cat;
import Polymorphism.wildfarm.animal.Mouse;
import Polymorphism.wildfarm.animal.Tiger;
import Polymorphism.wildfarm.animal.Zebra;
import Polymorphism.wildfarm.animalAbstact.Mammal;
import Polymorphism.wildfarm.foods.Food;
import Polymorphism.wildfarm.foods.Meat;
import Polymorphism.wildfarm.foods.Vegetable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Mammal> list = new ArrayList<>();

        while (true) {
            String[] command = input.nextLine().split(" ");
            if (command[0].equals("End")) {
                break;
            }
            switch (command[0]) {
                case "Cat":
                    Mammal cat = new Cat(command[0], command[1], Double.parseDouble(command[2]),command[3], command[4]);
                    String[] command2 = input.nextLine().split(" ");
                    cat.makeSound();
                    switch (command2[0]) {
                        case "Vegetable":
                            Food food = new Vegetable(Integer.parseInt(command2[1]));
                            try {
                                cat.eat(food);

                            }catch (IllegalArgumentException e) {
                                System.out.println(e.getMessage());
                            }

                            break;
                        case "Meat":
                            Food food1 = new Meat(Integer.parseInt(command2[1]));
                            try {
                                cat.eat(food1);

                            }catch (IllegalArgumentException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                    }

                    list.add(cat);
                    break;
                case "Tiger":
                    Mammal tiger = new Tiger(command[0], command[1], Double.parseDouble(command[2]),command[3]);
                    String[] command3 = input.nextLine().split(" ");
                    tiger.makeSound();
                    switch (command3[0]) {
                        case "Vegetable":
                            Food food = new Vegetable(Integer.parseInt(command3[1]));
                            try {
                                tiger.eat(food);

                            }catch (IllegalArgumentException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case "Meat":
                            Food food1 = new Meat(Integer.parseInt(command3[1]));
                            try {
                                tiger.eat(food1);
                            }catch (IllegalArgumentException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                    }
                    list.add(tiger);
                    break;
                case "Zebra":
                    Mammal zebra = new Zebra(command[0], command[1], Double.parseDouble(command[2]),command[3]);
                    String[] command4 = input.nextLine().split(" ");
                    zebra.makeSound();
                    switch (command4[0]) {
                        case "Vegetable":
                            Food food = new Vegetable(Integer.parseInt(command4[1]));
                            try {
                                zebra.eat(food);

                            }catch (IllegalArgumentException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case "Meat":
                            Food food1 = new Meat(Integer.parseInt(command4[1]));
                            try {
                                zebra.eat(food1);

                            }catch (IllegalArgumentException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                    }

                    list.add(zebra);
                    break;
                case "Mouse":
                    Mammal mouse = new Mouse(command[0], command[1], Double.parseDouble(command[2]),command[3]);
                    String[] command5 = input.nextLine().split(" ");
                    mouse.makeSound();
                    switch (command5[0]) {
                        case "Vegetable":
                            Food food = new Vegetable(Integer.parseInt(command5[1]));
                            try {
                                mouse.eat(food);

                            }catch (IllegalArgumentException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case "Meat":
                            Food food1 = new Meat(Integer.parseInt(command5[1]));
                            try {
                                mouse.eat(food1);

                            }catch (IllegalArgumentException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                    }

                    list.add(mouse);
                    break;

            }


        }
        for (Mammal i : list) {
            System.out.println(i.toString());
        }
    }
}
