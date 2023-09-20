package javabasics.for_loops;

import java.util.Arrays;

public class ExerciseArr {
    public static void main(String[] args) {
        String[] arr ={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (int i = 0; i < arr.length; i+=2) {
            arr[i] = arr[i].toUpperCase();
        }
        System.out.println(Arrays.toString(arr));
    }
}
