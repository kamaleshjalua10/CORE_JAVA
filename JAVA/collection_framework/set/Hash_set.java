package collection_framework.set;
import java.util.Set;
import java.util.HashSet;

public class Hash_set {
    public static void main(String[]ares){
        Set<Integer> set=new HashSet<>();
        //          ADD
        set.add(20);
        set.add(10);
        set.add(27);
        set.add(18);
        set.add(18);
        System.out.println(set);

        //   Remove
        set.remove(20);
        System.out.println(set);

        //  Check 
        System.out.println(set.contains(20));

        //   Size
        System.out.println(set.size());

        //  isEmpty
        System.out.println(set.isEmpty());



    }
    
}
