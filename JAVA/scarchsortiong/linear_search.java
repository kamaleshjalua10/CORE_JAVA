package scarchsortiong;
import java.util.Scanner;

public class linear_search {
    public static int linearsearch(int array[],int size,int find){
        for(int i=0;i<size;i++){
            if(array[i]==find){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[]ares){
      Scanner inp=new Scanner(System.in);
      System.out.print("enter array size : ");
      int size=inp.nextInt();
      int array[]=new int [size];
      for(int i=0;i<size;i++){
        System.out.print("enter number : ");
        array[i]=inp.nextInt();
      }
      System.out.print("find number : ");
      int find=inp.nextInt();
      int result=linearsearch(array,size,find);
      if(result == -1){
        System.out.println("number is not prasent ");
      }
      else{
        System.out.println("number is  prasent "+result);
      }
        
    }
}
