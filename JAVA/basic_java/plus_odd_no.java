package basic_java;
import java.util.Scanner;

public class plus_odd_no {
    // even number plus value with function

    public static void plusvalue(int number){
        int odd=0,result;
        int array[]=new int[10];
        while (number >0) {
             result=number%10;
            number=number/10;
            if(result % 2 !=0){
                 odd+=result;
                 System.out.println("odd number is  "+result);
            }           
        }

        System.out.println("Total odd number sum is  "+odd);

    }

    public static void main(String[]ares){
        while (true) {
        System.out.print("enter any big degit number :");
        Scanner inp=new Scanner(System.in);
        int no=inp.nextInt();
        plusvalue(no);
        }
    }
    
}
