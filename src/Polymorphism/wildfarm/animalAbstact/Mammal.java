package Polymorphism.wildfarm.animalAbstact;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;

    protected Mammal(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight);

        this.livingRegion = livingRegion;
    }

    protected String getLivingRegion() {
        return livingRegion;
    }

    public String toString() {
        return String.format("%s[%s, %s, %s, %d]",this.getAnimalType(),this.getAnimalName(),new DecimalFormat("#.##").format(this.getAnimalWeight() ),
                this.livingRegion, this.getFoodEaten());
    }
}
