package Thread.Demon_Thread;

class mainclass{
    synchronized void meth(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName());

              try{
            Thread.sleep(2000);
            }catch(Exception e){

            }
         
        }
    }
}

class thread1 extends Thread{
    mainclass mainc;

    public thread1( mainclass mainc){
        this.mainc=mainc;
    }

    public void run(){
        
        mainc.meth();
        
    }

}

class thread2 extends Thread{
    mainclass mainc;
    public thread2( mainclass mainc){
        this.mainc=mainc;
    }

    public void run(){
        mainc.meth();
    }
    
}

public class synchronized_method {
    public static void main(String[]ares){

        mainclass mclass=new mainclass();
        thread1 t1=new thread1(mclass);
        thread2 t2=new thread2(mclass);

        t1.start();
        t2.start();

    }
}
