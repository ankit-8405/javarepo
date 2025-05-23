import java.util.*;
public class DividerNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter your Choice Number:");
        int Num=sc.nextInt();
        
        for(int i=1;i<=Num;i++){
           int res=Num%i;
           
            if(res==0){
            
                System.out.print(i+" ");
            
            }else{
                System.out.print("");
            }
        }
    }
}
