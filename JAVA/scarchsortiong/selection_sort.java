package scarchsortiong;
import java.util.Scanner;

public class selection_sort {

    public static void print(int array[],int size){
        for(int i=0;i<size;i++){
            System.out.print(array[i]);
        }
    }

    public static void selection(int array[],int size){
        for(int i=0;i<size-1;i++){
            int small=i;
            for(int j=i+1;j<size;j++){
                if(array[small] > array[j]){
                    small=j;
                }
            }
            int swap=array[i];
            array[i]=array[small];
            array[small]=swap;

        }

    }
    
    public static void main(String[]ares){
        Scanner input=new Scanner(System.in);
        int array[]=new int[5];
        for(int i=0;i<5;i++){
            System.out.print("enter number  : ");
            array[i]=input.nextInt();
        }
        int size=array.length;
        selection(array,size);
        print(array,size);

    }
}
