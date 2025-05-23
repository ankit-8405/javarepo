public class BubleSort {
    public static void main(String[] args){
        int[] arr={12,32,6,0,2,4,1,33,45};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i;i++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                        }
                       System.out.println(arr[j]);
            }
           
            
        }
        System.out.println("Sorted array:");
    }
    
}
