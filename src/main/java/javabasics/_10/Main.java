package javabasics._10;

public class Main {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
        exerciseThree();


    }

    private static void  exerciseOne(){
        System.out.println("\nExercise 1: ");
        String fastFoodOrder = "hamburger";
        double orderCost = 0;
        int orderCalories = 0;

        switch (fastFoodOrder) {
            case "hamburger":
                orderCalories = 700;
                orderCost = 5.99;
                break;
            case "milkshake":
                orderCalories = 600;
                orderCost = 2.50;
                break;
            case "cheeseburger":
                orderCalories = 850;
                orderCost = 7.99;
                break;
            case "fries":
                orderCalories = 250;
                orderCost = 3.99;
                break;

        }

        System.out.printf("Order receipt:  %nOrder Item: %s %nOrderCalories: %d %nOrderCOst: %f %n",
                fastFoodOrder, orderCalories, orderCost
        );

    }

    private static void  exerciseTwo(){
        System.out.println("\nExercise 2: ");

        int inputNumber = 7;

        switch (inputNumber) {
            case 2:
                System.out.println("This is the 8th largest prime number under 20");
                break;
            case 3:
                System.out.println("This is the 7th largest prime number under 20");
                break;
            case 5:
                System.out.println("This is the 6th largest prime number under 20");
                break;
            case 7:
                System.out.println("This is the 5th largest prime number under 20");
                break;
            case 11:
                System.out.println("This is the 4th largest prime number under 20");
                break;
            case 13:
                System.out.println("This is the 3rd largest prime number under 20");
                break;
            case 17:
                System.out.println("This is the 2nd largest prime number under 20");
                break;
            case 19:
                System.out.println("This is the largest prime number under 20");
                break;
            default:
                System.out.println("Invalid entry!");
        }


    }

    private static void  exerciseThree(){
        System.out.println("\nExercise 3 -----");
        int inputNumber = 7;

        switch (inputNumber) {
            case 2 -> System.out.println("This is the 8th largest prime number under 20");
            case 3 -> System.out.println("This is the 7th largest prime number under 20");
            case 5 -> System.out.println("This is the 6th largest prime number under 20");
            case 7 -> System.out.println("This is the 5th largest prime number under 20");
            case 11 -> System.out.println("This is the 4th largest prime number under 20");
            case 13 -> System.out.println("This is the 3rd largest prime number under 20");
            case 17 -> System.out.println("This is the 2nd largest prime number under 20");
            case 19 -> System.out.println("This is the largest prime number under 20");
            default -> System.out.println("Invalid entry!");
        }

    }





}

