package collection_framework.Array_class;
import java.util.Arrays;

public class array_class {
    public static void main(String[]ares){

        //    binary search
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println(" Index : "+ Arrays.binarySearch( arr, 7));

        //      sort
        System.out.println(" Sort ");
        int arr2[]={5,3,8,1,0,4,7,2,6};
        Arrays.sort(arr2);
        for(Integer i : arr2){
            System.out.print(" "+ i);
        }
        System.out.println();


        //   Fill
        System.out.println(" Fill ");
        Arrays.fill(arr2,99);
        for(Integer i : arr2){
            System.out.print(" "+ i);
        }
        




        
    }
}
