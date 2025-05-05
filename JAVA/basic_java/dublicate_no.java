package basic_java;
import java.util.Scanner;

public class dublicate_no {

    public static void dublicate(int array[]){
        int count=0;
        
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(array[i]==array[j]){
                    System.out.println("dublicate is : "+array[i]);
                    count++;
                }
              
            }
          
        }
        if(count == 0){
            System.out.println("  dublicate value is not abalable ");
        }

    }
    
    public static void main(String[]ares){
        Scanner input = new Scanner(System.in);
        int array[]=new int[8];
        for(int i=0;i<5;i++){
            System.out.print("enter number :");
            array[i]=input.nextInt();
        } 
        dublicate(array);
    }
}
