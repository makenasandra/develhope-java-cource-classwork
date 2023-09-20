package javabasics._3;

public class Main {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
        exerciseThree();
    }

    private static void exerciseOne(){
        System.out.print("G, ");
        System.out.println("M");
    }

    private static void exerciseTwo(){
        System.out.println(28);
        System.out.println(true);
        System.out.println(4.99);
    }

    private static void exerciseThree(){
        int age = 28;
        boolean hasHadLunchToday = true;
        double lunchPrice = 4.99;
        System.out.print("My age is ");
        System.out.println(age);
        System.out.print("Have I eaten Lunch today? ");
        System.out.println(hasHadLunchToday);
        System.out.print("The lunch price was ");
        System.out.println(lunchPrice);
    }
}
