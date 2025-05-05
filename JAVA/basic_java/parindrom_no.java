package basic_java;
import java.util.Scanner;

public class parindrom_no {

    public static void parindrom(int number){
        int pd=0,i;
        while(number > 0){
            i=number % 10;
            pd=i+(pd*10);
            number =number/10;
        }
    }
    
    public static void main(){
        Scanner input = new Scanner(System.in);
        int number=input.nextInt();
        
        parindrom(number);

    }
}
