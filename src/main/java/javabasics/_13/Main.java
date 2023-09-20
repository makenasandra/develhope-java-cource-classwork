package javabasics._13;

import java.util.regex.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
        exerciseThree();
    }

    private static void  exerciseOne() {
        System.out.println("\nExercise 1: ");

        System.out.println(convertCelsiusToFahrenheit(30));
    }

    static String convertCelsiusToFahrenheit(double tempInCelsius){
        double tempInFahrenheit = ((tempInCelsius*9)/5 ) +32;
        String conversionDescription = tempInCelsius + " Celsius is " + tempInFahrenheit + " fahrenheit";

        return conversionDescription;
    }

    private static void  exerciseTwo() {
        System.out.println("\nExercise 2: ");

        List<String> names = Arrays.asList("Alan  ", "Alice  ", "Ant0nio  ", "  Aziz");

        for (String n: names) {
            System.out.println(formatString(n));
        }
    }

    static String formatString(String name){

        if (Pattern.matches("\\D+", name)){
            return name.trim().toUpperCase();
        } else {
            return "invalid";
        }
    }

    private static void  exerciseThree() {
        System.out.println("\nExercise 3: ");

        double lunchPrice = 3.44;
        String lunchType = "sandwich";
        String description = "Two slices of bread and ham";
        int weight = 500;

        myLunchToday(lunchType, lunchPrice, weight, description);
    }

    static void myLunchToday(String lunchType, double lunchPrice, int weight, String description){
        System.out.println("Lunch Type: "+lunchType + "\nLunch Price: " + lunchPrice + "\nWeight in grams: "
                + weight + "\nDescription: " + description);
    }
}
