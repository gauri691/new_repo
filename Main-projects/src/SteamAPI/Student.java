package SteamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Student {
    String name;
    String gender;
    String grade;
    int rollNo;
    String studentClass;
    Student(int rollNo,String name,String gender,String studentClass,String grade){
        this.name=name;
        this.grade=grade;
        this.rollNo=rollNo;
        this.gender=gender;
        this.studentClass=studentClass;
    }
    public int getRollNo(){
        return rollNo;
    }
    public String getGrade(){
        return grade;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public String getStudentClass(){
        return studentClass;
    }
    public String toString() {
       return "Roll Number: "+getRollNo()+" Name: "+getName()+" Gender: "+getGender()+" Student class: "+getStudentClass()+" Grade: "+getGrade();
    }
}

 class Main{
    public static void main(String[]args){
        List<Student> students = Arrays.asList(
                new Student(1, "Gauri", "Female", "10A", "A+"),
                new Student(2, "Aleena", "Female", "10B", "B"),
                new Student(3, "Navin", "Male", "10A", "C"),
                new Student(4, "Abhimanyu", "Male", "10C", "A"),
                new Student(5, "Nayonika", "Female", "10B", "B")
        );
        Predicate<Student> isFemale= s->"Female".equals(s.getGender());
        Predicate<Student> Grade= s->"A+".equals(s.getGrade()) || "A".equals(s.getGrade()) || "B".equals(s.getGrade());
        System.out.println("ALL FEMALE STUDENTS");
        students.stream().filter(isFemale).forEach(System.out::println);
        System.out.println("ALL STUDENTS WITH GRADE A+,A and B");
        students.stream().filter(Grade).forEach(System.out::println);
    }
}
