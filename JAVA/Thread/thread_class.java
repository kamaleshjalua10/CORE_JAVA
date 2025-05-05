package Thread;

// create Thread using Extends Thread class

class test extends Thread{

    public void run(){
            System.out.println(" Sudip ");
        
    }
}

public class thread_class {
    public  static void main(String[]ares){
        test t=new test();
        t.start();   // call only run method 
        System.out.println(" Kamalesh");
                   

    }
    
}
