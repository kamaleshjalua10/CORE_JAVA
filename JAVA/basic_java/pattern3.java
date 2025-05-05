package basic_java;
public class pattern3 {
    public static void main(String[]ares){
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
