package condition;

import java.util.Scanner;

public class ifElsehw10 {
    public static void main(String[] args) {
        int ch;
        System.out.print("Enter letter: ");
        Scanner in = new Scanner(System.in);
        ch = in.nextInt();

        if(ch>='a' && ch<='z'){
            System.out.println("lowercase");
        }else if(ch>='A' && ch<='Z'){
            System.out.println("uppercase");
        }else{
            System.out.println("not part of the alphabet");
        }
    }
}
