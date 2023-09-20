package javaadvanced.JUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTesting {
    @Test
    void exerciseOne() {
        System.out.println("\nExercise 1: ");

        //addition test
        assertEquals(16, new Calculator().add(10,6));
        assertEquals(17, new Calculator().add(11,6));
        //subtraction test
        assertEquals(75, new Calculator().subtract(100,25));
        assertEquals(75, new Calculator().subtract(100,25));

    }

    @Test
    void exercise2() {
        System.out.println("\nExercise 2: ");

        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.divide(10,0));
    }

    @Test
    void exercise3() {
        System.out.println("\nExercise 3: ");

        Calculator calculator = new Calculator();
        assertEquals(1, calculator.power(10, 0));
        assertEquals(0, calculator.power(0, 12));

        assertEquals(1, calculator.power(-2, 12));
        assertEquals(1, calculator.power(5, 12));
        assertEquals(1, calculator.power(5, -2));
       ;
    }
}