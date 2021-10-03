package condition;

import java.util.Scanner;

public class ifElsehw4 {
    public static void main(String[] args) {
        //4th

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num;
        num = input.nextInt();


        if(num/5 == 0){
            System.out.println("number is divisible by 5");
        }else if(num/11 == 0){
            System.out.println("number is divisible by 11");
        }else{
            System.out.println("number is not divisible by 5 or 11");
        }
    }
}

