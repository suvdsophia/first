package condition;

import java.util.Scanner;

public class ifElsehw5 {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter number to check if it is odd or even");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();


        if(num % 2 == 0){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }
    }
}
