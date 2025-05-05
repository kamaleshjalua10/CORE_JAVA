package Object_cloning;

//    THis Cloning Not a good pricktic 

class detalis{
    int roll;
}

public class cloning {
    public static void main(String[]ares){
        detalis d=new detalis();
        d.roll=10;

        detalis d2=d;
        d2.roll=100;


        System.out.println(" Original "+d.roll);
        System.out.println(" copy     " +d2.roll);

        System.out.println(" if  one object value are change then change second Object value  Its not a good pracktic ");

    }
}
