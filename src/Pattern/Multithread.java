class MultithreadingDemo extends Thread {
    public void run(){
        try {
            System.out.println("Thread"+Thread.currentThread().getId()+"is running");
        } catch (Exception e) {
            System.out.println("Exeption is caught");
        }
    }
}
public class Multithread{
    public static void main(String[] args) {
        int i=8;
        for(int i=0;i<n;i++){
            MultithreadingDemo object=new MultithreadingDemo();
        }
    }
}
