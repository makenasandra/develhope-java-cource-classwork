package javaadvancedoop.abstractclassesandinterfaces;

public class Circle extends Shape{
    Circle(double height){
        this.height = height;
    }
    public double calculateArea(){
        return Math.PI * Math.pow((this.height/2), 2);
    }


}
