import java.lang.*;
import java.util.*;

public class ArmstromNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Number:");
       int Num= sc.nextInt();
        int res=0;
        int Number=Num;
        
       while(Num>0){
            int digit=Num%10;
            res=res+(int)Math.pow(digit, 3);
            Num/=10;
       }
      if(res==Number){
        System.out.println(Number+" is Armstrong Numer.");
      }else{
        System.out.println(Number+"is Not Armstrong Number.");
      }
    }
}
