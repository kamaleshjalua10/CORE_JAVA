package praktic_DSA;

public class linked_list {

    static node head;
    static int traker=0;

    static class node{
        int data;
        node next;
       
        public node(int cdata){
            this.data=cdata;
            this.next=null;
        }

    }
    static class linkedlist{

        public void insertf(int ndata){
            node newnode = new node(ndata);
            traker++;
            if(head == null){
                head=newnode;
            }
            else{
                newnode.next=head;
                head=newnode;
            }    
        }

        public void insertl(int ndata){
            node newnode=new node(ndata);
            traker++;
            if(head == null){
                head=newnode;
            }
            else{
                node poin=head;
                while (poin.next != null) {
                    poin=poin.next;
                }
                poin.next=newnode;
                
            }
        }
        
        public void insertany(int ndata,int position){
            if(traker >= position){

                node newnode=new node(ndata);
                if(position == 0){
                    insertf(ndata);
                }
                else{
                    traker++;
                    node refer=head;
                
                    for(int i=1;i<position-1;i++){
                        refer=refer.next;          
                    }
                    newnode.next=refer.next;
                    refer.next=newnode;
                }    
            }
            else{
                System.out.println(" index are There "+traker + " not insert");
            }
        }

        public void deletef(){
            if(head == null){
                System.out.println(" List is Empty ");
            }
            else{
                traker--;
                head=head.next;
            }
        }

        public void deleteany(int position){
            if(traker >= position){
                if(position ==0){
                    deletef();
                }
                else{
                    node refer=head;
                    node poin=refer.next;
                    for(int i=1;i<position-1;i++){
                        refer=refer.next;
                        poin=poin.next;
                    }
                    refer.next=poin.next;
                }    
            }
            else{
                System.out.println(" Index are not There Index is "+ traker);
            }

        }

        public void deletel(){
            if(head == null){
                System.out.println(" List is Empty ");
            }
            else{
                traker--;
                node refer=head;
                node poin=refer.next;

                while (poin.next!= null) {
                    refer=refer.next;
                    poin=poin.next;
                }
                refer.next=poin.next;
            }
        }

        public void revers(){
            node first=head;
            node second=head.next;
            while (second != null) {
                node third=second.next;

                second.next=first;

                first=second;
                second=third;
            }
            head.next=null;
            head=first;

        }

        public void rotate(int time){
            


        }
        

        public void print(){
            if(head == null){
                System.out.println(" is Empty ");
            }
           else{ 
                node poin=head;
                while (poin != null) {
                    System.out.print( " ["+poin.data +"] ->");
                    poin=poin.next;
                }
                System.out.println(" null ");
                System.out.println();
            }
        }

    }
    
    public static void main(String[]ares){
        linkedlist ll=new linkedlist();
        ll.insertf(20);
        ll.insertf(10);
        ll.insertl(100);
        ll.insertl(30);
        ll.insertl(40);
        ll.insertany(599, 5);
        ll.insertany(399, 6);
        ll.print();
        ll.deleteany(0);
        // ll.deletel();
        ll.print();

        ll.revers();
        ll.print();
       

    }
}
