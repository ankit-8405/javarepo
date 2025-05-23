public class Recursion{
// public static void printDec(int n) {
//     if(n==10){
//         System.out.println(n);
//         return;
//     }
//     printDec(n-1);
//     System.out.print(n+" ");
   
// }
public static void printAvg(int n){
    if(n==1){
        System.out.print(n+" ");
        return;
    }
    printAvg(n-1);
    System.out.print(n+" ");
    
    
}
// public static int fact(int n){
   
//     if(n==0){
//         return 1;
//     }
//    int fnm1=fact(n-1);
//    int fn=n*fact(n-1);
//    return fn;
   
// }
public static void main(String []args){
    int n=5;
    //  printDec(n);
    printAvg(n);
    // fact(n);
    // System.out.println(fact(n));
    
}
}