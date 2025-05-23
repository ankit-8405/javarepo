package src;

public class ThreadChild extends Thread{
public void run(){
    System.out.println("in clean upcode");
    System.out.println("in shutdown hook");

    }
}
class Demo{
    public static void main(String []args){
        Runtime current=Runtime.getRuntime();
        current.addShutdownHook(new ThreadChild());
        for(int i=1;i<=10;i++){
            System.out.println("2x"+ i +"="+2*i);
        }
    }
}
