package condition;

import java.util.Scanner;

public class ifElsehw3<x> {
    public static void main(String[] args) {
        //3rd

        Scanner input = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = input.nextInt();


        if(x<0){
            System.out.print("number is negative");
        }else if(x>0){
            System.out.println("number is positive");
        }else{
            System.out.println("number is 0");
        }
    }
}



