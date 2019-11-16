package Polymorphism.wildfarm.animal;


import Polymorphism.wildfarm.animalAbstact.Mammal;
import Polymorphism.wildfarm.foods.Food;
import Polymorphism.wildfarm.foods.Vegetable;

public class Zebra extends Mammal {


    public Zebra(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food) {
        if (!(food instanceof Vegetable)) {
            throw new IllegalArgumentException(String.format("%ss are not eating that type of food!",this.getAnimalType()));
        }

            this.setFoodEaten(this.getFoodEaten() + food.getQuantity());

    }
}
