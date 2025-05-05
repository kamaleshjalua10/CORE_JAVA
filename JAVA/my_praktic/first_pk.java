package my_praktic;

import java.util.ArrayList;
import java.util.List;

public class first_pk {
    public static void main(String[]ares)throws ArrayIndexOutOfBoundsException{

        List<Integer>li=new ArrayList<>();
        List<Integer>li2=new ArrayList<>();
        
        int i=0;   
        while(i<=50){
            if(i%2==0){
                li.add(i);
            }
            i++;         
        }      
        // for(int j=0;j<li.size();j++){
        //     if(li.get(j) % 5==1){
        //         li2.add(li.get(j));
        //     }
        // }
  
        System.out.println(li);
        System.out.println(li2);


    }
}
