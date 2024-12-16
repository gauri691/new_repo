package Collection;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Palindrome {
    public static Boolean isPalindrome(String str){
        ArrayDeque<Character> array=new ArrayDeque<>();
        for(char c:str.toCharArray()) {
            array.addLast(c);
        }
        while(array.size()>1){
            char front=array.removeFirst();
            char last=array.removeLast();
            if(front !=last){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println("Enter a string to check whether palindrome or not:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(isPalindrome(str)){
            System.out.println("the string is palindrome");
        }
        else{
            System.out.println("the string is not palindrome");
        }
    }
}
