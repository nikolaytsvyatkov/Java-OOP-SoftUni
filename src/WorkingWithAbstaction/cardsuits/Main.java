package WorkingWithAbstaction.cardsuits;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CardSuit[] cardSuits = CardSuit.values();
        System.out.println("Card Suits:");
        for (CardSuit i : cardSuits) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",i.getOrdinalValue(),i);
        }
    }
}
