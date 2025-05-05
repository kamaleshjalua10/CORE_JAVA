package basic_java;
public class scompareto {
    public static void main(String[]ares){
        String name1="kamalesh";
        String name2="kamalesh";
        if(name1.compareTo(name2) == 0){
            System.out.println("equel");
        }
        else if (name1.compareTo(name2) > 0) {
            System.out.println("big");
        } 
        else {
            System.out.println("not");
        }
    }
}
