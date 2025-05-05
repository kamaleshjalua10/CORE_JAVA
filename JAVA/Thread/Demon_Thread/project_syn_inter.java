package Thread.Demon_Thread;


class Company{      //   1 CLASS
    int number;
    boolean condition=false;

    synchronized public void produce_item (int number) throws InterruptedException{

        if(condition){ //   menes  false         // inter Thread communication
            wait();
        }
        
        this.number=number;
        System.out.println(" produced : "+this.number);
        condition = true;  // change the condition value    // inter Thread communication
        notify();

    }

    synchronized public int consume_item()throws InterruptedException{
        if( ! condition){  //    menes  true        // inter Thread communication
            wait();
        }
        System.out.println(" Consumed : "+ this.number);
        condition=false;                     // inter Thread communication
        notify();
        return this.number;

    }
}


class producer extends Thread{    //  2nd   CLASS
    Company c;
    producer(Company con){
        this.c=con;
    }

    public void run(){
        int i=1;
        while( i<=10){
            
            try {
                this.c.produce_item(i);
                Thread.sleep(2000);

            } catch (InterruptedException e) {
    
                e.printStackTrace();
            }

            i++;
        }
    }

}


class consumer extends Thread{    //   3rd CLASS
    Company c;

    consumer(Company con){
        this.c=con;
    }

    public void run(){
        while(true){
            try{
            this.c.consume_item();
                Thread.sleep(2000);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}



public class project_syn_inter {            //  4th   CLASS
    public static void main(String[]ares){
        Company com=new Company();

        producer p=new producer(com);

        consumer c=new consumer(com);
        p.start();
        c.start();
        
    }
}
