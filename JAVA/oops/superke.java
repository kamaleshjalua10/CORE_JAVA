package oops;

class human {
    String name = "kamalesh";
    int age=20;
    public void printage(){
        System.out.println( " Superclass age : "+age);
    }
}

class ariandam extends human {
    String name = "ariandam";
    int age=18;

    public void printname() {     
        System.out.println();
        System.out.println(" Superclass name: " + super.name); // superclass  variable  
        System.out.println(" Subclass name: " + this.name);
    }

    public void printage(){
        super.printage();  // superclass  method
        System.out.println(" Subclass age : "+this.age);
    }
}

public class superke {
    public static void main(String[] args) {
        ariandam k = new ariandam();
        k.printname();
        k.printage();
    }
}
