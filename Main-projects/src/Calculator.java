import java.util.*;
public class Calculator {
    enum Operator {
        ADD {
            public double operate(double a, double b) {
                return a+b;
            }
        },
        SUBTRACT {
            public double operate(double a, double b) {
                return (a - b);
            }
        },
        MULTIPLY {
            public double operate(double a, double b) {
               return (a * b);
            }
        },
        DIVIDE {
            public double operate(double a, double b) {
                if (b == 0) {
                    throw new ArithmeticException("Cannot divide by zero.");
                }
               return ( a / b);
            }
        };
        public abstract double operate(double a, double b);
        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number:");
            double a = sc.nextDouble();
            System.out.println("Enter second number:");
            double b = sc.nextDouble();
            System.out.println("Enter the operator:");
            String operatorInp = sc.next();
                Operator operator;
            switch (operatorInp) {
                case "+" -> operator= Operator.ADD;
                case "-" ->  operator=Operator.SUBTRACT;
                case "*" -> operator=Operator.MULTIPLY;
                case null, default ->  operator=Operator.DIVIDE ;
            }
            double result =operator.operate(a,b);
            System.out.println(result);
        }
    }
}

