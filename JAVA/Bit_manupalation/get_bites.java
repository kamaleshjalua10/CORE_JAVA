package Bit_manupalation;
public class get_bites {
    public static void main(String[]ares){
        int number=7;
        int position=2;
        int bit= 1 << position;

        if((bit & number) ==0){
            System.out.println("number is  0 ");
        }
        else{
            System.out.println("number is  1");
        }
    }
}
