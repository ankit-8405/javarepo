public static void Main(int n){
     if(n==1){
         System.out.print(n+" ");
         return;
     }
     fact(n-1);
     System.out.print(n+" ");
    
    
 }
 public static int fact(int n) {

     if (n == 0) {
         return 1;
     }
         int fnm1 = fact(n - 1);
     int fn = n * fact(n - 1);
     return fn;

 }

void main() {
}