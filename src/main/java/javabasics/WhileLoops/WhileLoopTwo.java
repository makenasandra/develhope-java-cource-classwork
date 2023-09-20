package javabasics.WhileLoops;

import java.util.Random;
import java.util.Scanner;

public class WhileLoopTwo {
    public static void main(String[] args) {
        double number;

        Scanner userReader = new Scanner(System.in);

        boolean continueGame = true;

        while (continueGame){
            System.out.println("Welcome!");
            number = Math.round(Math.random() * (10-1) + 1);

            System.out.println("Guess a number: ");

            String userInput = userReader.nextLine();

//            System.out.println(number);

            if (Double.parseDouble(userInput) == number) {
                System.out.print("Congratulations!");
                continueGame = false;
            }
        }
    }
}
