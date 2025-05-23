import java.util.*;
public class array1 {
    public static void main(String []args){
        int[] arr=new int[5];
         arr[0]=10;
         arr[1]=10;
         arr[2]=10;
         arr[3]=40;
         arr[4]=10;
        for(int i=0;i<arr.length;i++){
            System.out.println("Element at index"+i+":"+arr[i]);

        }
        arr[1]=25;
        System.out.println("Updated element at index 1:"+arr[1]);
        int SearchValue=40;
        for (int i = 0; i <arr.length; i++) {
         if(arr[i]==SearchValue)   {
            System.out.println(SearchValue+"is found at index"+i);
         }
        }
    }
}
