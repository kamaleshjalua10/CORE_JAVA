package collection_framework.queue;

import java.util.ArrayDeque;

public class arraydeque {
    public static void main(String[]ares){
        ArrayDeque<Integer> aq =new ArrayDeque<>();   // implemment  ArrayDeque
        
        System.out.println(" add ");
        //   ADD
        
        aq.offer(20);
        aq.offerFirst(10);
        aq.offerLast(30);
        aq.offer(50);
        aq.offerLast(100);
        System.out.println(aq);

        System.out.println("  remove ");
        //  REMOVE 
        aq.poll();
        System.out.println(aq);
        
        aq.pollFirst();
        System.out.println(aq);

        aq.pollLast();
        System.out.println(aq);

        System.out.println(" peek ");
        // PEEK
        System.out.println(aq.peek());
        System.out.println(aq.peekFirst());
        System.out.println(aq.peekLast());
            
    
    }
}
