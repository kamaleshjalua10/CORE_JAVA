package queue_scratch;

public class queue_imp_ll {
    node head;
    class node{
        int data;
        node next;

        public node(int cdata){
            this.data=cdata;
            this.next=null;
        }
    }

    public  void add(int ndata){
    
        node newnode=new node(ndata);
        if(head == null){
            head=newnode;
        }
        else{

        node refer=head;
        while (refer.next != null) {
            refer=refer.next;
        }
        refer.next=newnode;
        }
    }

    public  void remove(){
        if(head == null){
            System.out.println("  queue is Empty ");
        }
        else{
        head=head.next;
        }
    }

    public void peek(){
        if(head== null){
            System.out.println(" queue is empty ");
        }
        System.out.println("["+head.data+"]");
    }

    public void display(){
        if(head==null){
            System.out.println(" Queue is Empty ");
        }
        else{
        node refer=head;
        while (refer !=null) {
            System.out.print("["+refer.data+"] ->");
            refer=refer.next;           
        }
        System.out.println("null");
        }
    }
    

    public static void main(String[]ares){
        queue_imp_ll q=new queue_imp_ll();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        // q.remove();
        // q.remove();
        // q.remove();
        // q.remove();
        // q.remove();
        // q.remove();

        q.peek();

        q.display();


    }
}
