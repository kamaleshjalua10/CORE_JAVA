package IO_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class copy_image_one_to_other {
    public static void main(String[]ares)throws FileNotFoundException{
        try{

            //  Read the Image  Data                   //  copy image 
            // FileInputStream fi=new FileInputStream("C:\\Users\\chris\\OneDrive\\Documents\\javaprogram\\JAVA\\IO_stream\\mycar.jpg");
            FileInputStream fi=new FileInputStream("C:\\Users\\chris\\Downloads\\wine1.jpg");
            int size=fi.available();
            byte arr[]=new byte[size];
            System.out.println(arr.length);
            fi.read(arr);

            //   Write to The target  File        //  paste the image other file
            FileOutputStream fo=new FileOutputStream("C:\\Users\\chris\\OneDrive\\Documents\\javaprogram\\JAVA\\IO_stream\\one2.png");
            fo.write(arr);
            fi.close();
            fo.close();
            System.out.println(" successfully ");
        }catch(Exception e){
            e.getStackTrace();
        }
    }
    
}
