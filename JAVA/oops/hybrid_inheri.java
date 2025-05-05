package oops;

//    hybrid inheritance :- combination of multiple inheritance and multilevel 
//               inheritance . it is when a class inheris from two or more 
//              classes .and one of the parent classes is a derived class

class a{
    public void print(){
        System.out.println( " A");
    }

}
class b extends a{
    public void bprint(){
        System.out.println(" B");
    }

}



class c extends a{
    public void cprint(){
        System.out.println(" C");
    }

}
class d extends c{
    public void dprint(){
        System.out.println(" D");
    }

}

public class hybrid_inheri {
    public static void main(String[]ares){
        b bi=new b();
        bi.print();
        bi.bprint();

        c ci=new c();
        ci.print();
        ci.cprint();

        d di=new d();
        di.print();
        di.dprint();

    }
    
}
