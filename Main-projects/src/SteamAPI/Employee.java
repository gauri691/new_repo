package SteamAPI;

import java.lang.classfile.AnnotationValue;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Employee {
    int id;
    String name;
    String gender;
    int age;
    String department;
    int yearOfJoin;
    double salary;

    public Employee( int id,String name,int age,String gender,String department,int yearOfJoin,double salary){
        this.id=id;
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.department=department;
        this.yearOfJoin=yearOfJoin;
        this.salary=salary;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
    public String getDepartment(){
        return department;
    }
    public int getYearOfJoin(){
        return yearOfJoin;
    }
    public double getSalary(){
        return salary;
    }
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', age=" + age + ", gender='" + gender + "', department='" + department + "', yearOfJoining=" + yearOfJoin + ", salary=" + salary + "}";
    }
}
 class Employe{
    public static void main(String[]args){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Gauri", 30, "Female", "HR", 2015, 55000));
        employees.add(new Employee(102, "Navin", 28, "Male", "Engineering", 2017, 70000));
        employees.add(new Employee(103, "Aleea", 25, "Female", "Engineering", 2019, 80000));
        employees.add(new Employee(104, "Diana", 40, "Female", "Finance", 2010, 90000));
        employees.add(new Employee(105, "Eve", 35, "Female", "HR", 2013, 60000));
        employees.add(new Employee(106, "Abhimanyu", 24, "Male", "Engineering", 2020, 65000));
        employees.add(new Employee(107, "Nayonika", 29, "Female", "Finance", 2018, 75000));
        employees.add(new Employee(108, "Hank", 50, "Male", "Engineering", 2005, 95000));
        Set<String>departments=employees.stream().map(Employee::getDepartment).collect(Collectors.toSet());
        System.out.println("DEPARTEMENTS IN THE ORGANIZATION:"+departments);
        System.out.println(" ");

        double avgMale=employees.stream().filter(emp -> emp.getGender().equals("Male")).mapToInt(Employee::getAge).average().orElse(0);
        System.out.println("AVERAGE AGE OF MALES IN THE ORGANIZATION: "+avgMale);
        double avgFemale=employees.stream().filter(emp -> emp.getGender().equals("Female")).mapToInt(Employee::getAge).average().orElse(0);
        System.out.println("AVERAGE AGE OF FEMALE IN THE ORGANIZATION: "+avgFemale);
        System.out.println(" ");

        Employee highestSalary=employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
        System.out.println("HIGHEST SALARY IS"+highestSalary);
        System.out.println(" ");

        List<String> departmentList=employees.stream().map(Employee::getDepartment).collect(Collectors.toList());
        for (String dept : departments) {
            long count = departmentList.stream().filter(d -> d.equals(dept)).count();
            System.out.println("Number of employees in " + dept + ": " + count);
        }
        System.out.println(" ");

            List<Employee> yougerEmploye=employees.stream().filter(emp->emp.getAge()<=25).collect(Collectors.toList());
            System.out.println("EMPLOYEES WHO ARE 25 YEARS OR YOUNGER: " +yougerEmploye);
            List<Employee> olderEmploye=employees.stream().filter(emp->emp.getAge()>25).collect(Collectors.toList());
            System.out.println("EMPLOYEES WHO ARE 25 OLDER THAN 25 YEARS: " +olderEmploye);
        }
    }

