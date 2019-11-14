package wildfarm.animal;


import wildfarm.animalAbstact.Mammal;
import wildfarm.foods.Food;
import wildfarm.foods.Vegetable;

public class Mouse extends Mammal {
    private String livingRegion;
    private Mouse(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food food) {
        if (!(food instanceof Vegetable)) {
            throw new IllegalArgumentException(String.format("%s are not eating that type of food!", this.getAnimalName()));
        }
    }
}
