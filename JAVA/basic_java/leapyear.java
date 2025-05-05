package basic_java;
import java.util.Scanner;

public class leapyear {
    public static void main(String[]ares){
        System.out.print("enter year :");
        Scanner inp=new Scanner(System.in);
        int year=inp.nextInt();
        if(year % 400 == 0 || year % 4 ==0){
            System.out.println(year +"  year is leapyer");
        }
        else{
            System.out.println(year +"  year not leapyer");
        }
    }
}

