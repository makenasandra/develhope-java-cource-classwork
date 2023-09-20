package javabasics;

//Exercise - Input and output
//        add the following import at the beginning of your program: import java.util.Scanner
//create a class called PrintYourAgeFromInput
//        inside the main method place the following lines of code: ``` Scanner input = new Scanner(System.in); // create a new Scanner
//// task 1: remove this comment and write one line of code here
//
//        int age = input.nextInt(); // read the integer number input from user
//
//// task 2: remove this comment and write one line of code here
//
//        input.close(); // close the scanner (do not read anymore the user input)


import java.util.Scanner;

public class PrintYourAgeFromInput {
    public static void main(String[] args) {
        // create a new Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        // read the integer number input from user
        int age = input.nextInt();
        // close the scanner (do not read anymore the user input)
        input.close();

        System.out.printf("%d is your age", age);
    }
}
