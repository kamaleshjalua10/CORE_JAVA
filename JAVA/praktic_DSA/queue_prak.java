package praktic_DSA;


public class queue_prak {

    static class node{
        int data;
        node next;

        node(int cdata){
            this.data=cdata;
            this.next=null;
        }
    }

    static class queue{
        node front=null;
        node rear=null;

        public  void add(int ndata){
            node newnode=new node(ndata);
            if( front ==null && rear ==null){
                front=rear=newnode;
            }
            else{
                rear.next=newnode;
                rear=newnode;
            }
        }

        public void delete(){
            if( front == null && rear==null){
                System.out.println(" Queue is Empty ");

            }
            else{
                front=front.next;
                if(front == null){
                    rear =null;
                }

            }    

        }

        public void display(){
            if(front==null && rear == null){
                System.out.println(" Queue is empty ");
            }
            else{
                node poin=front;
                while (poin != null) {
                    System.out.print("["+ poin.data+" ]->");
                    poin=poin.next;
                    
                }
                System.out.println(" null ");
                System.out.println();
            }

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
        q.delete();
        q.delete(); 
        q.delete();
        q.delete();
        q.delete();
        q.add(100);
        q.display();

    }
}
