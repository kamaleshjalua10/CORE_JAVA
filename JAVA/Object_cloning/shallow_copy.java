package Object_cloning;

//  only use primitive datatype
//   not use  object type    like     Name  name;

class student implements Cloneable{
    String name;

    protected Object Clone ()throws CloneNotSupportedException{
        return super.clone();

    }
}

public class shallow_copy {
    public static void main(String[]ares)throws CloneNotSupportedException{
        student s1=new student();
        s1.name="k.bhai";

        student s2=(student) s1.Clone();   //  clone method calling
        s2.name="kamalesh";


        System.out.println(" Original  :  "+s1.name);       
        System.out.println(" copy      : "+s2.name);

        System.out.println(" if i could change one object value then not change  2nd object value");

    }
    
}
