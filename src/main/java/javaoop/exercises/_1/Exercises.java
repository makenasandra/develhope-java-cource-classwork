package javaoop.exercises._1;

import java.util.Arrays;
import java.util.List;
import java.util.SimpleTimeZone;

public class Exercises {
    public static void main(String[] args){
        exerciseTwo();
        exerciseThree();
    }

    private static void  exerciseTwo() {
        System.out.println("\nExercise 2: ");

        List<String> studentNames = Arrays.asList("Alica", "Argon", "ALex");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);

        Student student1, student2, student3;
        for (int i = 0; i < studentNames.size(); i++) {
            student1 = createNewStudent(studentNames.get(i), studentAges.get(i));
            System.out.println(student1);
        }
    }

    private static Student createNewStudent(String name, Integer age){
        Student student = new Student(name, age);

        return student;
    }


    private static void  exerciseThree() {
        System.out.println("\nExercise 3: ");
        List<String> studentNames = Arrays.asList("Alica", "Argon", "ALex");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);

        Course develCourse = new Course();

        for (int i = 0; i < studentNames.size(); i++) {
            Student learner = createNewStudent(studentNames.get(i), studentAges.get(i));
            develCourse.students.add(learner);
        }

        System.out.println(develCourse.students);

        //get average age of students
        int ageSum = 0;

        for (Student s: develCourse.students) {
            ageSum += s.age;
        }

        double averageAge = ageSum/develCourse.students.size();

        System.out.println("Average Student age is = " + averageAge);

    }

}
