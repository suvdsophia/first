package condition;

import java.util.Scanner;

public class ifElse5 {
    public static void main(String[] args) {
        // && -> and  || -> or
        String weather;

        Scanner input = new Scanner(System.in);

        System.out.print("is today raining or snowing? ");
        weather = input.next();

        if(weather.equals("rain") || weather.equals("snow")) {
            System.out.println("Your need to get umberella");
        }else{
            System.out.println("you can just go out");
        }



    }
}
