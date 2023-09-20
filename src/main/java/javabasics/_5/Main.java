package javabasics._5;

public class Main {
    public static void main(String[] args) {

        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFour();
        exerciseFive();


    }

    private static void  exerciseOne(){
        int num = 44;
        num++;
        System.out.println(num);
        num += 10;
        num --;
        System.out.println(num);
    }

    private static void  exerciseTwo(){
        double num = 45.98;
        num *= 2;
        System.out.println(num);

        double num2 = num/2;
        System.out.println(num2);
    }

    private static void  exerciseThree(){
        double celsius = 37.9;
        var fahrenheit = celsius * 1.8 + 32;
        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }

    private static void  exerciseFour(){
        int age = 10;
        age += 15;
        System.out.println(age);

    }

    private static void  exerciseFive(){
        int age = 50;
        age -= age;
        System.out.println(age);

        int secondAge = 50;
        secondAge = secondAge - 50;
        System.out.println(secondAge);

    }
}
