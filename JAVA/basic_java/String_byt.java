package basic_java;
public class String_byt {
    public static void main(String[]ares){
        String str="A";
        byte arr[]=str.getBytes();

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
