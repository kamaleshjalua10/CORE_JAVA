package basic_java;
import java.util.Scanner;

public class parfectno {
    public static void main(String[]ares){
        int par=0;

        System.out.println("enter number :");
        Scanner inp=new Scanner(System.in);
        int number =inp.nextInt();

        for(int i=1;i<number;i++){
            if(i%2==0){
                par=par+i;
            }
        }
        if(par == number){
            System.out.println("number is parfact");
        }
        else{
            System.out.println("number is not parfact");
        }
    }
}
