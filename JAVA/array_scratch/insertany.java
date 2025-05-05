package array_scratch;
import java.util.Scanner;

public class insertany {
    public static void print(int arr[],int usesize){
        for(int i=0;i<usesize;i++){
            System.out.print(arr[i] +" ");
        }

    }

    public static void insertfirst(int arr[],int usesize,int number,int index){
        for(int i=usesize;i>=index;i--){
            arr[i+1]=arr[i];
        }
        arr[index]=number;

    }

    public static void main(String[]ares){
        Scanner input = new Scanner(System.in);
        int total=8;
        int arr[]= new int[total];
        int usesize=5;
        for(int i=0;i<usesize;i++){
            System.out.print("Enter number : ");
            arr[i]=input.nextInt();
        }
        insertfirst(arr,usesize,20,1);
        usesize++;
        print(arr,usesize);


    }

}
    
