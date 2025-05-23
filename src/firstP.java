import java.util.*;
public class firstP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in );
        System.out.println("Enter your string:");
        String s=sc.nextLine();
        char ch;
        String nstr="";
        for(int i=0; i<s.length();i++){
            ch=s.charAt(i);
            nstr=ch+nstr;
        }
        System.out.println("Reversed String is: "+ nstr);
    }
}
