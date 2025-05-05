package Thread;
import java.lang.Runnable;

// Create Thread using  Implements Runnable Interface

class exam implements Runnable{

    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i +"> Kamalesh ");
            try{
                Thread.sleep(200); //  wating a time to next print 
                }catch(Exception e){
        
                }
            
        }
    }
}

public class runnable_interface {
    public static void  main(String[]ares){
        exam ex=new exam();
        Thread t=new Thread(ex);
        t.start();
       

    }
}
