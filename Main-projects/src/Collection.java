import java.util.*;
import java.util.ArrayList;
public class Collection {
    String name;
    int id;
    int salary;

    public Collection(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayCollection() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }

    public int getId() {
        return id;
    }
}

class CRUD{
    public static ArrayList<Collection> employe=new ArrayList<Collection>();
    public static Scanner sc=new Scanner(System.in);

    public static void addEmployee(){
        System.out.println("Enter the name:");
        String name=sc.nextLine();
        System.out.println("Enter the id:");
        int id=sc.nextInt();
        System.out.println("Enter salary:");
        int salary=sc.nextInt();
        Collection newEmployee=new Collection(name,id,salary);
        employe.add(newEmployee);
        System.out.println("New employee added!!");
    }

    public static void displayEmloyee(){
        if(employe.isEmpty()){
            System.out.println("The list is empty");
        }
        else{
            for(Collection emp: employe){
                emp.displayCollection();
            }
        }
    }
    public static void updateEmployee() {
        System.out.println("Enter the id to update:");
        int id = sc.nextInt();
        Collection updateId = null;
        for (Collection emp : employe) {
            if (emp.getId() == id) {
                updateId = emp;
                break;
            }
        }
        if (updateId != null) {
            System.out.println("Enter the name:");
            String newName = sc.nextLine();
            sc.nextLine();
            System.out.println("Enter the id:");
            int newId = sc.nextInt();
            System.out.println("Enter salary:");
            int newSalary = sc.nextInt();
            Collection newEmployee = new Collection(newName, newId, newSalary);
            employe.add(newEmployee);
            System.out.println("New employee added!!");
        } else {
            System.out.println("No employee is found with this id");
        }
    }
        public static void deleteEmployee(){
            System.out.println("Enter the id to update:");
            int Id=sc.nextInt();
            Collection deleteId=null;
            for(Collection emp: employe){
                if(emp.getId()==Id){
                    deleteId=emp;
                    break;
                }
            }
            if(deleteId!=null){
                employe.remove(deleteId);
                System.out.println("employee deleted!!");
            }
            else{
                System.out.println("No employee is found with this id");
            }
        }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while (true) {
        System.out.println("\nEmployee Management System");
        System.out.println("1. Add Employee");
        System.out.println("2. Display Employees");
        System.out.println("3. Update Employee");
        System.out.println("4. Delete Employee");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                addEmployee();
                break;
            case 2:
                displayEmloyee();
                break;
            case 3:
                updateEmployee();
                break;
            case 4:
                deleteEmployee();
                break;
            case 5:
                System.out.println("Exiting Employee Management System.");
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
}


