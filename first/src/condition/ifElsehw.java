package condition;

import java.util.Scanner;

public class ifElsehw {
    public static void main(String[] args) {
// 1st:
        int num1, num2;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number");
        num1 = input.nextInt();
        num2 = input.nextInt();

        if(num1>num2){
            System.out.println("max is num1");
        }else if(num2>num1){
            System.out.println("max is num2");
        }else{
            System.out.println("numbers are equal");
        }
    }
}
