package condition;

import java.util.Scanner;

public class ifElsehw2 {
    public static void main(String[] args) {
        //2nd
        int num1, num2, num3;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        //nested if condition check
        if(num1>num2){
            if(num1>num3){
                System.out.println("max is num1: " + num1);
            }else{
                System.out.println("max is num3: " + num3);
            }
        }else{
            if(num2>num3){
                System.out.println("max is num2: " + num2);
            }else{
                System.out.println("max is num3: " + num3);
            }
        }
        //AND OR operators && ||
        if(num1>num2 && num1>num3){
            System.out.println("num1 max");
        }else if(num2>num3){
            System.out.println("num2 max");
        }else{
            System.out.print("num3 max");
        }

    }
}