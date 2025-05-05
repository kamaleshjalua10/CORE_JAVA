package basic_java;
import java.util.Scanner;

public class function {


    // function defination
    public static void evenorodd(int number){
        int count=0;
        for(int i=1;i<=number;i++){
            if(number % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println(number+"number is prime");
        }
        else{
            System.out.println(number+"number is not prime");
        }

    }

    // main
    public static void main(String[]ares){

        System.out.print("enter number :");
        Scanner inp=new Scanner(System.in);  
        int no=inp.nextInt();
        evenorodd(no);
    }
    
}
