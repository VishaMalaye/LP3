import java.util.Scanner;

//write non recursive and recursive program to calculate fibonacci numbers

public class Assign1_iterativeFibo{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        sc.close();

        int fibo,fibo1=0,fibo2=1;
        System.out.print(fibo1+" "+fibo2);
        while(n>1){
            fibo=fibo1+fibo2;
            System.out.print(" "+fibo);
            fibo1=fibo2;
            fibo2=fibo;
            n--;

        }
    }
}