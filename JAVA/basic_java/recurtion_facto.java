package basic_java;
public class recurtion_facto {

    public static int factorial(int number){
        int mul=1;
        if(number == 1){
            return 1;
        }
        int fac=factorial(number-1);
        int result =number * fac;
        
        return result;
    }
    
    public static void main(String[]ares){
        int number=5;
        
        System.out.println(factorial(number));

    }
}
