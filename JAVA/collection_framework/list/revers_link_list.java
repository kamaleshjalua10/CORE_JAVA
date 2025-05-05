package collection_framework.list;

import java.util.Collections;
import java.util.LinkedList;

public class revers_link_list {
    public static void main(String[]args){
        LinkedList<Integer> rll=new LinkedList<>();
        rll.addFirst(50);
        rll.addFirst(40);
        rll.addFirst(30);
        rll.addFirst(20);
        rll.addFirst(10);

        for(Integer j : rll){
            System.out.print(" ["+j+"] ->");
        }
        System.out.println();
        Collections.reverse(rll);
        for (Integer i : rll) {
            System.out.print(" ["+i+"] -> ");
        }
    }
}
