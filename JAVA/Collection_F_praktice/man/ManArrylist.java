package Collection_F_praktice.man;

import java.util.ArrayList;
import java.util.List;

public class ManArrylist {
    private List<Man>m;

    public ManArrylist(){
        m=new ArrayList<>();
    }

    public void addmaan(Man man){
        m.add(man);
    }

    @Override
    public String toString() {
        return "ManArrylist [m=" + m + "]";
    }

    

    
    
}
