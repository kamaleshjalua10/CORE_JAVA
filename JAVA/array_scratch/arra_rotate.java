package array_scratch;

public class arra_rotate{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int size=arr.length;
        int time=3;
        for(int i=0; i<time; i++){
            int temp = arr[0];
            for(int j=1; j<size; j++){
                arr[j-1] = arr[j];
            }
            arr[size-1] = temp;
        }
    
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
