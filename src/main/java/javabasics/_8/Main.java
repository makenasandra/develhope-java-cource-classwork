package javabasics._8;

import java.util.ArrayList; // import the ArrayList class

public class Main {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFour();
        exerciseFive();
    }

    private static void  exerciseOne(){
        int porridgeHeat = 60;

        if (porridgeHeat < 60){
            System.out.println("Porridge is too cold!");
        } else if (porridgeHeat > 60) {
            System.out.println("Porridge is too hot!");
        } else {
            System.out.println("Just right!");
        }
    }

    private static void  exerciseTwo(){
       double lunchPrice = 15.0;
       double remainingMoney = 5.0;

       if(lunchPrice<=remainingMoney){
           System.out.println("Lunch Time!");
       } else {
           System.out.println("You can go hungry today");
       }


    }

    private static void  exerciseThree(){
        double ourValue = 0.5;

        if (ourValue > 2.5){
            System.out.println("Greater than!");
        } else if (ourValue < 2.5) {
            ourValue += 1.0;
            if (ourValue < 2.5) {
                System.out.println("Still Less than!");
            } else {
                System.out.println("Now Greater than!");
            }
        }

    }

    private static void  exerciseFour(){
        int age = 75;

        if (age >= 65) {
            System.out.println("Retired");
        } else if (age >+ 35) {
            System.out.println("Experienced worker");
        } else if (age >= 18){
            System.out.println("New worker");
        } else {
            System.out.println("School age");
        }
    }

    private static void  exerciseFive(){
        String mySurname  = "Naniska";

        String msg =  mySurname.contains("ni")
                ? "Your surname contains the sequence of letters 'ni'"
                : "Your surname doesn't contain the sequence of letters 'ni'";

        System.out.println(msg);
    }


}
