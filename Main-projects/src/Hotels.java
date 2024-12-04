import java.util.Scanner;
public class Hotels {
    enum RoomType {
        STANDARD(500, "Basic Wi-Fi, Television"),
        DELUXE(800, "Wi-Fi, Television, Air Conditioner"),
        SUITE(1000, "Wi-Fi, Television, Air Conditioner, Pool Access");

        private double baseRate = 0;
        private final String facilities;

        RoomType(double baseRate, String facilities) {
            this.baseRate = baseRate;
            this.facilities = facilities;
        }

        public double getBaseRate() {
            return baseRate;
        }
    }
    public static double calculateTotalAmount(RoomType type, int night) {
        double basePrice = type.getBaseRate() * night;
        if (night > 5) {
            basePrice -= basePrice * 0.15;
        }
        double tax = basePrice * 0.10;
        double totalAmount = basePrice + tax;
        return totalAmount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nights:");
        int night = sc.nextInt();
        System.out.println("Enter the room type:\n 1.STANDARD-Basic Wi-Fi, Television \n 2. DELUXE-Wi-Fi, Television, Air Conditioner \n 3.SUITE-Wi-Fi, Television, Air Conditioner, Mini Bar, Pool Access ");
        String roomType = sc.next().toUpperCase();
        RoomType type=RoomType.valueOf(roomType);
        double totalAmount;
        totalAmount = calculateTotalAmount(type, night);
        System.out.print("Total Amount:"+totalAmount);
    }
}



