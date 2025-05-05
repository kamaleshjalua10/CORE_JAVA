package basic_java;
import java.util.Scanner;

public class revers_no {

    public static void revers(int number){
        int rev=0;
        while(number > 0){
             rev=rev*10+(number % 10);
             number = number/10;
        }
        System.out.print(rev);

    }

    
    public static void main(String[]ares){
        Scanner inp=new Scanner(System.in);
        System.out.print("enter number :");
        int number=inp.nextInt();
        revers(number);

    }
}
