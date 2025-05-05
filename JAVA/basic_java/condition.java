package basic_java;
import java.util.Scanner;

public class condition {
    public static void main(String[]ares){
     System.out.print("entter age :");   
      Scanner inp=new Scanner(System.in); // scanner type object
      int age=inp.nextInt();
      if(age >18){
        System.out.println("you are elegible");
      }
      else if(age == 15){
        System.out.println("you are 10th pass");
      }
      else{
        System.out.println("you are not elegible");
      }
    }
}
