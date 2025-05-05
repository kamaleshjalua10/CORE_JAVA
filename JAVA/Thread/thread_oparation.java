package Thread;


class oparation extends Thread{
    public void run(){
        //   Get Name
        Thread tr=Thread.currentThread();
        String tname=tr.getName();      
        System.out.println(" Thread ntame : "+tname);

        //   Get Class Name
        System.out.println(" Class name : "+tr.getClass());

        //  Set  Priority
        tr.setPriority(3);

        //  Get Priority
       System.out.println(" Priority : "+tr.getPriority());

       

        for(int i=1;i<=6;i++){
            System.out.println(" K.J ");
            try {
                Thread.sleep(1000);
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
}


public class thread_oparation {
    public static void main(String[]ares){
        oparation op=new oparation();
        op.start();


        
        
    }
}

