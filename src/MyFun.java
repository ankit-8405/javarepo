public class MyFun {
    public static void main(String[]args){
          MyFun obj=new MyFun();
         int res = obj.calculate(10,20);
         System.out.println(res);
    }
    public int calculate(int a, int b){
        int sum =a+b;
      return sum;
    }
    
}
