package Problem_solve.Array;

import java.util.Arrays;

public class Second_large_no {

    static int secondlarge(int arr[]){
        int range=arr.length;
        Arrays.sort(arr);

        for(int i=range-2;i>=0;i--){
            if(arr[i] != arr[range-1]){
                return arr[i];
            }
            
        }

        return -1;
    }

    public static void main( String args[]){
        int arr[]={6,6,3,2,5,5,5,2,1};
        System.out.println("Second largest number is "+secondlarge(arr));

    }
    

}