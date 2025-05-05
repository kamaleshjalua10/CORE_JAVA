package basic_java;
public class findnext_no {

    public static void main(String[]ares){
        int array[]={1,3,4,5,6,8,9,10};
        for(int i=0;i<array.length;i++){
            int j=i+1;
            int val=array[i]+1;
            if(array[i]+1 == array[j]){
                System.out.println(array[i] +" next is " + array[j]);
            }
            else{
                System.out.println(array[i] + " next insert " + val);
            }
        }
    }
}