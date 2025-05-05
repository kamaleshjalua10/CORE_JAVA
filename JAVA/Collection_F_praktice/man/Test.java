package Collection_F_praktice.man;

public class Test {
    public static void main(){
        ManArrylist ma=new ManArrylist();

        Man m1=new Man("kamalesh", 1, 20);
        Man m2=new Man("suva", 2, 21);
        Man m3=new Man("siba", 3, 21);

        ma.addmaan(m1);
        ma.addmaan(m2);
        ma.addmaan(m3);

        ma.toString();

        System.out.println(ma.toString());

        
    }
    
}
