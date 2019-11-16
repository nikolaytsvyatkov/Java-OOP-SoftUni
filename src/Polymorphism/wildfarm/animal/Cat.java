package Polymorphism.wildfarm.animal;

import Polymorphism.wildfarm.animalAbstact.Felime;

import Polymorphism.wildfarm.foods.Food;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private String breed;

    public Cat(String animalType, String animalName, Double animalWeight, String livingRegion, String breed) {
        super(animalType, animalName, animalWeight, livingRegion);
        this.breed = breed;
    }


    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {

            this.setFoodEaten(this.getFoodEaten() + food.getQuantity());


    }
    public String toString() {
        return String.format("%s[%s, %s, %s, %s, %d]",this.getAnimalType(),this.getAnimalName(),this.breed,new DecimalFormat("#.##").format(this.getAnimalWeight() ),
                this.getLivingRegion(), this.getFoodEaten());
    }
}
