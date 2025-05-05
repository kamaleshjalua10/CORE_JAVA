package oops;

//     Hierarchical inheritance :- is a more than one sub class inherits the 
//                                  propatiy of a single base class

class animal2{
    String name;
    int leg;

    public void print(){
        System.out.println(" name : "+ this.name);
        System.out.println(" leg  : "+this.leg);

    }
    public void living(){
        System.out.println(" I am living in the forest ");
    }

}
class lion2 extends animal2{
    public void eating(){
        System.out.println(" I am eating meat ");
    }
    public void lnationality(){
        System.out.println(" King of Forest ");
        System.out.println();
    }

}
class tiger extends animal2{
    public void eating(){
        System.out.println(" I am eating meat ");
    }
    public void tnationality(){
        System.out.println("I am national Animal");
        System.out.println();
    }

}
class deer extends animal2{
    public void eating(){
        System.out.println(" I am eating pland ");
        System.out.println();
    }

}

public class hierarchial_inheri {
    public static void main(String[]ares){
        lion2 l=new lion2();
        l.name="Lion";
        l.leg=4;
        l.print();
        l.living();
        l.eating();
        l.lnationality();

        tiger t=new tiger();
        t.name="Tiger";
        t.leg=4;
        t.print();
        t.living();
        t.eating();
        t.tnationality();

        deer d=new deer();
        d.name="Deer";
        d.leg=4;
        d.print();
        d.living();
        d.eating();

    }
}
