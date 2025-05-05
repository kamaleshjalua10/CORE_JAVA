package scarchsortiong;
import java.util.Scanner;

public class binary_search {
    public static int binary(int arr[],int size,int find){
        int low=0,mid,high=size-1;
        while (low <=high) {
            mid=(low+high)/2;
            if(arr[mid] == find){
                return mid;
            }
            if(arr[mid]< find){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
       return -1;
    }

    public static void main(String[]ares){
        int size=6;
        int arr[]=new int[size];
        Scanner inp=new Scanner(System.in);
        for(int i=0;i<size;i++){
            System.out.print("enter number : ");
            arr[i]=inp.nextInt();
        }
        System.out.print(" find number : ");
        int number=inp.nextInt();

        int result=binary(arr, size, number);
        if(result == -1){
            System.out.println(" Element not found ");

        }
        else{
            System.out.println(" index is "+ result);
        }

    }


}
