package Exception_Handle;

public class try_catch {
    public static void main(String[]ares){

        try{
        int a=10/0;
        System.out.println(a);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }        

    }
}
