package Problem_solve.Array;

public class revers_array{



    public  static int[] reversarray(int arr[]){
        int range=arr.length;

        for(int i=0;i<range/2;i++){
            int first=arr[i];
            int second=arr[range-i-1];

            arr[i]=second;
            arr[range-i-1]=first;
        }

        return arr;
    }

    public static void main(){
        int arr[]={2,4,1,6,4,7,4,7,8,3,90};

        System.err.println(" Before");
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i] +" ");
        }
        int arr2[]=reversarray(arr);

        System.err.println(" After ");
        for(int i=0;i<arr2.length;i++){
            System.err.print(arr2[i] +" ");
        }


    }

}