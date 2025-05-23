import java.util.*;

public class First {
    public static int operation(int a, int b, int c) {
        if (a == b && b == c) {
            return 0; // All numbers are the same
        } 
        else if (a == b || a == c || b == c) {
             // Two numbers are the same
             if(a>b ||a>c){
                  return 9
             }
        } 
        else {
            return -1;// All numbers are different
        }
    }

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();
        
        int result = First.operation(a, b, c);
        System.out.println("The result is: " + result);
        
        sc.close(); // Close scanner to prevent resource leak
    }
}
