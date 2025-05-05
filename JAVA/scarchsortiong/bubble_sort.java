package scarchsortiong;
import java.util.Scanner;

public class bubble_sort {

    public static void printarray(int array[],int size){
        for(int i=0;i<size;i++){
            System.out.print(" "+array[i]);
        }

    }

    public static void Innerbubble_sort(int array[],int size) {
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(array[i] > array[j]){
                    int shipt=array[i];
                    array[i]=array[j];
                    array[j]=shipt;
                }
            }
        }    
        
    }
    public static void main(String[]ares){
        Scanner input=new Scanner(System.in);
        int array[]=new int [5];
        for(int i=0;i<5;i++){
            System.out.print("enter number : ");
            array[i]=input.nextInt();
        }
        int size=array.length;

        Innerbubble_sort(array,size);
        printarray(array,size);
        
    }
}
