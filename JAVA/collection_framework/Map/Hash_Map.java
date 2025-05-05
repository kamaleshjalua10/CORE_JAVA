package collection_framework.Map;
import java.util.Map;
import java.util.HashMap;


public class Hash_Map {
    public static void main(String[]ares){
        Map<Integer,String> hmap=new HashMap<>();

        //   ADD
       
        hmap.put(200, "siba");
        hmap.put(1,"kamalesh");
        hmap.put(30,"suva");
        hmap.put(4, "mini");      
        hmap.put(4,"sandy"); // override
        System.out.println(hmap);

        //   remove 
        hmap.remove(1);
        System.err.println(" remove "+hmap);

        //   PutIfAbsent
        hmap.putIfAbsent(4,"jalua");
        System.out.println(hmap);



        //     Check Key
        System.out.println(hmap.containsKey(2));

        //   Check Value
        System.out.println(hmap.containsValue("kamalesh"));

        //   Iterator  Kay  and Value
        for(Map.Entry<Integer,String>e : hmap.entrySet()){
            System.out.print(e +" | ");

            // System.out.print(e.getKey());       only key print
            // System.out.print(e.getValue());    only value print
        }

        System.out.println();
        // Iterator Key

        for(Integer key : hmap.keySet()){
            System.out.println(" key : " +key);
        }

        System.out.println();
        
         // Iterator Value

         for(String value : hmap.values()){
            System.out.println(" value : "+value);
         }



    }
}
