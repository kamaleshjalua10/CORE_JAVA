package basic_java;

import java.math.*;

public class compair_decimal {
    public static void main(String[]ares){

        String no1="50";
        int no2=100;


        Integer in=Integer.valueOf(no1);
        BigDecimal bgin=BigDecimal.valueOf(in);

        BigDecimal bgno=BigDecimal.valueOf(no2);

 int result=bgin.compareTo(bgno);
 System.out.println(result);

    }
}
