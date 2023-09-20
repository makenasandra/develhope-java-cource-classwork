package javabasics.for_loops;

//Exercise - For Loop
//        define a class CustomNumber that has:
//        an instance variable called number
//        a constructor that generates and prints a random number between 1 and 12 and assigns it to number
//        a method called getMultiplicationTable that prints all the multiplication table for number in descending order (from 12 to 1)
//        define a testing class where you create a CustonNumber and call the method

public class TestCustomNumber {
    public static void main(String[] args) {
        System.out.println("\nExercise 1: ");
        CustomNumber customNum = new CustomNumber(3);

        customNum.getRandomNumber();
    }
}

class CustomNumber {
    double number;

    public CustomNumber(double number) {
        this.number = number;
    }
    public void getRandomNumber(){
        int max = 12;
        int min = 1;
        this.number = Math. random() * ((max-min)+1) + min;
        System.out.println(this.number);
    }

    public void getMultiplicationTable(){
        for (int i = 12; i > this.number; i--) {
            System.out.println(this.number * i);
        }
    }


}
