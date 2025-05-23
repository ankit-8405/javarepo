
import java.util.Scanner;

public class Factorial1 {
    public static void main(String[] args) {
        // int n=5;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to find factorial: ");
        int n= sc.nextInt();
        printFact(n);
        System.out.println(printFact(n));
    }
    public static int printFact(int n){
        if(n==0){
            return 1;
        }
        int fnm1= printFact(n-1);
        int fn= n * fnm1;
        return fn;
    }
}
