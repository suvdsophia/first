package condition;

import java.util.Scanner;

public class ifElse4 {
    public static void main(String[] args) {
        // && -> and  || -> or
        int password;
        String username;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter username: ");
        username = input.next();
        System.out.print("Enter password");
        password = input.nextInt();

        if(username.equals("suvd") && password == 1234) {
            System.out.println("Your access granted");
        }else{
            System.out.println("Your username or password is incorrect");
        }



    }
}
