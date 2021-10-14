package condition;

import java.util.Scanner;

public class ifElsehw9 {
    public static void main(String[] args) {
        int ch;
        System.out.print("Enter character: ");
        Scanner in = new Scanner(System.in);
        ch = in.nextInt();

        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println("alphabet");
        }else if(ch>='0' && ch<='9'){
            System.out.println("digit");
        }else{
            System.out.println("special symbol");
        }
    }
}
