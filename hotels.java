import java.util.Scanner;
public class hotels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nights:");
        int night = sc.nextInt();
        System.out.println("Enter the room type:\n 1.STANDARD \n 2. DELUXE \n 3.SUITE ");
        String room_type = sc.next().toLowerCase();
        double totalAmount;
        double result = switch (room_type) {
            case "standard" -> {
                totalAmount = 500 * night;
                if (night >= 5) {
                    totalAmount -= totalAmount * 0.15;
                    totalAmount += totalAmount * 0.10;
                }
                yield totalAmount;
            }
            case "deluxe" -> {
                totalAmount = 800 * night;
                if (night >= 5) {
                    totalAmount -= totalAmount * 0.15;
                    totalAmount += totalAmount * 0.10;
                }
                yield totalAmount;
            }
            case "suite" -> {
                totalAmount = 1000 * night;
                if (night >= 5) {
                    totalAmount -= totalAmount * 0.15;
                    totalAmount += totalAmount * 0.10;
                }
                yield totalAmount;
            }
        };
    }
}



