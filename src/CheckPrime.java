import java.lang.*;
import java.util.*;

public class CheckPrime {
    public static void main(String[]args){
        int counter=2 ;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int Num=sc.nextInt();
        int sqroot=(int)Math.sqrt(Num);
        while(counter<=sqroot){
            if(Num%counter==0){
                System.out.println(Num+"is not prime number.");
                
            }else{
                System.out.println(Num+" is prime Number.");
            }
            counter++;
        }
        // System.out.println(Num+" is prime Number.");
    }
}
