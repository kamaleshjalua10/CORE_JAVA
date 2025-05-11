package leetcode_problem;

public class sum_two {

    public static int [] sumtwo(int arr[], int target){

        int arr2[]=new int[2];

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if( target- arr[i] == arr[j]){
                    arr2[0]=arr[i];
                    arr2[1]=arr[j];

                    return arr2;
                }
            }
        }

        return arr2;
    }


    public static void main(String[] args) {
        int arr[]={2,1,4,6,3,8,9};
        int target=9;

        int result[]=sumtwo(arr, target);

        System.out.println(result[0] + " " + result[1]);
        
    }
    
}
