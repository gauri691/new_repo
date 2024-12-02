import java.util.Scanner;
public class Hotels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nights:");
        int night = sc.nextInt();
        System.out.println("Enter the room type:\n 1.STANDARD \n 2. DELUXE \n 3.SUITE ");
        String roomType = sc.next().toLowerCase();
        double totalAmount=0.0;
        double roomCost;
        double base = switch (roomType) {
            case "standard" -> 500;

            case "deluxe" -> 800;

            case "suite" -> 1000;

            default -> {
                System.out.println("Invalid room type.");
                yield 0.0;
            }
        };
        if (night >= 5) {
            totalAmount=base*night;
            totalAmount -= totalAmount * 0.15;
            totalAmount += totalAmount * 0.10;
            System.out.println("Total Amount:"+totalAmount);
        }
        else{
            totalAmount=base*night;
            System.out.println("Total Amount:"+totalAmount);
        }
    }
}



