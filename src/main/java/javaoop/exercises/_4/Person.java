package javaoop.exercises._4;

public class Person {
    private String name;
    private String surname;
    private double height;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public String getHeight(){
        return String.format("%.2f", height);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
