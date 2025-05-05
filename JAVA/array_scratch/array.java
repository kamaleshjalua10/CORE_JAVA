package array_scratch;
import java.util.Scanner;

public class array{
    public static  void main(String[]ares){
        System.out.println("enter array size :");
        Scanner inp=new Scanner(System.in);
        int size=inp.nextInt();
        int array[]=new int [size]; // array size input

        // arrayy value input
        
        for(int i=0;i<size;i++){
            System.out.print("input array value : ");
            array[i]=inp.nextInt();
        }

        // array value print
        System.out.println("show array value ");
        for(int i=0;i<size;i++){
            System.out.println(array[i]);
        }


    }
}
