// import java.util.*;
package oops;

interface man{
    public void person(String name);
    public  void sleep(int sleep);
    public void eat();
  
}

class kamalesh implements man{
    String name;
    @Override
    public void person(String kname){
        name=kname;
         System.out.println("Name "+ name);
    
     }
    @Override
    public void sleep(int sleep){
        System.out.println("  Sleep "+ sleep +"/ hours");
    }
    @Override
    public void eat(){
        System.out.println("  Eats half vag half non-vag ");
        System.out.println();
    }
   
}

class suva implements man{
    String name;
   
    @Override
    public void person(String sname){
        name=sname;
        System.out.println(" Name "+name);
    }
    @Override
    public void sleep(int sleep){
        System.out.println("  Sleep "+sleep+"/hours");
    }
    @Override
    public void eat(){
        System.out.println("  Eats helf vag or Full non-vag ");
        System.out.println();
    }
    
}

class siba implements man{
    String name;
    
    @Override
    public void person(String names){
        name=names;
        System.out.println(" Name "+name);
    }
    @Override
    public void sleep(int sleep){
        System.out.println("  Sleep "+sleep+"/ hours");
    }
    @Override
    public  void eat(){
        System.out.println("  Eats both full vag or full non-vag ");
    }
   
}

public class interfac {
    public static void main(String[]ares){
        man k=new kamalesh();
        k.person("kamalesh");
        k.sleep(8);
        k.eat();
       
        man s=new suva();
        s.person("Suva");
        s.sleep(10);
        s.eat();

        man si=new siba();
        si.person("Siba");
        si.sleep(12);
        si.eat();


    }
    
}
