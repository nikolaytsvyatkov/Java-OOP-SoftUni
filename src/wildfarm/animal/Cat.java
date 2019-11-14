package wildfarm.animal;

import wildfarm.animalAbstact.Felime;

import wildfarm.foods.Food;

public class Cat extends Felime {
    private String breed;
    public Cat(String animalName, String animalType, Double animalWeight, Integer foodEaten, String breed) {
        super(animalName, animalType, animalWeight, foodEaten);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {

    }
}
