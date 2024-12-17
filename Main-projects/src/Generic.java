public class Generic<T extends Number> {
    public T add(T num1, T num2) {
        return (T) addNum(num1, num2);
    }

    public T subtract(T num1, T num2) {
        return (T) subNum(num1, num2);
    }

    public T multiply(T num1, T num2) {
        return (T) mulNum(num1, num2);
    }

    public T divide(T num1, T num2) {
        return (T) divNum(num1, num2);
    }

    private Number addNum(Number num1, Number num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    private Number subNum(Number num1, Number num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    private Number mulNum(Number num1, Number num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    private Number divNum(Number num1, Number num2) {
        if (num2.doubleValue() == 0) {
            System.out.println("Cannot divide by 0");
        }
        return num1.doubleValue() / num2.doubleValue();
    }
}
 class GenericCalculator{
    public static void main(String[]args){
        Generic<Integer>intCal=new Generic<>();
        System.out.println("Integer addition:"+intCal.add(10,20));
        System.out.println("Integer subtraction:"+intCal.subtract(10,20));
        System.out.println("Integer multiplication:"+intCal.multiply(10,20));
        System.out.println("Integer division:"+intCal.divide(10,20));
        System.out.println("Integer division:"+intCal.divide(10,0));
        System.out.println(" ");

        Generic<Double> doubleCal=new Generic<>();
        System.out.println("Double addition:"+doubleCal.add(10.5,20.5));
        System.out.println("Double subtraction:"+doubleCal.subtract(10.5,20.5));
        System.out.println("Double multiplication:"+doubleCal.multiply(10.5,20.5));
        System.out.println("Double division:"+doubleCal.divide(10.5,20.5));
        System.out.println(" ");

        Generic<Float> floatCal=new Generic<>();
        System.out.println("Float addition:"+floatCal.add(10.5f,20.5f));
        System.out.println("Float subtraction:"+floatCal.subtract(10.5f,20.5f));
        System.out.println("Float multiplication:"+floatCal.multiply(10.5f,20.5f));
        System.out.println("Float division:"+floatCal.divide(10.5f,20.5f));
    }

}
