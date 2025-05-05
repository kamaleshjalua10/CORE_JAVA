package collection_framework.list;

import java.util.Collections;
import java.util.LinkedList;

public class rotate_link_list {
    public static void main(String[]ares){
        LinkedList <Integer> roll=new LinkedList<>();
        roll.addFirst(50);
        roll.addFirst(40);
        roll.addFirst(30);
        roll.addFirst(20);
        roll.addFirst(10);

        int time=3;
        for(Integer i: roll){
            System.out.print("["+i+"]->");
        }
        System.out.println();

        Collections.rotate(roll,time);

        for(int i=0;i<roll.size();i++){
            System.out.print("["+roll.get(i)+"] ->");
        }
    }
}
