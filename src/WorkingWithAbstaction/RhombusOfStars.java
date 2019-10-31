package WorkingWithAbstaction;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        for (int i = 1; i <= n; i++) {
            printingSpace(i, n);
            printingStars(i);
            printingSpace(i, n);
            System.out.println();
        }
        for (int i = n - 1; i >= 0; i--) {
            printingSpace(i, n);
            printingStars(i);
            printingSpace(i, n);
            System.out.println();
        }

    }
    static void printingSpace(int i, int n) {
        int repeatingTime = n - i;
        for (int j = 0; j < repeatingTime; j++) {
            System.out.print(" ");
        }
    }
    static void printingStars(int i) {
        while (i != 0) {
            System.out.print("* ");
            i--;
        }

    }
}
