package livecoding.classcoding.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void testAddition(){
        Calculator calculator = new Calculator(); // Arrange
        int result = calculator.add(9,23);  //Act
        assertEquals(32, result);
    }
}
