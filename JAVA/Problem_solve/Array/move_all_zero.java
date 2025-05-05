package Problem_solve.Array;

public class move_all_zero {


    public static void  movezero(int arr[]){
        int range=arr.length;
        int count=0;

        for(int i=0;i<range;i++){
            if(arr[i] ==0){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
    }

    static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]);
        }
    }
    

    public static void main(String args[]){
        int arr[]={1,6,0,2,0,3,0,1,0,0,6,0,6,5,3};
        print(arr);
        System.err.println();
        movezero(arr);
        print(arr);



    }
}
