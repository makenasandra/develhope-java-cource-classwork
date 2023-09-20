package javaoop.exercises._1;

public class Student {
    String name;
    int age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age ;
    }
}
