package WorkingWithAbstaction.cardrank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CardRank[] cardRanks = CardRank.values();
        System.out.println("Card Ranks:");
        for (CardRank i : cardRanks) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",i.ordinal(),i);
        }
    }
}
