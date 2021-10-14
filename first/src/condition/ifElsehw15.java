package condition;

import java.util.Scanner;

public class ifElsehw15 {
    public static void main(String[] args) {
        int side1, side2, side3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        side1 = input.nextInt();
        side2 = input.nextInt();
        side3 = input.nextInt();


        if (side1 + side2 > side3 && side1+side3>side2 && side2+side3>side1) {
            System.out.println("triangle and sides are valid");
        }else{
            System.out.println("triangle and sides are not valid");
        }
    }
}