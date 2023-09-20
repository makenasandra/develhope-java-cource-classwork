package javaoop.exercises._1;

import java.util.ArrayList;
import java.util.List;

public class Course {
    String courseName;
    int maxStudents;
    int qualityRatingOutOf18;

    String getCourseDescription;

    List<Student> students;

    public Course(){
        this.students = new ArrayList<>();
    }

}
