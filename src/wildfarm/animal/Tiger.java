package wildfarm.animal;

import wildfarm.animalAbstact.Felime;

import wildfarm.foods.Food;
import wildfarm.foods.Vegetable;

public class Tiger extends Felime {
    protected Tiger(String animalName, String animalType, Double animalWeight, Integer foodEaten) {
        super(animalName, animalType, animalWeight, foodEaten);
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            throw new IllegalArgumentException(String.format("%s are not eating that type of food!",this.getAnimalName()));
        }
    }
}
