package Exception_Handle;

public class Throws_exception {
    public static void main(String[] args) throws ArithmeticException{
        

        try{
        int a=10;
        int b=0;
        System.out.println(a/b);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    
}
