package condition;

import java.util.Scanner;

public class ifElse1 {
    public static void main(String[] args) {
        // == > < !
        int age;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age");
        age = input.nextInt();

        if(age>16){
            System.out.println("You allowed to have driver licence");
        }else{
            System.out.println("You are too young to drive a car");
        }
    }
}
