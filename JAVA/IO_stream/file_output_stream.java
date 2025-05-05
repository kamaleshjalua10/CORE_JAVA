package IO_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class file_output_stream {
    public static void main(String[]ares)throws FileNotFoundException{
        try{
        FileOutputStream fo=new FileOutputStream("kkk.txt",false);
        String name="kamalesh jalua";
        byte arr[]=name.getBytes();
        fo.write(arr);
        fo.close();
        System.out.println(" Write SuccessFully");

        }catch(Exception e){
            e.getStackTrace();

        }
    }
}
