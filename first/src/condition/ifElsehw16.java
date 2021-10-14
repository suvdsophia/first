package condition;

import java.util.Scanner;

public class ifElsehw16 {
    public static void main(String[] args) {
        int side1, side2, side3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        side1 = input.nextInt();
        side2 = input.nextInt();
        side3 = input.nextInt();

        if(side1==side2 && side2==side3){
            System.out.println("equilateral triangle");
        }else if(side1==side2 || side1==side3 || side2==side3){
            System.out.println("Isosceles triangle");
        }else{
            System.out.println("Scalene triangle");
        }
    }
}
