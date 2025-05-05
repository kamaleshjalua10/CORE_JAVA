package Problem_solve.Array;

public class rightrotate_array {

    public static int[] rotate(int arr[],int time){
        int range=arr.length;

        for(int i=0;i<time;i++){
            int temp=arr[range-1];

            for(int j=range-2;j>=0;j--){
                arr[j+1]=arr[j];
            }
            arr[0]=temp;
        }

        return arr;
    }

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int time=5;

        System.err.println(" Before ");
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i] + " ");
        }

        int arr2[]=rotate(arr,time);

        System.err.println(" After ");
        for(int i=0;i<arr.length;i++){
            System.err.print(arr2[i] + " ");
        }



    }
    
}
