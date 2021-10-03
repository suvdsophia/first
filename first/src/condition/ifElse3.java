package condition;

import java.util.Scanner;

public class ifElse3 {
    public static void main(String[] args) {
        // == > < !
        int weekDay;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1-7: ");
        weekDay = input.nextInt();

        // = -> assignment operator it will assign whatever in the right side into the left side
        // == -> condition operator its like a question

        if(weekDay == 1){
            System.out.println("It is Monday");
        }else if(weekDay == 2){
            System.out.println("it is tuesday");
        }else if(weekDay == 3){
            System.out.println("it is wednesday");
        }else if(weekDay == 4){
            System.out.println("it is thursday");
        }else if(weekDay == 5){
            System.out.println("it is friday");
        }else if(weekDay == 6){
            System.out.println("it is saturday");
        }else if(weekDay == 7){
            System.out.println("it is sunday");
        }else{
            System.out.println("it is not a number between 1-7");
        }

    }
}
