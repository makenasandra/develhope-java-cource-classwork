package javaadvancedoop.abstractclassesandinterfaces;

/**
 *  Abstract Classes:
 *  • An abstract class is a class that cannot be instantiated directly. It serves as a base or
 *  parent class for other classes and provides common functionality and characteristics.
 *  • Abstract classes can contain both abstract and non-abstract methods. Abstract methods are
 *  declared without an implementation, while non-abstract methods have a defined implementation.
 *  • A class that extends an abstract class must implement all the abstract methods declared in
 *  the abstract class or be marked as abstract itself.
 *  • Abstract classes can have instance variables, constructors, and normal methods.
 *  • Abstract classes can be used to define a common interface and behavior among a group of related
 *  classes.
 *
 *  Interfaces: • An interface is a reference type in Java that defines a set of abstract methods
 *  that a class implementing the interface must provide.
 *  • Interfaces can also include constant fields, default methods (with a default implementation),
 *  and static methods. • A class can implement multiple interfaces, allowing for multiple inheritance
 *  of type. • Interfaces provide a way to achieve abstraction and ensure that classes implementing the
 *  interface adhere to a specific contract. • Interfaces are often used to define behaviors that can be
 *  implemented by different classes, promoting loose coupling and code modularity.
 *
 *   When to Use Abstract Classes vs. Interfaces:
 *   • Use an abstract class when you want to provide a common base implementation along with abstract
 *   methods that must be implemented by derived classes.
 *   • Use an interface when you want to define a contract or behavior that can be implemented by
 *   unrelated classes.
 *
 *   In Java, method overriding is a feature that allows a subclass to provide a different implementation
 *   of a method that is already defined in its superclass. This enables the subclass to inherit the
 *   method from the superclass but modify its behavior to suit its own specific needs.
 *
 *   To override a method in Java, the following conditions must be met:
 *   Inheritance: The subclass must inherit the method from its superclass. In other words, the method must be defined in the superclass and accessible to the subclass.
 *   Method Signature: The method in the subclass must have the same name, return type, and parameter list (including their types and order) as the method in the superclass.
 *   Access Modifier: The overridden method in the subclass cannot have a more restrictive access modifier than the method in the superclass. For example, if the superclass method is declared as public, the overridden method in the subclass can also be public but not private or protected.
 *  Exception Handling: The overridden method can throw the same exceptions as the superclass method or its subclasses. However, it should not throw any checked exceptions that are not declared in the superclass method. To override a method, you use the @Override annotation in the subclass to indicate that you intend to override a method from the superclass. This annotation helps the compiler verify that you are correctly overriding the method. Here's an example that demonstrates method overriding in Java:
 */

public class Main {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
        exerciseThree();
    }

    private static void exerciseOne() {
        System.out.println("\nExercise 1: ");

        Rectangle mstatili = new Rectangle(29, 12);
        System.out.println(mstatili.calculateArea());

        Circle duara = new Circle(68.9);
        System.out.println(duara.calculateArea());
    }

    private static void exerciseTwo() {
        System.out.println("\nExercise 2: ");

        Car gari = new Car();
        Boat meli = new Boat();

        gari.moveForward();
        gari.moveBackward();

        meli.moveBackward();
        meli.moveBackward();
    }
    private static void exerciseThree() {
        System.out.println("\nExercise 3: ");

        Piano piano = new Piano("Keyboard", "Yamaha");
        piano.play();

        Guitar guitar = new Guitar("Accoustic", "Yamaha");
        guitar.play();

    }
}
