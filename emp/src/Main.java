import java.util.Scanner;
public class Main {
        public static void main(String args[]) {
            double  taxRate;
            double taxAmount;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter employee name:");
            String name = sc.nextLine();
            System.out.println("Enter employee salary:");
            double salary = sc.nextDouble();
            if (salary <= 250000) {
                 taxRate = 0.0d;
            } else if (salary <= 500000) {
                 taxRate = 0.5d;
            } else if (salary <= 1000000) {
                 taxRate = 0.20d;
            }
            else{
                taxRate=0.30d;
            }
             taxAmount = salary * taxRate;

            System.out.println("Name of employee:"+name);
            System.out.println("Salary of employee:"+salary);
            System.out.println("Tax Rate of employee:" +taxRate);
            System.out.println("Tax Amount of employee:"+taxAmount);
        }
    }