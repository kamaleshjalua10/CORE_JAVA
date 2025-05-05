package oops;

//   multi level inheritance :- A class extends to another class that is alrady extended 
//                              from another class

class car{
    String name;
    String  color;
    int number;
    int speed;
    public void print(){
        System.out.println(" name  : " + this.name);
        System.out.println(" color : "+this.color);
        System.out.println(" number : "+this.number);
    }
}
class mercedes extends car{
    public void speedm(){
        System.out.println(" my speed is "+this.speed +" /Hours");
    }
    public void country(){
        System.out.println(" I am from germany company ");
        System.out.println();
    }

}
class bmw extends mercedes{
    public void speedb(){
        System.out.println(" my speed is "+ this.speed +" Hours");
    }

}

public class multilev_inheri {
    public static void main(String[]ares){
        mercedes m=new mercedes();
        m.name="MERCEDES";
        m.color="Black";
        m.number=102030;
        m.speed=170;
        m.print();
        m.speedm();
        m.country();

        bmw b=new bmw();
        b.name="BMW";
        b.color="Blue";
        b.number=405060;
        b.speed=150;
        b.print();
        b.speedb();
        b.country();

    }
    
}
