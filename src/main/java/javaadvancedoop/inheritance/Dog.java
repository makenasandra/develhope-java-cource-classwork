package javaadvancedoop.inheritance;

import java.util.Set;
public class Dog extends Animal{

    private Set<DogBreeds> dogBreedsSet;
    public Dog(double height, double weight, Set dogBreedsSet) {
        super(height, weight);
        this.dogBreedsSet = dogBreedsSet;
    }

    public Set<DogBreeds> getDogBreedsSet() {
        return dogBreedsSet;
    }

    public void setDogBreedsSet(Set<DogBreeds> dogBreedsSet) {
        this.dogBreedsSet = dogBreedsSet;
    }

    public double runSpeedInMetersPerSecond(){
        return height * 2;
    }
}
