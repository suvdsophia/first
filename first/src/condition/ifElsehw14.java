package condition;

import java.util.Scanner;

public class ifElsehw14 {
    public static void main(String[] args) {
        int angle1, angle2, angle3, sum;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        angle1 = input.nextInt();
        angle2 = input.nextInt();
        angle3 = input.nextInt();
        sum = angle1+angle2+angle3;

        if(sum == 180){
            System.out.println("triangle is valid");
        }else{
            System.out.println("triangle is not valid");
        }
    }
}
