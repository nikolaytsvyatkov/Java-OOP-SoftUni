package Polymorphism.wildfarm.animal;


import Polymorphism.wildfarm.animalAbstact.Mammal;
import Polymorphism.wildfarm.foods.Food;
import Polymorphism.wildfarm.foods.Vegetable;

public class Mouse extends Mammal {
    private String livingRegion;

    public Mouse(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }


    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food food) {
        if (!(food instanceof Vegetable)) {
            throw new IllegalArgumentException(("Mice are not eating that type of food!"));
        }

            this.setFoodEaten(this.getFoodEaten() + food.getQuantity());

    }
}
