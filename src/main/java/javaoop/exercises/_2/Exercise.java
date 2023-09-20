package javaoop.exercises._2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise {
    public static void main(String[] args){
        exerciseTwo();
        exerciseThree();
    }

    private static void  exerciseTwo() {
        System.out.println("\nExercise 2: ");

        List<String> studentNames = Arrays.asList("Alica", "Argon", "ALex");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < studentNames.size(); i++) {
            Student std = new Student(studentNames.get(i), studentAges.get(i));
            students.add(std);
            System.out.println(std);
        }
    }


    private static void  exerciseThree() {
        System.out.println("\nExercise 3: ");
        List<String> studentNames = Arrays.asList("Alica", "Argon", "ALex");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);
        List<Student> students = Arrays.asList(
                new Student("Alison", 33),
                new Student("Bob"),
                new Student(23),
                new Student()
        );


        System.out.println(students);

    }

}

