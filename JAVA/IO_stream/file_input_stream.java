package IO_stream;

import java.io.FileInputStream;
import java.io.IOException;

public class file_input_stream {
    public static void main(String[]ares)throws IOException{
        try{
            FileInputStream fi=new FileInputStream("kkk.txt");
            int size=fi.available();
            byte arr[]=new byte[size];
            System.out.println("Size in kkk.txt  File :  "+arr.length);
            fi.read(arr);
            String str=new String(arr);
            System.out.println(" READ kkk.txt  File  : "+str);
        }catch(Exception e){
            System.out.println(e.getMessage());

        }

    }
}
