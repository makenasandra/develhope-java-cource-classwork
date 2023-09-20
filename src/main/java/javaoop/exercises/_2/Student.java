package javaoop.exercises._2;

public class Student {
    String name;
    int age;

    Student(String name, Integer age) {
        System.out.println("Constructing");
        this.name = name;
        this.age = age;
        System.out.println("Constructed");
    }

    Student (String name){
        this.name = name;
    }

    public Student (int age){
        this.age = age;
    }

    public Student (){
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age ;
    }
}

