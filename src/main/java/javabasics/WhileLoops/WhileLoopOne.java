package javabasics.WhileLoops;

public class WhileLoopOne {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 1;

        int i = 1;

        while (i<=10){
            int currentNumber = firstNumber + secondNumber;

            System.out.printf("%d, ", firstNumber);
            firstNumber = secondNumber;
            secondNumber = currentNumber;

            i++;
        }
    }
}
