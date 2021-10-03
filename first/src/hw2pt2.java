import java.util.Scanner;

public class hw2pt2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num1, num2, num3, answer;


        System.out.print("Enter num1 :");
        num1 = input.nextInt();
        System.out.print("Enter num2 :");
        num2 = input.nextInt();
        System.out.print("Enter num3 :");
        num3 = input.nextInt();

        answer = num1-num1+num2*num1+num3;
        System.out.println("num1-num1+num2*num1+num3 =" + answer);
    }
}
