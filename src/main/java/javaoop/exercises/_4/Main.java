package javaoop.exercises._4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Person person1 = new Person();
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name: ");
        person1.setName(myObj.nextLine());

        System.out.println("Enter surname: ");
        person1.setSurname(myObj.nextLine());

        System.out.println("Enter height: ");
        person1.setHeight(Double.valueOf(myObj.nextLine()));

        System.out.println("Enter age: ");
        person1.setAge(Integer.valueOf(myObj.nextLine()));

        System.out.println(person1);

    }
}
