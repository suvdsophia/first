import java.util.Scanner;

public class extras {
    public static void main(String[] args) {
        int x =1;
        char y = '1';
        if(x>y){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        Scanner in  = new Scanner(System.in);
        char ch = in.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("it is a small alphabet");
        }
    }
}
