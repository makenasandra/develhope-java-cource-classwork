package javaadvanced._4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class HandlingExceptions {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exercise4();
    }
    private static void exerciseOne() {
        System.out.println("\nExercise 1: ");

        try {
            Files.createFile(Path.of("test1.txt"));
        } catch (IOException e){
            e.printStackTrace();
//            System.exit(0);
        }
    }
    private static void exerciseTwo() {
        System.out.println("\nExercise 2: ");

        String filename = "test.csv";
        try{
            Files.readString(Path.of(filename));
        }
        catch (IOException e) {
            System.out.println("File could not be found!");
        }

    }
    private static void exerciseThree() {
        System.out.println("\nExercise 3: ");

        try{
            Integer parsedInt = Integer.parseInt("yu");
        } catch (NumberFormatException e){
            System.out.println("Input was not a valid integer!");
        }

    }

    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        Double num1 = 10.0;
        Integer num2 = 0;
        Integer num = 8;

        try{
            System.out.println(num/num2);
        } catch (ArithmeticException e){
            e.printStackTrace();
            System.exit(0);
        }
    }
}
