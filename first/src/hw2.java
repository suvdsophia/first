import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int x, y, z, answer;


        System.out.print("Enter x :");
        x = input.nextInt()        ;
        System.out.print ("Enter y :");
        y = input.nextInt();
        System.out.print("Enter z :");
        z = input.nextInt();

        answer = x*x+y-z*x;
        System.out.println("x*x+y-z*x = " + answer);





    }
}
