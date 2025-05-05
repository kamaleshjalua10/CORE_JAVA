package scarchsortiong;
import java.util.Scanner;

public class insertion_sort {

    public static void print(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
        }
    }

    public static void selection(int arr[],int size){
        for(int i=1;i<size;i++){
            int key=arr[i];
            int j=i-1;
            while(j>= 0 && arr[j] > key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }

    }

    public static void main(String[]ares){
        Scanner input=new Scanner(System.in);
        int arr[]=new int [5];
        for(int i=0;i<5;i++){
            System.out.print("enter number : ");
            arr[i]=input.nextInt();
        }
        int size=arr.length;
        selection(arr,size);
        print(arr,size);


    }
    
}
