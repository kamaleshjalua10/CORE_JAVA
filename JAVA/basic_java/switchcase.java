package basic_java;
import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        
        System.out.print("enter two number :");
        Scanner inp=new Scanner(System.in);
        int first=inp.nextInt();
        int second=inp.nextInt();

        switch (first) {
            case 1 :
             int third=first+second;
                System.out.println(third);
                break;
        
            default:
                break;
        }
    }
    
}
