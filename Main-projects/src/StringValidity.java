import java.util.*;
public class StringValidity {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with‘(‘, ‘)’, ‘{‘, ‘}’, ‘[‘ and ‘]’:");
        String string = sc.nextLine();
        char[] array = string.toCharArray();
        boolean flag=true;
        for (char i : array) {
            if (i == '(' || i == '{' || i == '[') {
                stack.push(i);
            }
            else if (i == ')' || i == ']' || i == '}')
            {
                /*if (stack.isEmpty()) {
                    System.out.println("Stack is empty");
                }*/
                char top = stack.pop();

                if ((i == ')' && top != '(') || (i == '}' && top != '{') || (i == ']' && top != '[')) {
                     flag=false;
                }
            }
        }
        if(!flag){
            System.out.println("invalid");
        }
        else{
            if(stack.isEmpty()){
            System.out.println("valid");}
            else {
                System.out.println("invalid");
            }

        }
    }
}
