package javabasics._9;

public class Main {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFour();

    }

    private static void  exerciseOne(){
       double temp = 25;
       double isWarmTemp = 20;
       boolean isWarm = temp >= isWarmTemp;
       boolean wearingShorts = true;

       if (isWarm && wearingShorts || (!isWarm && !wearingShorts)){
           System.out.println("Comfortable clothes");
       } else {
           System.out.println("Uncomfortable clothes");
       }

    }

    private static void  exerciseTwo(){
        String shoeType = "fancy";

        int age = 30;
        double pocket = 17.5;
        double entry = 10;

        if (shoeType.equals("fancy") && age > 18 && pocket >= entry) {
            System.out.println("Come in");
        } else {
            System.out.println("Stay out");
        }


    }

    private static void  exerciseThree(){
        System.out.println("\nExercise 3 - Test Grader");
        double ourTestScore = 3;
        double maxTestScore = 10;
        boolean isTestRetry = false;
        double grade = ourTestScore/maxTestScore *100;

        if(isTestRetry){
            System.out.println("C");
        } else if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else if (grade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }

    private static void  exerciseFour(){
        System.out.println("\nExercise 4 - Test Grader");

        boolean carFromLeft = true;
        boolean carFromRight = false;

        if(carFromLeft ^ carFromRight){
            System.out.println("safe");
        } else {
            System.out.println("CRASH!");
        }

    }



}
