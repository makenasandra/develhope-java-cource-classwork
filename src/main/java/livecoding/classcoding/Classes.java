package livecoding.classcoding;

/**
 * Inheritance - create a new class(subclass/derived/child class) from an existing class(super class,
 * Abstract class - not concrete and are usually ,meant to extended by a subclass.
 *   It is declared by using the abstract keyword
 * Interfaces - defines contract for classes to implement. Interfaces by default contain abstract methods and constants.
 *   Class uses implement keyword to implement interface. Classes can inherit from more than one Interfaces.
 */
public class Classes {
}

abstract class Shape{

    private int dimensions;

    abstract void draw();

    public void displayArea(){
        System.out.println("This shape has an area.");
    }
}

