package collection_framework.collections_class;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class collections_class {
    public static void main(String[]ares){
        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(29);
        list.add(19);
        list.add(37);
        list.add(100);
        list.add(2);
        list.add(2);
        list.add(2);

        //   MIN
        System.out.println(" min value : "+Collections.min(list));

        // MAX
        System.out.println(" max value : "+Collections.max(list));

        //   Frequency
        System.out.println(" repeat   : "+Collections.frequency(list, 2));

        System.out.print(" sort   ");
        //    sort
        Collections.sort(list);
        for(Integer i : list){
            System.out.print(i +" ");
        }

        System.out.println();

        System.out.print(" Revers  ");
        // revers 

        Collections.reverse(list);
        for(Integer i : list){
            System.out.print(i +" ");
        }


        System.out.println();
        System.out.print(" rotate   ");
        Collections.rotate(list, 3);
        for(Integer i : list){
            System.out.print(i +" ");
        }

    }
}
