import java.util.Scanner;
public class Hotels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nights:");
        int night = sc.nextInt();
        System.out.println("Enter the room type:\n 1.STANDARD-Basic Wi-Fi, Television \n 2. DELUXE-Wi-Fi, Television, Air Conditioner \n 3.SUITE-Wi-Fi, Television, Air Conditioner, Mini Bar, Pool Access ");
        String roomType = sc.next().toLowerCase();
        double totalAmount;
        enum RoomType {
            STANDARD(500, "Basic Wi-Fi, Television"),
            DELUXE(800, "Wi-Fi, Television, Air Conditioner"),
            SUITE(1000, "Wi-Fi, Television, Air Conditioner, Pool Access");

            private final double baseRate;
            private final String facilities;

            RoomType(double baseRate, String facilities) {
                this.baseRate = baseRate;
                this.facilities = facilities;
            }

            public double getBaseRate() {
                return baseRate;
            }
        }
            if (night >= 5) {
            totalAmount = RoomType.getBaseRate() * night;
            totalAmount -= totalAmount * 0.15;
        } else {
            totalAmount = RoomType.getBaseRate() * night;
        }
        totalAmount += totalAmount * 0.10;
        System.out.println("Total Amount:" + totalAmount);
    }
}



