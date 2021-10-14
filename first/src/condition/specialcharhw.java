package condition;

import java.util.Scanner;

public class specialcharhw {
    public static void main(String[] args) {
        char ch;
        System.out.print("Enter character: ");
        Scanner in = new Scanner(System.in);
        ch = in.next().charAt(0);

        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')){
            System.out.println("character is not a special character");
        }else{
            System.out.println("character is a special character");
        }
        //if the character is a not (letter or digit), it is  a special character




    }
}
