package javabasics.for_loops;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFour();
        exerciseFive();
    }

    private static void  exerciseOne(){
        System.out.println("\nExercise 1: ");
        List<Integer> items = Arrays.asList(1, 56, 23);
//        System.out.println(items);

        int sumForA = 0;
        //find sum of elements in items list using for each loop
        for (Integer item: items) {
            sumForA += item;
        }


//        System.out.println("\nExercise 1b: ");
        int[] arrItems = new int[]{1, 56, 23};

        int sumForB = 0;
        for (Integer item: arrItems) {
            sumForB += item;
        }
//        System.out.println("\nExercise 1c: ");
        int sumForC = 0;

        for (int i = 0; i < items.size(); i++) {
            sumForC += items.get(i);
        }

        if(sumForA != sumForB ||  sumForB != sumForC){
            System.out.println("Failed! Sums are different!");
        } else {
            System.out.println("Success! Sums are the same!");
        }

    }

    private static void  exerciseTwo() {
        System.out.println("\nExercise 2: ");
        List<Integer> items = Arrays.asList(1, 56, 23, 300, 85, 55, 84);
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = 0;

        for (Integer item:items) {
            if(item<minNumber) minNumber = item;
            if(item>maxNumber) maxNumber = item;
        }

        System.out.printf("Max number:%d %nMin Number: %d %n",maxNumber, minNumber);

    }


    private static void  exerciseThree() {
        System.out.println("\nExercise 3: ");
        List<String> names = Arrays.asList("Alan", "Alice", "Antonia", "Aziz");

        for (int i = 0; i < 2; i++) {
           System.out.println(names.get(i));
        }
    }

    private static void  exerciseFour() {
        System.out.println("\nExercise 4: ");

        for (int timesTableCurrentValue = 8; timesTableCurrentValue <= 80; timesTableCurrentValue+= 8) {
            System.out.println(timesTableCurrentValue);
        }
    }

    private static void  exerciseFive() {
        System.out.println("\nExercise 5: ");

        int num = 5;
        for(int timesTableCurrentValue = 1; timesTableCurrentValue <= 10; ++timesTableCurrentValue)
        {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d \n", timesTableCurrentValue, j, timesTableCurrentValue * j);
            }

        }
    }
}
