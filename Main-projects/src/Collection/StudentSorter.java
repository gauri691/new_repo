
package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.ToDoubleFunction;

class Student {
    private String name;
    private int id;
    private double mark;

    public Student(String name, int id, double mark) {
        this.name = name;
        this.id = id;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMark() {
        return mark;
    }

    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', marks=" + mark + "}";
    }
}

class Marks implements Comparator<Student> {
    public int compare(Student S1, Student S2) {
        return Double.compare(S2.getMark(), S1.getMark());
    }
}

public class StudentSorter {
    public static void main(String[]args){
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("gauri",1,100));
        students.add(new Student("nayonika",2,76));
        students.add(new Student("navin",3,10));
        students.add(new Student("abhimanyu",4,100));
        students.add(new Student("aleena",5,1));
        System.out.println("the list of students:");
        for(Student str:students) {
            System.out.println(str);
        }
            Collections.sort(students, new Marks());

            System.out.println("\nSorted List of Students (Descending Order of Marks):");
            for(Student string:students){
                System.out.println(string);
            }
        }
    }


