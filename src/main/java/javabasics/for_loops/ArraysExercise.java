package javabasics.for_loops;

import java.util.Arrays;

public class ArraysExercise {
    public static void main(String[] args) {
        String[] aliceToDos = { "Coding", "Reading", "Learning"};
        String[] bobToDos = {"Reading", "Coding", "Learning", "Sleeping"};
        String[] timToDos ={"Reading", "Learning", "Coding"};

        System.out.println("Is Alice's array equal to Bob array?: " + Arrays.equals(aliceToDos, bobToDos));
        System.out.println("Is Alice's array equal to Tim array?: " + Arrays.equals(aliceToDos, timToDos));
        System.out.println("Is Alice's array having the same length of Bob's array?: " + (aliceToDos.length==bobToDos.length));
        System.out.println("Is Alice's array having the same length of Tim's array?: " + (timToDos.length==aliceToDos.length));

    }
}
