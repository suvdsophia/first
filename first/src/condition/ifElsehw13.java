package condition;

import java.util.Scanner;

public class ifElsehw13 {
    public static void main(String[] args) {
        int amount;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount: ");
        amount = in.nextInt();

        if(amount>=100){
            System.out.println(amount/100 + " x 100$");
        }

        amount = amount-amount/100*100;
        if(amount>=50){
            System.out.println(amount/50 + " x 50$");
        }

        amount = amount-amount/50*50;
        if(amount>=10){
                System.out.println(amount/10 + "x 10$");
        }

        amount = amount-amount/10*10;
        if(amount>=5){
            System.out.println(amount/5 + "x 5$");
        }

        amount = amount-amount/5*5;
        if(amount>=2){
            System.out.println(amount/2 + "x 2$");
        }
    }

}


/*
467$
4*100
1*50
1*10
1*5
1*2
 */
