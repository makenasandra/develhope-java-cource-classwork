package javabasics._7;

public class Main {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFour();
    }

    private static void  exerciseOne(){
        String season = "Winter";
    }

    private static void  exerciseTwo(){
        String firstName = "Winter";
        String middleName = "Mathslon";
        String lastName = "Turing";

        System.out.println(firstName.toUpperCase() + " " + middleName.toLowerCase() + " " + lastName.toUpperCase());
    }

    private static void  exerciseThree(){
        double num = 1.5;
        int num2 = 67;
        boolean num3 = true;
        String textFrom2Primitives = String.valueOf(num) + num2 + num3;
        System.out.println(textFrom2Primitives);
    }

    private static void  exerciseFour(){
        String endNum = "7 8 9";
        String middleNum = "      4 5 6";
        String earlyNum = "1 2 3";

        System.out.println(earlyNum + " " + middleNum.trim() + " " + endNum );
    }
}
