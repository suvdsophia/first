package loops;

import java.util.Scanner;

//printing out all odd numbers from 1 to n
public class loophw5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the limit: ");
        int lim = in.nextInt();

        for (int i = 1; i <= lim; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}