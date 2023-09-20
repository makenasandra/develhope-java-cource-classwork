package javaoop.exercises._5;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercises {
    public static void main(String[] args){
        exerciseOne();
//        exerciseTwo();
//        exerciseThree();
//        exerciseFour();
    }

    private static void  exerciseOne() {
        System.out.println("\nExercise 1: ");
        int totalCount = 0;
        int luckyRolls = 0;

        for (int i = 0; i < 100; i++) {
            while(rollD6() == 6){
                luckyRolls++;
            }
            totalCount += luckyRolls;
            luckyRolls = 0;
        }
        System.out.println(totalCount);
    }

    private static final Random random = new Random();

    private static int rollD6(){
        return random.nextInt(6)+1;
    }
    private static void  exerciseTwo() {

    }

    private static void  exerciseThree() {
        System.out.println("\nExercise 3: ");
        ExerciseLunch exerciseLunch = null;
        exerciseLunch = new ExerciseLunch(2.55, "Tuesday");
        ExerciseLunch.printMaxPrice();

    }

    private static void  exerciseFour() {
        System.out.println("\nExercise 4: ");
        final  List<String> weeksOfTheYear = new ArrayList<String>();
    }
}

