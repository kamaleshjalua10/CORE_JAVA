package Problem_solve.Array;

public class leftrotate_array {
    

    public static int[] rotate(int arr[] , int time){

        int range=arr.length;

        for(int i=0; i<time-1; i++){
            int temp = arr[0];
            for(int j=1; j<range; j++){
                arr[j-1] = arr[j];
            }
            arr[range-1] = temp;
        }


        return arr;
    }


    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int time=4;

        System.err.println(" Before");
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i] +" ");
        }

        int arr2[]=rotate(arr ,time);

        System.err.println("After ");
        for(int i=0;i<arr2.length;i++){
            System.err.print(arr2[i]+" ");
        }



    }
}
