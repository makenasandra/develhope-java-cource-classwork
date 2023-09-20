package livecoding.exercises;
/**
 * Imagine you are developing a game that involves different player classes.
 * Each player class has a unique skill associated with it. Design an enum for the player
 * classes and create a method that returns the skill based on the selected player class.
 * Handle any exceptions that might occur during the process
 */

import java.util.Scanner;

public class EnumGameExercise {
    enum PlayerClasses{WARRIOR, MAGE, ARCHER}

    public static void main(String[] args) {
        try{
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Enter player class: ");
            String userInput = myScanner.nextLine().toUpperCase();
            PlayerClasses playerClass = PlayerClasses.ARCHER;
            System.out.println(printSkill(PlayerClasses.valueOf(userInput)));
        } catch (IllegalArgumentException  e){
            System.out.println("Error is: "+e.getMessage());
        }
    }

    public static String printSkill(PlayerClasses playerClass){
        switch (playerClass){
            case WARRIOR:
                return "Skill: Sword Attack";
            case MAGE:
                return " Skill: Fireball";
            case ARCHER:
                return "Skill: wPrecision Shot";
        }

        return null;
    }
}
