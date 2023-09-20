package javaadvancedoop.abstractclassesandinterfaces;

public class Guitar extends Instrument{
    Guitar(String name,String brand){
        this.name = name;
        this.brand = brand;
    }
    @Override
    public void play(){
        System.out.println("Strumming the guitar...");
    }
}
