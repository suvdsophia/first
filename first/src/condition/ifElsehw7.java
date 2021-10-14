package condition;

import java.util.Scanner;

public class ifElsehw7 {
    public static void main(String[] args) {
        char ch;
        System.out.print("Enter letter: ");
        Scanner in = new Scanner(System.in);
        ch = in.next().charAt(0);

        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println("letter is part of the alphabet");
        }else{
            System.out.println("letter is not part of the alphabet");
        }
    }
}