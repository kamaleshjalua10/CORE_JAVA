import java.util.Random;
// import java.util.Random.RandomGenerator;
public class randomno {
    public static void main(String args[]){

        Random r=new Random();

        long acno=r.nextLong(900000000000L);
        System.out.println(acno);
    }
    
}
