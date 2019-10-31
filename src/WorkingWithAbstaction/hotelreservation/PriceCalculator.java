package WorkingWithAbstaction.hotelreservation;

import java.util.Scanner;

public class PriceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] strings = input.nextLine().split(" ");
        double price = Double.parseDouble(strings[0]);
        int numberOfDays = Integer.parseInt(strings[1]);
        String season = strings[2];
        String discount = strings[3];
        double totalPrice = price * Season.valueOf(season).getValue() * numberOfDays;
        double percent = (double) (Discount.valueOf(discount).getValue());
        percent /= 100;
        totalPrice = totalPrice - totalPrice *percent ;
        System.out.printf("%.2f%n",totalPrice);
    }
}
