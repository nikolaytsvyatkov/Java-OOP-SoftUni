package Encapsulation.shoppingspree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw  new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public double getMoney() {
        return money;
    }
    public void buyProduct(Product product) {
        if (this.getMoney() - product.getCost() >= 0) {
            this.products.add(product);
            this.setMoney(this.getMoney() - product.getCost());
        } else {
            throw new IllegalArgumentException(String.format("%s can't afford %s", this.name, product.getName()));
        }
    }

    public String getName() {
        return name;
    }

   /* public List<Product> getProducts() {
        if (this.products.size() == 0) {
            throw new IllegalArgumentException("Nothing bought");
        }
        return products;
    }*/

    private void setMoney(double money) {
        if (money < 0) {
            throw  new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

}
