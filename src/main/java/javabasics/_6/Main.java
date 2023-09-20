package javabasics._6;

public class Main {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFour();
    }

    private static void  exerciseOne(){
        double value = 49;
        double valueSquareRoot = Math.sqrt(value);
        System.out.println(valueSquareRoot);
    }

    private static void  exerciseTwo(){
        double valueA = 5;
        double valueB = 10;
        System.out.println("Max value: " + Math.max(valueA, valueB));
        System.out.println("Min value: " + Math.min(valueA, valueB));
    }

    private static void  exerciseThree(){
        int totalMoney = 50;
        int costPerFruit = 9;

        System.out.println("Remainder:" + totalMoney % costPerFruit);


    }

    private static void  exerciseFour(){
        double ourVal = 4.5;

        //Rounds up decimal
        System.out.println("ceiling: " + Math.ceil(ourVal));
        System.out.println("Floor: " + Math.floor(ourVal));
        System.out.println("Random: " + Math.random());

        double x = -2.5;
        double result1 = Math.abs(x); // Returns 2.5
        double result2 = Math.pow(x, 2); // Returns 6.25
        System.out.println(result1);
        System.out.println(result2);

    }
}
