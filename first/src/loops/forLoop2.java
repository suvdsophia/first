package loops;

import java.util.Scanner;

public class forLoop2 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("enter the limit: ");
        int lim = in.nextInt();

        for(int i=1;i<=lim; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int a=lim; a>0; a--){
            System.out.print(a + " ");
        }
        System.out.println();
        for(int i=1;lim>=i; lim--){
            System.out.print(lim + " ");
        }

    }
}
