package basic_java;
import java.util.Scanner;

public class dec_to_binary_con {
     public static void main(String[]ares){
        System.out.print("enter number : ");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        int no=0;
        while (number > 0) {    
            no=number%2;
            number=number/2;
            System.out.print(no);
        }
        
    }
    
}
