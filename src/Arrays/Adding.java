import java.util.*;

public class Adding {
    private int[] myArray; // Declare myArray at the class level

    public Adding() { // Constructor to initialize the array
        myArray = new int[5];
        myArray[0] = 1;
        myArray[1] = 9;
        myArray[2] = 8;
        myArray[3] = 10;
        myArray[4] = 7;
    }

    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo() {
        printArray(myArray);
    }

    public void arrayMltply() {
        int total = 1;
        int n = myArray.length; // Get the length of myArray
        for (int i = 0; i < n; i++) {
            total = total * myArray[i];
        }
        System.out.println("The total is: " + total);
    }
    public void arraySum(){
        int sum=0;
        int n=myArray.length;
        for(int i=0;i<n;i++){
            sum=sum+myArray[i];
        }
        System.out.println("The sum is:"+ sum );
    }
    public void sortArray(){
        Arrays.sort(myArray);
        printArray(myArray);
    }
    public void arraysearch(){
        int n= myArray.length;
        int key=8;;
        for(int i=0;i<n;i++){
            if(myArray[i]==key){
                System.out.println("Element found at index:"+i);
                break;
            }else{
                System.out.println("Element not found");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Adding obj = new Adding();
        obj.arrayDemo();
        obj.arrayMltply();
        obj.arraySum();
        obj.sortArray();
        obj.arraysearch();
    }
}
