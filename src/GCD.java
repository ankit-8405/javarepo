public class GCD {
    public static void main(String[] args) {
        int result = gcd(24, 36); // Call the gcd method
        System.out.println("GCD is: " + result); // Print the result
        euclidinGcd(12,48);
    }

    public static int gcd(int num1, int num2) {
        int min = (num1 <= num2) ? num1 : num2; // Find the smaller number
        while (min > 0) {
            if (num1 % min == 0 && num2 % min == 0) {
                return min; // Return the GCD
            }
            min--; // Decrement min to check the next possible divisor
        }
        return 1; // If no GCD is found, return 1 (default for coprime numbers)
    }
    // Euclidean algorithm for GCD
    // This method uses the Euclidean algorithm to find the GCD of two numbers.
    public static  void euclidinGcd(int num1,int num2) {
while(num1 !=0 && num2 !=0) {
    if(num1>num2) {
        num1 -=num2;
    }else{
        num2 -=num1;
    }
    if(num1 == 0) {
        System.out.println("GCD is: " + num2);
    }else {
        System.out.println("GCD is: " + num1);
    }
  }
 }
}