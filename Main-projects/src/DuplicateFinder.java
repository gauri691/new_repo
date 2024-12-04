import java.util.HashSet;
import java.util.Scanner;
public class DuplicateFinder
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string:");
            String sentence = sc.nextLine();
            sentence =sentence.toLowerCase();
            String[] words = sentence.split(" ");
            HashSet hashset=new HashSet();
        for(String word:words)
        {
                if (!hashset.add(word))
                {
                    System.out.println("Duplicate word is:"+word);
                }
            }
        }
    }