package praktic_DSA;

public class stack_imp_ll {

    static node head;

   static class node{
        int data;
        node back;
        node next;

        node(int cdata){
            this.data=cdata;
            this.back=null;
            this.next=null;
        }

    }
    static class stack{

        public void push(int ndata){
            node newnode = new node(ndata);
            if (head == null) {
                head=newnode;
            }
            else{
    
                head.next=newnode;
                newnode.back=head;
                head=newnode;
            }

        }
        public void pop(){
            if(head ==null){
                System.out.println(" Stackk is Empty ");
            }
            else{

                head=head.back;
            }

        }

        public void peek(){
            if(head == null){
                System.out.println(" stack is Empty ");
            }
            else{
                System.out.println(" peek  : ["+ head.data+"]");
            }

        }
        public void print(){
            if(head == null){
                System.out.println(" stack is Empty ");
            }
            else{
                node refer=head;
                while (refer != null) {
                    System.out.println("["+ refer.data+" ]");
                    refer=refer.back;
                }  
            }           
        }
    }
    

    public static void main(String[]ares){
        stack s=new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
       
        s.pop();
        s.pop();
        s.peek();
        s.print();
        System.out.println();
        s.push(500);
        s.print();
        s.peek();
        System.out.println();
        s.push(600);
        s.push(900);
        s.print();
        s.peek();
        

    }
}
