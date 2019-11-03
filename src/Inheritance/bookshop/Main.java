package Inheritance.bookshop;

//import java.lang.instrument.IllegalClassFormatException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String author = scanner.nextLine();
            String title = scanner.nextLine();
            double price = Double.valueOf(scanner.nextLine());

            Book book = new Book(author,
                    title,
                    price);

            GoldenEditionBook goldenEditionBook =
                    new GoldenEditionBook(author,
                            title,
                            price);

            Method[] goldenBookDeclaredMethods =
                    GoldenEditionBook.class.getDeclaredMethods();

            if (goldenBookDeclaredMethods.length > 1) {
                throw new IllegalStateException(
                        "Code duplication in GoldenEditionBook!");
            }

            System.out.println(book.toString());
            System.out.println(goldenEditionBook.toString());

        } catch (IllegalStateException error) {
            System.out.println(error.getMessage());
        }
    }

}
