package Polymorphism.wildfarm.animal;

import Polymorphism.wildfarm.animalAbstact.Felime;

import Polymorphism.wildfarm.foods.Food;
import Polymorphism.wildfarm.foods.Meat;

public class Tiger extends Felime {


    public Tiger(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (!(food instanceof Meat)) {
            throw new IllegalArgumentException(String.format("%ss are not eating that type of food!",this.getAnimalType()));
        }

            this.setFoodEaten(this.getFoodEaten() + food.getQuantity());

    }
}
