package oops;

// single inheritance :- consists of one parent class and one child class inherits
//                       parent class method and data members

class animal{
    String name;
    int leg;
    int eye;
    public void eat(){
        System.out.println(" I am eating meat ");
    }

}
class lion extends animal{
    public void print(){
        System.out.println(" name "+ this.name);
        System.out.println(" leg "+this.leg);
        System.out.println(" eye "+ this.eye);
    }

}

public class single_inhri {
    public static void main(String[]ares){
        lion l=new lion();
        l.name="Lion";
        l.leg=4;
        l.eye=2;
        l.print();
        l.eat();

    }
    
}
