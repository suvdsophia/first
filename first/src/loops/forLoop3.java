package loops;

public class forLoop3 {
    public static void main(String[] args) {
        for(char ch ='a';ch<='z';ch++){
            System.out.print(ch + " ");
        }
        System.out.println();
        for(int i=1;i<=100; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for(int i=2; i<=100; i = i + 2){
            System.out.print(i + " ");
        }

    }
}
