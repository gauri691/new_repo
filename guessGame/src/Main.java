import java.util.Scanner;
import java.util.Random;
public class  Main {
    public static void main(String[] args) {
        int i;
        int score = 0;
        for (i = 0; i < 5; i++) {
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a number btw 1-100:");
                int num = sc.nextInt();
                Random rand = new Random();
                int randInt = rand.nextInt(100);
                System.out.println("random num:"+randInt);
                if (num == randInt) {
                    score = score + 5;
                }
                System.out.println("Score=" + score);
            }
        }
    }
}