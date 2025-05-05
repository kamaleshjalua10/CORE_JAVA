package Thread;

//   Two thread Running at a time 


class thread1  extends Thread{      //  Thread 2
    public void run(){
        
        Thread tc=Thread.currentThread();
        String name=tc.getName();           // get the thread class name
        System.out.println(name);

        for(int i=1;i<=5;i++){
            System.out.println(" KAMALESH ");
            try{
                Thread.sleep(2000);

            }catch(Exception e){
                System.out.println(e.getMessage());
            }

        }
    }
}


class thread2 implements Runnable{   //  Thread 1
    public void run(){
        
        Thread tc=Thread.currentThread();
        String name=tc.getName();    // get the thread class name
        System.out.println(name);

        for(int i=1;i<=5;i++){
            System.out.println(" jalua ");
            try{
                Thread.sleep(2200);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    } 
}



public class two_thread_run {
    public static void main(String[]ares){

        // Thread 1
        thread1 t1=new thread1();

        // Thread 2
        
        thread2 t2=new thread2();
        Thread t=new Thread(t2);
        
        
        // Running  start method  both Thread
        t1.start();  // Thread 1
        t.start();  // Thread 2

    }
    
}
