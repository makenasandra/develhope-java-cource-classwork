package livecoding.exercises.junit;

import livecoding.classcoding.junit.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
     @Test
     public void testAddition(){
         MathUtils calculator = new MathUtils(); // Arrange
         int result1 = calculator.add(9,23);  //Act
         int result2 = calculator.add(30, 24);
         assertEquals(32, result1);
         assertEquals(232, result2);
     }

    @Test
    public void testSub(){
        MathUtils calculator = new MathUtils(); // Arrange
        int result = calculator.subtract(9,23);  //Act
        assertEquals(32, result);
    }

    @Test
    public void testMultiplication(){
        MathUtils calculator = new MathUtils(); // Arrange
        int result = calculator.multiply(9,3);  //Act
        assertEquals(27, result);
    }

    @Test
    public void testDivision(){
        MathUtils calculator = new MathUtils(); // Arrange
        assertThrows(ArithmeticException.class, ()->calculator.divide(19,0));
    }

}