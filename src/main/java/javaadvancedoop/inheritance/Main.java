package javaadvancedoop.inheritance;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
        exerciseThree();
    }

    private static void exerciseOne() {
        System.out.println("\nExercise 1: ");

        Dog ubwa = new Dog(0.5, 2.5, Set.of(DogBreeds.BULLDOG));

        System.out.println(ubwa.getDogBreedsSet());
    }

    private static void exerciseTwo() {
        System.out.println("\nExercise 2: ");

        Bird ndege = new Bird(0.1, 0.3, 0.012);
        Fish samaki = new Fish(2, 1.78, Set.of(FishSpecies.TROUT));

        System.out.println(ndege.getWingSpan());
        System.out.println(samaki.getFishSpeciesSet());
    }

    private static void exerciseThree() {
        System.out.println("\nExercise 3: ");

        Bird ndege = new Bird(0.1, 0.3, 0.018);
        Fish samaki = new Fish(2, 1.78, Set.of(FishSpecies.BLUEGILL));
        Dog luca = new Dog(1.5, 30, Set.of(DogBreeds.GERMAN_SHEPHERD));

        String fastestAnimal;
        double speed;

        if(luca.runSpeedInMetersPerSecond() > ndege.flySpeedInMetersPerSecond() && luca.runSpeedInMetersPerSecond() > samaki.swimSpeedInMetersPerSecond()){
            fastestAnimal = "luca";
            speed = luca.runSpeedInMetersPerSecond();
        } else if (samaki.swimSpeedInMetersPerSecond() > ndege.flySpeedInMetersPerSecond() && samaki.swimSpeedInMetersPerSecond() > luca.runSpeedInMetersPerSecond()){
            fastestAnimal = "samaki";
            speed = samaki.swimSpeedInMetersPerSecond();
        } else {
            fastestAnimal = "ndege";
            speed = ndege.flySpeedInMetersPerSecond();
        }

        System.out.println("The animal with the fastest movement speed is: " + fastestAnimal + " with a speed of: " + speed + "m/s");

    }
}
