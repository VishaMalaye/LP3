import java.util.Scanner;

//recursive program to calculate fibonacci of number

public class Assign1_recursiveFibo {
    static int fib(int n){
            if(n==0){
                return 0;
            }
            if(n==1){
                return 1;
            }
        
        return (fib(n-1)+fib(n-2));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        sc.close();

        for(int i=0;i<n;i++){
            System.out.print(fib(i)+ " ");
        }

    }
}