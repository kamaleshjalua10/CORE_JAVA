package basic_java;
import java.util.Scanner;

public class perfact_no {

    // perfact number with function

    public static void perfact(int number){
        int par=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                par+=i;
            }
        }
        if(par == number){
            System.out.println("number iis perfact");
        }
        else{
            System.out.println("number is not perfact");
        }
        
    }

    public static void main(String[]ares){
        while (true) {
        System.out.print("enter number :");
        Scanner inp=new Scanner(System.in);
        int no=inp.nextInt();
        perfact(no);

        }
    }
}
