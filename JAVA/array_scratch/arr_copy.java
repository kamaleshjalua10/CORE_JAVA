package array_scratch;

public class arr_copy {


    public static void revers(int arr2[]){
        for(int i=0;i<arr2.length/2;i++){
            int first=arr2[i];
            int second=arr2[arr2.length-i-1];

            arr2[i]=second;
            arr2[arr2.length-i-1]=first;
        }
    }
    public static void print(int arr2[]){
        for(int i=0;i<arr2.length;i++){
            System.out.print(" "+arr2[i]);
        }
        System.out.println();
    }
    public static void main(String[]ares){
        int arr[]={9,8,7,6,5,4,3,2,1};
        int arr2[]=new int [9];
        int i=0;
        // int j=1;

        while (i != arr.length) {
            int j=i;
            arr2[j]=arr[i];
            i++;
        }
        System.out.println(" arr2[] copy print : ");
        print(arr2);
        revers(arr2);
        System.out.println(" arr2[] revers print : ");
        print(arr2);

    }
}
