package WorkingWithAbstaction.cardswithpower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String type = input.nextLine();
        String power = input.nextLine();


        Card card = new Card(type, power);
        System.out.println(card.toString());
    }
}
