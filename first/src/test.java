import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //% -> modulo operator and it is finding remainder
        int num;
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        if(num%5==0 && num%11==0){
            System.out.println("is divisible by both 5 and 11");
        }else if(num%5==0 && num%11!=0){
            System.out.println("is divisible by5 but not 11");
        }

        //**************************************************************
        if(num%5==0){
            if(num%11==0){
                System.out.println("divisible by both");
            }else{
                System.out.println("is divisible by 5 but not 11");
            }
        }else{//in here i am sure the numbe is not divisible by 5
            if(num%11==0){
                System.out.println("div by 11 but not 5");
            }else{
                System.out.println("not div by 5 nor 11");
            }
        }
    }
}
/*
 *
 * 15 -> is divisible by 5 but not 11
 * 22 -> div byy11 but not 5
 * 55 -> div by both 5 and 11
 * 21 -> is not div by 5 nor 11
 */
