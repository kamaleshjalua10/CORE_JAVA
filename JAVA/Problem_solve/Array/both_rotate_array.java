package Problem_solve.Array;

import java.util.Scanner;

public class both_rotate_array { 

    public static void rotate(int arr[],int time , String position){

        int range=arr.length;

        if(position.equalsIgnoreCase("right")){
            for(int i=0;i<time;i++){
                int temp=arr[range-1];

                for(int j=range-2;j>=0;j--){
                    arr[j+1]=arr[j];
                }
                arr[0]=temp;
            }
        }
        if(position.equalsIgnoreCase("left")){
            for(int i=0;i<time;i++){
                int temp=arr[0];

                for(int j=1;j<range;j++){
                    arr[j-1]=arr[j];
                }
                arr[range-1]=temp;
            }


        }    

    }

    public  static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i] + " ");
        }
    }


    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9,10};

        System.err.print(" Enter rotate Time : ");
        int time=input.nextInt();

        System.err.print(" Enter rottate Position : ");
        String position=input.next();

        printarray(arr);
        System.err.println();
        rotate(arr,time,position);
        System.err.println();
        printarray(arr);




    }
}
