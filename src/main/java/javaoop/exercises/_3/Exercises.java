package javaoop.exercises._3;

public class Exercises {
    public static void main(String[] args){
        exerciseOne();
        exerciseTwo();
    }

    private static void  exerciseOne() {
        System.out.println("\nExercise 1: ");

        Student student1 = new Student();

        student1.setAge(33);
        student1.setName("Mandy");
        student1.setGender("Female");
        student1.setAdmissionNumber(20988);

        student1.setGrade("A");

        System.out.println("Student Info:\n" +
                student1.getName()+ "\n" +
                student1.getAge()+ "\n" +
                student1.getGender()+ "\n" +
                student1.getAdmissionNumber()+ "\n" +
                student1.getGrade());
    }
    private static void  exerciseTwo() {
        System.out.println("\nExercise 2: ");

        Student student2 = new Student();
        student2.setAge(-33);
        student2.setAdmissionNumber(-100);
        student2.setGender("Other");

        System.out.println("Student Info:\n" +
                student2.getAge()+ "\n" +
                student2.getGender()+ "\n" +
                student2.getAdmissionNumber());
    }
}
