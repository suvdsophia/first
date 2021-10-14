package condition;

import java.util.Scanner;

public class ifElsehw12 {
    public static void main(String[] args) {
        int month;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1-12: ");
        month = input.nextInt();

        if(month>12 || month<1){
            System.out.println("inviled input");
        }else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
            System.out.println("31 days");
        }else if(month==2){
            System.out.println("28/29");
        }else{
            System.out.println("30");
        }

//        if(month == 1){
//            System.out.println("31 days");
//        }else if(month == 2){
//            System.out.println("28/29 days");
//        }else if(month == 3){
//            System.out.println("31 days");
//        }else if(month == 4){
//            System.out.println("30 days");
//        }else if(month == 5){
//            System.out.println("31 days");
//        }else if(month == 6){
//            System.out.println("30 days");
//        }else if(month == 7){
//            System.out.println("31 days");
//        }else if(month == 8){
//            System.out.println("31 days");
//        }else if(month == 9){
//            System.out.println("30 days");
//        }else if(month == 10){
//            System.out.println("31 days");
//        }else if(month == 11){
//            System.out.println("30 days");
//        }else if (month == 12){
//            System.out.println("31 days");
//        }else{
//            System.out.println("it is not a number between 1-12");
//        }
    }
}
