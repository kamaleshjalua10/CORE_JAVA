package array_scratch;
import java.util.Scanner;

public class array_revarse {
    public static void print(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }

    public static void revarse(int arr[],int size){
        for(int i=0;i<size/2;i++){
            int first=arr[i];
            int second=arr[size-i-1];

            arr[i]=second;
            arr[size-i-1]=first;

        }
    }

    public static void main(String[]ares){
        Scanner input=new Scanner(System.in);
        int arr[]=new int [6];
        for(int i=0;i<6;i++){
            System.out.print("enter number : ");
            arr[i]=input.nextInt();
        }
        int size=arr.length;
        revarse(arr,size);
        print(arr,size);     

    }
}
