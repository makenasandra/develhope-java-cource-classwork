package javabasics.for_loops;

//use a for-loop to print the first 10 numbers of the Fibonacci sequence
public class FibonacciSequence {

    public static void main(String[] args) {

        int firstNum = 0;
        int nextNum = 1;
        int n = 10;
        for (int i = 0; i < n; i++) {

            int currentNum = firstNum + nextNum;

            System.out.printf("%d, ", firstNum);

            firstNum = nextNum;
            nextNum = currentNum;

        }

    }

}
