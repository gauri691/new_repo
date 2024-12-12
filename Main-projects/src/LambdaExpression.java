import java.util.Scanner;
public class LambdaExpression {
      interface Operation{
          double apply(double a,double b);
      }
       public static void main(String[]args){
    Operation add = (a, b) -> a + b;
    Operation subtract = (a, b) -> a - b;
    Operation multiply = (a, b) -> a * b;
    Operation divide = (a, b) -> {
            if (b == 0)
            {
                System.out.println("cannot divide by 0");
            }
            return a / b;
        };
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number:");
    double a=sc.nextDouble();
    System.out.println("Enter the second number:");
    double b=sc.nextDouble();
    System.out.println("Choose an operation:");
    System.out.println("1.ADD");
    System.out.println("2.SUBTRACT");
    System.out.println("3.MULTIPLY");
    System.out.println("4.DIVIDE");
    int choice=sc.nextInt();
    double result=0;
    switch(choice){
        case 1:{
            result=add.apply(a,b);
            System.out.println("RESULT:"+result);
            break;
        }
        case 2:{
            result=subtract.apply(a,b);
            System.out.println("RESULT:"+result);
            break;
        }
        case 3:{
            result=multiply.apply(a,b);
            System.out.println("RESULT:"+result);
            break;
        }
        case 4: {
            result = divide.apply(a, b);
            System.out.println("RESULT:" + result);
            break;
        }
            default:
                System.out.println("invalid choice");

            }
        }
    }

