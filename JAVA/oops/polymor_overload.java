package oops;

class car2{
    String name;
    String color;
    int number;
    //                      @overloading
    public void print(String name,String color,int number){
        System.out.println(" Name : "+this.name);
        System.out.println(" color : "+this.color);
        System.out.println(" number : "+this.number);
        System.out.println();

    }   
    //                    @overloading
    public void print(String name,String color){
        System.out.println(" Name : "+this.name);
        System.out.println(" color : "+this.color);
 
    }
    //                @overloading
    public void print(int number){
        System.out.println(" number : "+this.number);


    }

}

public class polymor_overload {
    public static void main(String[]ares){
        car2 m=new car2();
        m.name="Mercedes";
        m.color="White";
        m.number=304050;
        m.print(m.name,m.color,m.number);

        car2 b=new car2();
        b.name="BMW";
        b.color="Black";
        b.number=101030;
        b.print(b.name,b.color);
        b.print(b.number);

    }
    
}
