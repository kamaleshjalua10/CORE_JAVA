package linked_list_scratch;

import java.util.Scanner;

public class double_ll {
    node head;
    int listcount=0;
    public class node{
        int data;
        node next;
        node previous;

        public node(int cdata){
            this.data=cdata;
            this.next=null;
            this.previous=null;
        }
    }

    public void addfirst(int ndata){
        node newnode=new node(ndata);
        listcount++;
        if(head == null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head.previous=newnode;
            newnode.previous=null;
            head=newnode;
        }

    }

    public void addanyindex(int index,int ndata){
        node newnode=new node(ndata);
        listcount++;
        node refer=head;
        node secondr=head.next;
        for(int i=1;i<index-1;i++){
            refer=refer.next;
            secondr=secondr.next;
        }
        newnode.next=secondr;
        secondr.previous=newnode;
        newnode.previous=refer;
        refer.next=newnode;

    }

    public void addlast(int ndata){
        node newnode=new node(ndata);
        listcount++;
        node refer=head;
        while(refer.next !=null){
            refer=refer.next;
        }
        refer.next=newnode;
        newnode.previous=refer;
    }

    public void deletefirst(){
        listcount--;
        head=head.next;
        head.previous=null;

    }

    public void deleteanyindex(int index){
        listcount--;
        node refer=head;
        node secondr=head.next;
        for(int i=1;i<index-1;i++){
            refer=refer.next;
            secondr=secondr.next;
        }
        refer.next=secondr.next;
        secondr.next.previous=refer;
    }

    public void deletelast(){
        listcount--;
        node refer=head;
        node secondr=head.next;

        while(secondr.next != null){
            refer=refer.next;
            secondr=secondr.next;
        }
        refer.next=secondr.next;
    }

    public void printlist(){
        node refer=head;
        System.out.print(" null ");
        while(refer != null){
            System.out.print("<- [ "+refer.data +" ] ->");
            refer=refer.next;
        }
        System.out.print(" null");
        System.out.println();
    }


    public void countlist(){
        System.out.println(" Total Linked List is "+listcount);
    }


    public static void main(String[]ares){
        Scanner input=new Scanner(System.in);
        double_ll dlist=new double_ll();
       while (true) {
        System.out.println();
            System.out.println(" 1: addfirst     2: addanyindex      3: addlast ");
            System.out.println(" 4: deletefirst  5: deleteanyindex   6: deletelast ");
            System.out.println(" 7: printlist    8: countlist        9: Exit  ");
            System.out.print(" ENTER A CHOICE :   ");
            int choice=input.nextInt();

            switch (choice) {
                case 1:
                System.out.print(" Enter value : ");
                int firstvalue=input.nextInt();
                dlist.addfirst(firstvalue);    
                    break;
                case 2:
                System.out.print(" Enter index : ");
                int index=input.nextInt();
                System.out.print(" Enter value : ");
                int anyvalue=input.nextInt();
                dlist.addanyindex(index,anyvalue);    
                    break;
                case 3:
                System.out.print(" Enter value : ");
                int lastvalue=input.nextInt();
                dlist.addlast(lastvalue);                   
                    break;
                case 4:
                dlist.deletefirst();
                    
                    break;
                case 5:
                    System.out.print(" Enter index : ");
                    int deleteindex=input.nextInt();
                    dlist.deleteanyindex(deleteindex);
                    break;
                case 6:
                    dlist.deletelast();
                    break;
                case 7:
                    dlist.printlist();
                    break;
                case 8:
                    dlist.countlist();
                    break;
                case 9:
                    return;
       
                default:
                System.out.println(" Enter a valid choice");
                    break;
            }

       }

    }
    
}
