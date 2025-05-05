package oops;

class person1{
    String name;
    int age;
    static String village;
    static String post;

    public static void changevillage(){ // if change village name
        village=" Laluageria";
    }

    public void printd(){
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("Village :"+this.village);
        System.out.println("Post : "+this.post);
        System.out.println();
    }
}

public class Statickey_word {
    public static void main(String []ares){
        person1.village="purba dakshin moyna";
        person1.changevillage();              // call change  village  name
        person1.post="Kishorchok";
    

        person1 p=new person1();
        p.name="siba";
        p.age=21;
        p.printd();

        person1 s=new person1();
        s.name="suva";
        s.age=22;
        s.printd();

        person1 k=new person1();
        k.name="Kamalesh";
        k.age=20;
        k.printd();
        
    }
}
