import java.util.Scanner;
import java.util.Random;
public class RandomString
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length for random string:");
        int length=sc.nextInt();
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuffer sb=new StringBuffer();
        Random rand=new Random();
        for(int i=0;i<length;i++){
           int  randomIndex=rand.nextInt(chars.length());
           sb.append(chars.charAt(randomIndex));
        }
        System.out.println("Random string:"+sb);
    }
}
