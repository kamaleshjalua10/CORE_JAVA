package IO_stream;

import java.io.File;
import java.io.IOException;

public class files {
    public static void main(String[]ares)throws IOException{
        //  create a new file
        File fi=new File("myfile.java");
        fi.createNewFile();
        System.out.println(fi.isFile());

        System.out.println(fi.getAbsolutePath());
        System.out.println(fi.getName());
        System.out.println(fi.getParentFile());


        //  create a new folder
        // File f=new File("kj.java");
        // f.mkdir();
        // System.out.println(f.isDirectory());
    

    }
    
}
