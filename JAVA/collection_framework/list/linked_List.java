package collection_framework.list;

// import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

public class linked_List {
    public static void main(String[]ares){
        List<Integer> flist=new LinkedList<Integer>();


        // ADD
        flist.addFirst(20);
        flist.addFirst(30);                // insert first
        flist.addFirst(40);
        flist.addFirst(50);             
        flist.addFirst(60);
        flist.addLast(70);                  // insert last
        flist.add(2,100);          // insert position index value
        System.out.println(flist.get(3));   // show index value

        // SET
        flist.set(0, 9000);
        System.out.println(" set  : "+flist);

        //  GET
        System.out.println(" get any : "+flist.get(1));
        System.out.println(" get first :"+flist.getFirst());

        // CHECK
        System.out.println(" check : "+flist.contains(9000));

        // REMOVE
        flist.removeFirst();                  // remove first
        flist.removeLast();              // remove last
        flist.remove(3);          
        System.out.println();
        System.out.println(flist);


        // JOIN TWO ARRAY
        LinkedList<Integer>slist=new LinkedList<>();
        slist.add(10);               // add means add last 
        slist.add(20);
        System.out.println(" second List "+slist);

        LinkedList<Integer> tlist=new LinkedList<>();
        tlist.addFirst(50);
        tlist.addFirst(40);
        tlist.addFirst(30);
        System.out.println(" third List "+tlist);
        slist.addAll(tlist);                       //  add 2 type Linked List 

        System.out.println(" second and third LL"+slist);



        System.out.print(" itarator : ");
        for(int i=0;i<slist.size();i++){
            System.out.print("["+slist.get(i) +"] -> ");     // itarator
        }
        System.out.print(" null ");

        System.out.println();
        System.out.print(" for Each : ");
        for (Integer i : slist) {                       // for Each loop
            System.out.print("["+i+"] -> ");
        }
        System.out.println("null");


    }
}
