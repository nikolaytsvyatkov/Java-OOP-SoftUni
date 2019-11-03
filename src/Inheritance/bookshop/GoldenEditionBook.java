package Inheritance.bookshop;

public class GoldenEditionBook extends Book {
    public GoldenEditionBook(String title, String author, double price) {
        super(title, author, price);
    }
    public void setPrice(double price) {
        price += price * 0.3;
        super.setPrice(price);
    }


}
