import  java.lang.*;
import java.util.Scanner;

public class SumOfPrime {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number:");
        int Num=sc.nextInt();
        int res=2;

        for(int i=3;i<=Num;i++){
            boolean isPrime=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                res+=i;
            }
        }   
        System.out.println("1 to"+Num+" Sum of all prime numbers is:"+res);
    }
}
