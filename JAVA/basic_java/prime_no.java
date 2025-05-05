package basic_java;
import java.util.Scanner;

public class prime_no {
    public static void main(String[]ares){
        while(true){
            System.out.print("enter number :");
            Scanner inp=new Scanner(System.in);
            int no=inp.nextInt();
            int number=0;
            for(int i=1;i<=no;i++){
                if(no%i==0){
                    number++;
                }
            }
            if(number == 2){
                System.out.println(no+"  number is prime ");
            }
            else{
                System.out.println(no+"  number is not prime ");
            }
        }    
    }
}
