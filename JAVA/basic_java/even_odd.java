package basic_java;
import java.util.Scanner;

// even or odd  with function
public class even_odd {

    public static void evenodd(int number){
        if(number %2==0){
            System.out.println("number is event");
        }
        else{
            System.out.println("number is odd");
        }
        
    }

    public static void main(String[]ares){

        while (true) {
        System.out.print("enter number :");
        Scanner inp=new Scanner(System.in);
        int no=inp.nextInt();

        evenodd(no);
      
        }
    }
}
