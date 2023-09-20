package javaadvancedoop.abstractclassesandinterfaces;

public class Piano extends Instrument{
    Piano(String name,String brand){
        this.name = name;
        this.brand = brand;
    }
    @Override
    public void play(){
        System.out.println("Playing the piano...");
    }
}
