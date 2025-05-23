import java.util.*;
public class DividerNumber2 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your Number:");
        int Num=sc.nextInt();
        int counter=1;
        int sqroot=(int)Math.sqrt(Num);
        while(counter<=sqroot){
            if(Num%counter==0){
                System.out.println(counter+" is a divisor of"+Num);
            }else{
                System.out.println(counter+" is not divisor of"+Num);
            }
            counter++;
        }
    }
}
