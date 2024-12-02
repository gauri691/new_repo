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
                System.out.println("marks for student"+ (i+1)+ " " +"subject"+(j+1)+" "+":"+marks[i][j]);
            }
        }
        int total=0;
        for(int j=0;j<5;j++) {
            for (int i= 0; i< 5; i++) {
                total += marks[i][j];
            }
            double avrg = total / 5.0;
            System.out.println("Subject " + (j + 1) + ": " + avrg);
        }
    }
}
