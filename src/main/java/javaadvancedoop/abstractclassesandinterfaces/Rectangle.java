package javaadvancedoop.abstractclassesandinterfaces;

public class Rectangle extends Shape{

    Rectangle(double height, double width){
        this.width = width;
        this.height = height;
    }
    public double calculateArea(){
        return this.height * this.width;
    }
}
