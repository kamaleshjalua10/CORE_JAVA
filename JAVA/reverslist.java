public class reverslist {
     node head;
     class node{
        int data;
        node next;

        public node(int cdata){
            this.data=cdata;
            this.next=null;
        }

    }    

        public  void addfirst(int ndata){
            node newnode=new node(ndata);
            if(head == null){
                head=newnode;
            }
            else{
                newnode.next=head;
                head=newnode;
            }
        }

        public void revers(){
            node pre=head;
            node curr=pre.next;
            while (curr != null) {
                node nextn=curr.next;
                curr.next=pre;

                pre=curr;
                curr=nextn;
            }
            head.next=null;
            head=pre;
            
        }

        public void print(){

            node n=head;
            while(n!=null){
                System.out.print(n.data + " ");
                n=n.next;
            }
        }


    public static void main(String []ares){
        reverslist rell=new reverslist();
        rell.addfirst(10);
        rell.addfirst(20);
        rell.addfirst(30);
        rell.addfirst(40);
        rell.addfirst(50);
        rell.revers();
        rell.print();

        

    }
    
}
