import java.util.*;
public class EmployeException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = new String[100];
        double[] salary = new double[100];
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("Enter name of " + (i + 1) + "th employee");
                String employeName = sc.nextLine();
                if (employeName == null ||employeName.isEmpty() ) {
                    throw new IllegalArgumentException("Name cannot be null or cannot be empty");
                }
                System.out.println("Enter salary of " + (i + 1) + "th employee");
                String employeSalary = sc.nextLine();
                double doubleSalary = Double.parseDouble(employeSalary);

                if (doubleSalary < 0) {
                    throw new IllegalArgumentException("negative number is not allowed.");
                }
                name[i] = employeName;
                salary[i] = doubleSalary;
            }
            catch(NumberFormatException e) {
                System.out.println("ERROR: "+e);
            }
            catch(IllegalArgumentException e){
                System.out.println("ERROR: "+e);
            }
             catch(Exception e) {
                System.out.println("ERROR" + e);
            }
        }
            for (int j = 0; j < 3; j++) {
                System.out.println(name[j] + " got a salary " + salary[j]);
            }
        }
    }
