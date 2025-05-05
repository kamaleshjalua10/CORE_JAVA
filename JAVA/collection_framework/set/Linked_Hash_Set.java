package collection_framework.set;
import java.util.Set;
import java.util.LinkedHashSet;

public class Linked_Hash_Set {
    public static void main(String[]ares){
        Set<Integer> lhs=new LinkedHashSet<>();

        //  ADD
        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(30);
        lhs.add(40);
     
        System.out.println(lhs);

        //   REMOVE
        lhs.remove(30);
        System.out.println(lhs);

        //    SIZE
        System.out.println(lhs.size());

        //      check
        System.out.println(lhs.contains(10));

        //    isEmpty
        System.out.println(lhs.isEmpty());

    }
}
