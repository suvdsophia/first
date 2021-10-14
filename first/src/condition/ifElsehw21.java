package condition;

import java.util.Scanner;

public class ifElsehw21 {
    public static void main(String[] args) {
        int amount;
        System.out.print("Enter unit");
        Scanner in = new Scanner(System.in);
        amount = in.nextInt();


        if(amount<=50){
            System.out.println("pay " + amount*0.5);
        }else if(amount<=150){
            System.out.println("pay " + (amount-50)*0.75);
        }else if(amount<=250){
            System.out.println("pay " + (amount-150)*1.2);
        }else{
            System.out.println("pay " + (amount-250)*1.5);
        }
    }
}

//take from user amount
//CHECK IF AMOUNT>50 then 50*0.5 else amount*0.5
//CHECK IF amount-50>100 THEN 100*0.75 ELSE {AMOUNT-50}*0.75
//CHECK IF amount-150>100 then 100*1.2 else (amount-150)*1.2
//check if amount>250 then (amount-250)*1.5