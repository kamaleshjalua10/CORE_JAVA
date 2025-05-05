package Exception_Handle;

public class try_catch_finally {
    public static void main(String[]ares){

        try{
            System.out.println(10/0);

        }catch(Exception e){
            System.out.println(e.getMessage());

        }finally{         //  finally bolck always  execute Exception coming or not 
            System.out.println(" not divited");
        }
    }
    
}
