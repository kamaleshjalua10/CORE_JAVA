package oops;

abstract class car4{
    public String name;
    public int speed;
    public int gear;
    // abstract public void print();
    abstract public void speed();
    abstract public void gear();

}
class audi extends car4{
    // public void print(){
    //     System.out.println(" Name  "+this.name);
    // }
    @Override
    public void speed(){
        System.out.println(" Speed is "+ this.speed +"/ Hours");
    }
    @Override 
    public void gear(){
        System.out.println(" Gear is  "+ this.gear);
        System.out.println();

    }

}

class mclarn extends car4{
    @Override  // method override
    public void speed(){
        System.out.println(" Speed is  "+ this.speed+ "/ Hours");

    }
    @Override  // method override
    public void gear(){
        System.out.println(" Gear is "+ this.gear);
    }

}

public class abstraction {
    public static void main(String[]ares){

        audi a=new audi();
        a.name="Audi";
        a.speed=300;
        a.gear=7;
        // a.print();
        System.out.println(" Name  "+ a.name);
        a.speed();
        a.gear();

        mclarn m=new mclarn();
        m.name="Mclaren";
        m.speed=350;
        m.gear=8;
        System.out.println(" Name "+m.name);
        m.speed();
        m.gear();

    }
    
}
