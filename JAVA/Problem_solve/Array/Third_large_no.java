package Problem_solve.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Third_large_no {

    static ArrayList<Integer> dubblicateno(ArrayList<Integer>list){
        ArrayList<Integer>newlist=new ArrayList<>();
       
        for(Integer i: list){
            if(!newlist.contains(i)){
                newlist.add(i);
            }
        }

        return newlist;

    }
    
    static int thirdno(ArrayList<Integer>slist){

        int range=slist.size();
        Collections.sort(slist);
        int value=0;

        for(int i=range-3;i>=0;i++){
            if(slist.get(i) != slist.get(range-2)){
                value= slist.get(i);
                break;
            }
        }
        return value ;
    }
        
        

    public static void main(String args[]) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1, 10, 1, 2,99,37,37,99,99,37,25,62, 2, 3, 3, 10, 3, 4, 5, 5));
        
       ArrayList<Integer>third=dubblicateno(arr);

       System.err.println(third);

       System.err.println("Third Largest number "+thirdno(third));

    }
}
