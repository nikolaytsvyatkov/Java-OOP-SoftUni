package Encapsulation.animalfarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    private void setAge(int age) {
        if (age < 0 || age > 15 ) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }
    public double productPerDay() {
        return this.calculateProductPerDay();
    }
    private double calculateProductPerDay() {
        if (this.age >= 0 && this.age <= 5) {
            return 2;
        } else if (this.age  >= 6 && this.age <=11) {
            return 1;
        } else if (this.age >= 12 && this.age <= 15) {

            return 0.75;
        }
        return 0;
    }
    public String toString() {
       return String.format("Chicken %s (age %d) can produced %.2f eggs per day.",this.name, this.age, this.productPerDay());
    }
}
