package condition;

import java.util.Scanner;

public class ifElsehw6 {
    public static void main(String[] args) {
        int year;
        System.out.print("Enter year: ");
        Scanner in = new Scanner(System.in);
        year = in.nextInt();


        if(year % 4 != 0){
            System.out.println("common year");
        }else if(year%100 !=0){
            System.out.println("leap year");
        }else if(year%400 != 0){
            System.out.println("common year");
        }else{
            System.out.println("leap year");
        }

    }
}
