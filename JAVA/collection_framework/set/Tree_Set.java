package collection_framework.set;

import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {
    public static void main(String[]ares){

        Set<Integer> tree=new TreeSet<>();
        //    ADD
        tree.add(10);
        tree.add(200);
        tree.add(30);
        tree.add(50);
        tree.add(19);
        tree.add(19);
        System.out.println(tree);
        
        //     Size
        System.out.println(tree.size());
        //  Check
        System.out.println(tree.contains(30));

        //  Remove
        tree.remove(19);
        System.out.println(tree);

        //   isEmpty
        System.out.println(tree.isEmpty());
    }
    
}
