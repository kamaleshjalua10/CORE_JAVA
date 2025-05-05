package Exception_Handle;

import java.util.Scanner;

public class Throw_exception {
    public static void main(String[]ares){

    try{
    checkage(19);
    }catch(Exception e){
        System.out.println(e.getMessage());
    }

    }

    public static void checkage(int mage){
        if(mage<18){
            throw new ArithmeticException(" Enter 18 + age ");
            
        }
        else{
            System.out.println(" valid ");
        }

    }
    
}
