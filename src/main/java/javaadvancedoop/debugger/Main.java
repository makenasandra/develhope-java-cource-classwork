package javaadvancedoop.debugger;

import org.testng.Assert;
import org.junit.jupiter.api.Assertions;

import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        exerciseOne();
        exerciseTwo();
        exerciseThree();
    }
    private static void exerciseOne() {
        System.out.println("\nExercise 1: ");
        int number  = 5;
        int factorial = calculateFactorial(number);
        Assertions.assertEquals(120, factorial);
    }

    private static int calculateFactorial(int number) {
        int result = 1;
        for (int i = number; i >= 1 ; i--) {
            result *= i;
        }
        return result;
    }

    private static void exerciseTwo() {
        System.out.println("\nExercise 2: ");

        String input = "hello";

        String reversedString = reverseString(input);

        Assertions.assertEquals("olleh", reversedString);
    }

    private static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length()-1; i >=0; i--) {
           reversed += input.charAt(i);
        }
        return reversed;
    }

    private static void exerciseThree() {
        System.out.println("\nExercise 3: ");

        Assertions.assertFalse(isPositive(-5));
        Assertions.assertTrue(isPositive(15));
    }

    private static boolean isPositive(int num) {
        return num >=0;
    }
}

