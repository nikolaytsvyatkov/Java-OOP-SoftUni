package Polymorphism.animal;

public abstract class Animal {
    private String name;
    private String favouriteFood;

    protected Animal(String name, String favouriteFood) {
        this.name = name;
        this.favouriteFood = favouriteFood;
    }
    public abstract String explainSelf();
    public String toString() {
        return String.format("I am %s and my favourite food is %s",this.name, this.favouriteFood);
    }

}
