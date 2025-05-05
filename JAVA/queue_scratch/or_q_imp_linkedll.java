package queue_scratch;

public class or_q_imp_linkedll {

    static class node{
        int data; 
        node next;

        public node(int cdata){
            this.data=cdata;
            this.next=null;
        }
    }

    static class queue{
          node front=null;
          node rear=null;

        public  void add(int ndata){
            node newnode =new node(ndata) ;
            if(front == null && rear==null){
                front=rear=newnode;
            }
            rear.next=newnode;
            rear=newnode;
        }

        public  void remove(){
            if (front==null && rear==null) {
                System.out.println("Queue is Empty ");
            }
           
            front=front.next;
            if (front==null) {
                rear=null;
            }

        }

        public void peek(){
            if (front==null && rear==null) {
                System.out.println("Queue is Empty ");
            }
            System.out.println("["+front.data+"]");
        }

        public void display(){
            if (front==null && rear==null) {
                System.out.println("Queue is Empty ");
            }
            node refer=front;
            while (refer !=null) {
                System.out.print("["+refer.data+"]->");
                refer=refer.next;
                
            }
            System.out.println("null");

        }

    }
    
    public static void main(String[]ares){
        queue q=new queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.display();
        q.remove();
        q.display();
        q.add(100);
        q.display();
        q.peek();


    }
}
