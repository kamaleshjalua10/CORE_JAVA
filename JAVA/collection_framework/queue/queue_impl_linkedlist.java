package collection_framework.queue;

import java.util.LinkedList;
import java.util.Queue;

public class queue_impl_linkedlist {
    public static void main(String[]ares){
        Queue<Integer> qll=new LinkedList<>();   //  not insert addfirst and addlast 
                                        //  not remove removefirst and remopvelast 
            // ADD                                 
        qll.offer(10);                   
        qll.offer(20);
        qll.offer(30);
        qll.offer(40);
        System.out.println(qll);

        // REMOVE
        qll.poll();
        System.out.println(qll);

        // PEEK
        System.out.println(qll.peek());


    }
}
