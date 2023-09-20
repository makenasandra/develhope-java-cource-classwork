# Records, ternary operator, BigInteger

## 1. Records: 
Records are a new feature introduced in Java 14 (preview) and later finalized in Java 16. They provide a concise way to declare classes that are primarily used for holding immutable data. With records, you can declare a class with just a few lines of code, and the compiler automatically generates the necessary constructors, accessors (getters), equals(), hashCode(), and toString() methods. Records promote immutability and simplify the creation of simple data-holding classes, reducing boilerplate code. Example of a record in Java:
public record Person(String name, int age) {}

The above code declares a record named Person with two components: name of type String and age of type int. The record automatically generates a constructor, accessors, equals(), hashCode(), and toString() methods based on the components. 
## 2. Ternary Operator: 
The ternary operator (also known as the conditional operator) is a shorthand way to write simple conditional expressions in Java. It takes three operands and evaluates a boolean expression. If the expression is true, the operator returns the value of the second operand; otherwise, it returns the value of the third operand. Syntax of the ternary operator:

condition ? value_if_true : value_if_false

Example usage of the ternary operator:

int x = 10;
int result = (x > 5) ? 1 : -1;
System.out.println(result); // Output: 1
In the above example, if the condition (x > 5) is true, the result variable will be assigned the value 1. Otherwise, it will be assigned the value -1. 

## 3. BigInteger: 
BigInteger is a class in Java's java.math package that provides arbitrary-precision integer arithmetic. It allows you to perform mathematical operations on integers of any size, limited only by the available memory. Unlike primitive integer types (int, long), BigInteger can handle numbers of any magnitude, making it useful for working with large numbers or when precise calculations are required. Example usage of BigInteger:

import java.math.BigInteger;
public class Main {
public static void main(String[] args) {
BigInteger num1 = new BigInteger("12345678901234567890");
BigInteger num2 = new BigInteger("98765432109876543210");
BigInteger sum = num1.add(num2);
System.out.println(sum); // Output: 111111111011111111100
}
}
In the above example, BigInteger objects num1 and num2 are created with large numbers. The add() method is then used to perform addition, and the result is printed. BigInteger provides a wide range of methods for arithmetic operations, comparisons, conversions, and more. These are just brief explanations of records, the ternary operator, and BigInteger in Java. Each topic has more details and advanced usage that you can explore further in the official Java documentation or other Java learning resources.
