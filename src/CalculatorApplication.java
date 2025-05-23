import java.util.Scanner;
public class CalculatorApplication {
    public static void main(String[] args) {
        CalculatorApplication obj = new CalculatorApplication();
        Scanner sc= new Scanner(System.in);
        do{
        System.out.println("Choose an operation:(+,-,*,/,%)");
        // Take input from user and decide which operation to perform 
        System.out.println("=>");
        String input=sc.next();
        char ch=input.charAt(0);
       obj.chooseOperation(ch);
       int time=0;
       int retry=5;
       boolean exit=false;
      for(time=0; time<retry;time++){
        System.out.println("Do you want to exit?(Y/N)");
        String exitInput=sc.next();
        char ch1= input.charAt(0);
      } 
         if(ch1=='N'){
            exit=true;
      break;
    } else if(ch=='Y'){
      break;
    }else{

    }
        public void chooseOperation(char ch){
            switch(ch){
                case '*':
                System.out.println("Multily");
                break;
                case '+':
                System.out.println("Add");
                break;
                case '-':
                System.out.println("Substract");
                break;
                case '/':
                System.out.println("Divide");
                break;
                case '%':
                System.out.println("Modulus");
                break;
                default:
                System.out.println("Invalid operation");
                break;
                
            
        }
    }
}
