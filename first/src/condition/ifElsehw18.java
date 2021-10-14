package condition;

import java.util.Scanner;

public class ifElsehw18 {
    public static void main(String[] args) {
        int cp,sp,profit;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter cp and sp: ");
        cp = input.nextInt();
        sp = input.nextInt();
        profit = sp-cp;

        if(sp>cp){
            System.out.print("profit gain " +profit);
        }else{
            System.out.print("profit loss " + profit);
        }
    }
}
