package linked_list_scratch;

public class revers_ll {
    node head;
    class node{
        int data;
        node next;

        public node(int cdata){
            this.data=cdata;
            this.next=null;
        }
    }

    public void addfirst(int ndata){
        node newnode= new node(ndata);
        if(head == null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
        
    }

    public  void revers(){
        node priveous=head;
        node currend=head.next;
        // node nnext=currend.next;
        while(currend !=null){
            node nnext=currend.next;
            currend.next=priveous;

            priveous=currend;
            currend=nnext;
    
        }
        head.next=null;
        head=priveous;
    }
    
    public   void print(){
        node refer=head;
        while(refer !=null){
            
            System.out.print("["+refer.data +"]"+" ->");
            refer=refer.next;
        }
        System.out.print(" null ");
    
    }

    public static  void main(String[]ares){
        revers_ll rlist=new revers_ll();
        rlist.addfirst(60);
        rlist.addfirst(50);
        rlist.addfirst(40);
        rlist.addfirst(30);
        rlist.addfirst(20);
        rlist.addfirst(10);
        System.out.println();
        rlist.print();
        System.out.println();
        rlist.revers();
        System.out.println();
        rlist.print();

    }
}
