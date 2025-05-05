package basic_java;
class animal{
    String name;
    int age;
    public void print(String name,int age){
        System.out.println(this.name + this.age);
    }
    public void print(String name){
        System.out.println(this.name);
    }
    
}

public class object {
    public static void main(String[]ares){
        animal a=new animal();
        a.name="lion";
        a.age=10;
        a.print(a.name);
        a.print(a.name,a.age);
        
    
        
    }
    
}
