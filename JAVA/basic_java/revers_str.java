package basic_java;
import java.util.Scanner;

public class revers_str {
    
    public static void main(String[]ares){
        // Scanner input=new Scanner(System.in);
        // System.out.print("enter string value : ");
        String name="kamalesh";
        
        for(int i=0;i<name.length()/2;i++){
            int first=i;
            int second=name.length()-1-i;

            char front=name.charAt(first);
            char back=name.charAt(second);

            name.replace(front,back);
            name.replace(back, front);

        }
        System.out.println(name);
        

    }
}
