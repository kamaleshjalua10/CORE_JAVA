package linked_list_scratch;

import java.util.Scanner;

public  class single_ll {
    node head;
    int listcount=0;
    public class node{
        int data;
        node next;
        

        public node(int cdata){
            this.data=cdata;
            this.next=null;
        }
    }

        public  void addfirst(int ndata){
            node newnode=new node(ndata);
            listcount++;
            if(head==null){
                head=newnode;
            }
            else{
                newnode.next=head;
                head=newnode;
            }    
          
        }


        public void addany(int index,int ndata){
            node newnode=new node(ndata);
            if(index > listcount){
                System.out.println(" List length is not present ");
                // System.out.println(" node are present "+ listcount);
                countlist();
            }
            else{
                listcount++;
               node refer=head;
               for(int i=1;i<index-1;i++){
                  refer=refer.next;
               }
               newnode.next=refer.next;
               refer.next=newnode;
            }

        } 


        public void addlast(int ndata){
            node newnode=new node(ndata);
            listcount++;
            if(head==null){
                head=newnode;
            }
            else{
                node refer=head;
                while(refer.next != null){
                    refer=refer.next;
                }
                refer.next=newnode;
            }
        }

        public void deletefirst(){
            if(head==null){
                System.out.println(" List is Empty  ");
            }
            else{
                listcount--;
                head=head.next;
            }
        }

        public void deleteany(int index){
            if(head==null){
                System.out.println(" List is Empty ");
            }
            else if (index >listcount){
                System.out.println(" List length is not present ");
                // System.out.println(" node are present "+ listcount);
                countlist();
            }
             else {
                listcount--;
                node refer=head;
                node secondr=head.next;
                for(int i=1;i<index-1;i++){
                    refer=refer.next;
                    secondr=secondr.next;
                }
                refer.next=secondr.next;
            
             }
        }


        public void deletelast(){
            listcount--;
            node refer=head;
            node secondr=head.next;

            while(secondr.next!= null){
                refer=refer.next;
                secondr=secondr.next;
            }
            refer.next=secondr.next;
        }


        public void printlist(){
            if(head==null){
                System.out.println(" Empty LinkedList");
            }
            else{
                node refer=head;
                while(refer != null){
                    System.out.print("[ "+refer.data +" ] -> ");
                    refer=refer.next;
                }
                System.out.println("null");
            }
            System.out.println();
        }


        public void countlist(){
            System.out.println(" Total Linked List is  : " + listcount );
        }

    

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        single_ll list=new single_ll();
        while (true) {
            System.out.println();
            System.out.println(" 1 :  addfirst    2 :  addany    3 :  addlast");
            System.out.println(" 4 : deletefirst  5 : deleteany  6 : deletelast");
            System.out.println(" 7 : printlist    8 : countlist  9 : exit ");
            System.out.print(" ENTER A CHOICE : ");
            int choice=input.nextInt();
            System.out.println();
            switch (choice) {
                
                case 1:
                    System.out.print(" enter value :");
                    int firstvalue=input.nextInt();
                    list.addfirst(firstvalue);
                 break;

                case 2:
                    System.out.print(" enter index : ");
                    int index=input.nextInt();
                    System.out.print(" enter value :");
                    int anyvalue=input.nextInt();
                    list.addany(index, anyvalue);
                 break;

                case 3:
                    System.out.print(" enter value : ");
                    int lastvalue=input.nextInt();
                    list.addlast(lastvalue);
                 break;

                case 4:
                    list.deletefirst();
                 break;

                case 5:
                    System.out.print(" enter index : ");
                    int anyindex=input.nextInt();
                    list.deleteany(anyindex);
                break;

                case 6:
                    list.deletelast();
                 break;

                case 7:
                list.printlist();
                 break;

                case 8:
                list.countlist();
                 break;

                case 9:
                 return;

                default:
                System.out.println(" enter a valid choice : ");
                    break;
            }

        }
        
    }
}     

