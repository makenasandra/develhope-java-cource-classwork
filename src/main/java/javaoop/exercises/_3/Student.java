package javaoop.exercises._3;


public class Student {
    private String name;
    private int age;

    private int admissionNumber;

    private String gender;

    private String grade;


    Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0){
            System.out.println("Cannot set negative age");
        } else {
            this.age = age;
        }
    }

    public int getAdmissionNumber() {
        return admissionNumber;
    }

    public void setGender(String gender){
        if(gender.equals("Female")  || gender.equals("Male")){
            this.gender = gender;
        } else {
            System.out.println("Cannot set gender!");
        }

    }
    public String getGender(){
        return gender;
    }

    public void setGrade(String grade){
        this.grade = grade;
    }

    public String getGrade(){
        return grade;
    }

    public void setAdmissionNumber(int admissionNumber) {
        if(age<=0){
            System.out.println("Cannot set negative admission number");
        } else {
            this.admissionNumber = admissionNumber;
        }
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age ;
    }
}
