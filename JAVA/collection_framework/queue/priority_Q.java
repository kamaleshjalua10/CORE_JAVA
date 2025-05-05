package collection_framework.queue;
import java.util.Comparator;
import java.util.PriorityQueue;

public class priority_Q {
    public static void main(String[]ares){              // order by maximum value   
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        //  ADD
        pq.offer(100);
        pq.offer(30);
        pq.offer(90);
        pq.offer(20);
        System.out.println(pq);

        //  PEEK
        System.out.println(pq.peek());

        //  REMOVE
        pq.poll();
        System.out.println(pq);
    }
    
}
