package Bit_manupalation;
import java.util.Scanner;
public class update_bite {
    public static void main(String[]ares){
        System.out.print("enter 0 or 1 : ");
        Scanner input=new Scanner(System.in);
        int option = input.nextInt();
        int n=5;
        int position=1;
        if(option == 1){
            int shipt= 1<<position;
            int result=shipt|n;
            System.out.println(result);
        }
        else{
            int position2=2;
            int shipt2=1<<position2;
            int not= ~(shipt2);
            int result2= not & n;
            System.out.println(result2);
        }
    }
}
