package livecoding.exercises;

/**
 * Suppose you are developing a calculator program in Java.
 * Implement a method called divideNumbers() that accepts two integers as parameters
 * and returns the result of dividing the first number by the second number.
 * However, handle the potential exceptions that might occur during the division process.
 * If the second number is zero, throw a custom exception called DivideByZeroException.
 * In the main() method, call the divideNumbers() method with different inputs,
 * and handle any exceptions that may arise
 */
public class EnumCalculator {
    public static void main(String[] args) {
        try{
            System.out.println("Result 1: " + divideNumbers(10,2));
            System.out.println("Result 2: " + divideNumbers(10,0));
        } catch (DivideByZeroException e){
            System.out.println("Exception caught: " + e.getMessage());
        }

    }

    private static int divideNumbers(int num1, int num2) throws DivideByZeroException{
        if (num2 == 0) {
            throw new DivideByZeroException("Cannot divide by zero.");
        }
        return num1/num2;
    }
}
