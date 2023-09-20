package javabasics._live_coding;

import java.util.ArrayList;
import java.util.List;

//Create a class called Student with attributes such as name, roll number, and grade. Implement a constructor to
// initialize the student objects. Utilize lists or other suitable data structures to manage the collection of
// students. Enhance the program by allowing user to remove a student from the system, update student details
// and calculate the highest grade among all students 

public class Ex2606 {
    public static void main(String[] args){
        List<Student> studentList= new ArrayList<Student>();

        var student1 = new Student("Sammy", 70089, 32.9);
        studentList.add(student1);

    }


}

class Student{
    String name;
    int rollNumber;
    double grade;

    public Student(String name, int rollNumber, double grade){
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public void updateStudentDetails(String newName, int newRollNumber, double newGrade){
        this.name = newName;
        this.rollNumber = newRollNumber;
        this.grade = newGrade;
    }

    public void addNewStudent(String name, int rollNumber, double grade){
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }
}
