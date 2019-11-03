package Inheritance.bookshop;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String author,String title, double price) {
        this.setAuthor(author);
        this.setTitle(title);
        this.setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        if (title.length() < 3) {
            throw new IllegalStateException("Title not valid!");
        }
        this.title = title;
    }

    public void setAuthor(String author) {
        String[] strings = author.split(" ");
        if (strings.length == 2 && Character.isDigit(strings[1].charAt(0))) {
            throw  new IllegalStateException("Author not valid!");
        }
        this.author = author;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalStateException("Price not valid!");
        }
        this.price = price;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Title: ").append(this.getTitle())
                .append(System.lineSeparator())
                .append("Author: ").append(this.getAuthor())
                .append(System.lineSeparator())
                .append("Price: ").append(this.getPrice())
                .append(System.lineSeparator());
        return sb.toString();
    }

    }
