package condition;

import java.util.Scanner;

public class ifElse2 {
    public static void main(String[] args) {
        // == > < !
        int grade;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        grade = input.nextInt();

        if (grade < 60) {
            System.out.println("you failed");
        } else if (grade < 70) {
            System.out.println("you got grade D");
        } else if (grade < 80) {
            System.out.println("You got grade C");
        } else if (grade < 90)
            System.out.println("You got grade B");
    else
        System.out.print("You got grade A");

    }
}
