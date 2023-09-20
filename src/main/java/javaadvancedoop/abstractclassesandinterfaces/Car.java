package javaadvancedoop.abstractclassesandinterfaces;

public class Car implements Movable{
    @Override
    public void moveForward(){
        System.out.println("Moving forward...");
    }

    @Override
    public void moveBackward(){
        System.out.println("Moving backward...");
    }
}
