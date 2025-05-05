
package collection_framework.list;

import java.util.*;


public class stack_List {
   public static void main(String[] args) {
    Stack <Integer> fstack=new Stack<>();

    //       PUSH
    fstack.push(10);
    fstack.push(20);
    fstack.push(30);
    fstack.push(40);
    fstack.push(50);
    fstack.push(60);
    System.out.println(fstack);

    //      POP
    fstack.pop();
    System.out.println(fstack);

    //        PEEK 
    System.out.println(fstack.peek());

    // while ( ! fstack.isEmpty()) {
    //     System.out.println(fstack.peek());
    //     int delete=fstack.pop();
 
    // }
   
   }
      
}
