import java.util.Scanner;

public class calc1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2,answer;


        System.out.print("Enter num1 :");
        //in here i am initializing num1 by asking user to enter some number
        num1 = input.nextInt();
        System.out.print("enter num2: ");
        num2 = input.nextInt();

        answer = num1+num2;
        System.out.println("num1+num2=" + answer);

    }
}
/*
homework:
declare 3 integer variables
initializes those 3 variables by asking user to input 3 number
and calculate following equations:
x*x+y-z*x
x-x+y*x+z

and expected output:
enter num1: 15
enter num2: 10'
enter num3: 100
x*x+y-z*x = 152202
 */
