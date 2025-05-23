import java.io.FileInputStream;
import java.io.InputStream;

public class InputsStreamExample {
    
    public static void main(String[]args) throws Exception{
        InputStream input=null;
        try {
            input =new FileInputStream("Text.txt");
            // read() method-reading and printing the characters
            // one by one
            System.out.println("char-"+ (char)input.read());
            System.out.println("char-"+ (char)input.read());
            // mark()-read limiting the 'intput' input stream
            input.mark(0);
            // skip()-it results in skipping of 'e' in Ge'eksforGeeks
            input.skip(1);
            System.out.println("skip() method comes to play" );
            System.out.println("mark() method comes to play");        
            System.out.println("char-"+ (char)input.read()); 
            System.out.println("char-"+ (char)input.read());   
            boolean check = input.markSupported();
            if(input.markSupported()){
                input.reset();
                System.out.println("reset() invoked");
                System.out.println("char-"+ (char)input.read());
                System.out.println("char-"+ (char)input.read());
        }else{
            System.err.println("reset() method not supported");
            System.out.println("input.markSupported() supported"+ " reset() - "+check); 

        }
    }
         catch (Exception e) {
            // in case of I/O error
            e.printStackTrace();

        }
        finally{
            if(input!=null){
                // Use of close() method
                // and releasing the resources 
                input.close();
            }
        }
     
    }
}
