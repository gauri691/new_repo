import java.util.Scanner;
public class students {
    public static void main(String[] args)
    {
        int[][] marks=new int[5][5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.println("Enter marks for Student " + (i + 1) + ", Subject " + (j + 1) + ": ");
                marks[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<5;i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("enter the marks for student:" + marks[i][j]);
            }
        }
        int total=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                 total += marks[i][j];
            }
            double avrg=total/5.0;
            System.out.println("average:"+avrg);
        }
    }
}
