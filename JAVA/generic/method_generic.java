package generic;

public class method_generic {
    public static void main(String[]ares){

        printdata(20);
        printdata("kamalesh");

    }

    static <E>void printdata(E data){       //   method generic define 
        System.out.println(data);
    }
}
