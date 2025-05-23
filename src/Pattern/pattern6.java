import java.util.*;
public class pattern6 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your choice n:");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<= (2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

