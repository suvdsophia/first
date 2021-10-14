package loops;

import java.util.Scanner;

public class loophw7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter limit: ");
        int lim = in.nextInt();
        int total = 0;

        for(int i=1; i<=lim; i++){
            total = total + i;

        }
        System.out.println("Total = " + total);
    }
}
