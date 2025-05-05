package collection_framework.Map;
import java.util.Map;
import java.util.TreeMap;

public class Tree_Map {
    public static void main(String[]ares){
        Map<Integer,String>tmap=new TreeMap<>();

        //   ADD
        tmap.put(10, "kamalesh");
        tmap.put(200, "siba");
        tmap.put(3, "suva");
        System.out.println(tmap);


        // remove 
        tmap.remove(10);

        System.out.println(" remove : " + tmap);

         //   PutIfAbsent
         tmap.putIfAbsent(4,"jalua");
         System.out.println(tmap);

        //   Check Key
        System.out.println(tmap.containsKey(2));

        //   Check Value
        System.out.println(tmap.containsValue("kamalesh"));

          //   Iterator  Kay  and Value
          for(Map.Entry<Integer,String> e : tmap.entrySet()){
            System.out.println(e);

            System.out.println(e.getKey());
            System.out.println(e.getValue());
          }

          //    Iterator  Kay
          for(Integer key : tmap.keySet()){
            System.out.println(key);

          }

          //   Iterator  Value

          for(String value: tmap.values()){
            System.out.println(value);
          }


    }
    
}
