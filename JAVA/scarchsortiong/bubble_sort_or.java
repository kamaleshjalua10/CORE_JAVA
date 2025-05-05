package scarchsortiong;
import java.util.Scanner;

public class bubble_sort_or {

    public static void print(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(" "+arr[i]);
        }
    }

    public static void bubble(int arr[],int   size){

        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }
            }
        }
    }
    
    public static void main(String[]ares){
        Scanner input=new Scanner(System.in);
        int arr[]=new int[5];

        for(int i=0;i<5;i++){
            System.out.print("enter number : ");
            arr[i]=input.nextInt();
        }
        int size=arr.length;
        bubble(arr,size);
        print(arr,size);

    }
}
