package array_scratch;
import java.util.Scanner;

public class array_rotate{
    public static void rotate(int arr[],int size,int time){
        for(int i=0; i<time; i++){
            int temp = arr[0];
            for(int j=1; j<size; j++){
                arr[j-1] = arr[j];
            }
            arr[size-1] = temp;
        }

    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
  
    public static void main(String[]ares){
    Scanner input=new Scanner(System.in);
    int arr[]={1,2,3,4};
    int size=arr.length;
    System.out.print(" how many time rotate : ");
    int time=input.nextInt();
    print(arr);
    rotate(arr,size,time);
    print(arr);
    

    }
}
