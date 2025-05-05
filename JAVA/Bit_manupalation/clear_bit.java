package Bit_manupalation;
public class clear_bit {
    public static void main(String[]ares){
        int n=5;
        int position=2;
        int shipt= 1 << position;
        int not= ~(shipt);
        int result= not & n;
        System.out.println(result);
    }
    
}
