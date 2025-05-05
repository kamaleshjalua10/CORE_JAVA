package Bit_manupalation;
public class set_bits {
   
   public static void main(String[]ares){
    int n=7;
    int posiition=3;
    int setbit= 1 << posiition;
   int result = n | setbit;
   System.out.println(result);

   System.out.print(result+"  binary code : ");

   while ( result  >0) {
      int mod=result%2;
      result/=2;
      System.out.print(mod);
   }

   }
}
