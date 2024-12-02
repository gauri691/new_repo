import java.util.Scanner;
import java.util.Random;
public class  Main {
    public static void main(String[] args) {
        int i;
        int score = 0;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        for (i = 0; i < 5; i++) {
            {
                System.out.println("Enter a number btw 1-100:");
                int num=sc.nextInt();
                int randInt = rand.nextInt(100);
                if (num == randInt) {
                    score = score + 5;
                }
                System.out.println("Score=" + score);
            }
        }
    }
}