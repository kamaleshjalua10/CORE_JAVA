package generic;


public class generic_class {
    public static void main(String[]ares){
        manh<String,Integer> ka =new manh<>("kamalesh",10);
        ka.getfirst();
        ka.getsecond();

        manh<Integer,String>ka2=new manh(20, "jalua");
        ka2.getfirst();
        ka2.getsecond();
       
    }   
}

class manh  <N,I > {              //    generic class  define

    N first;
    I second;

    public manh(N fst,I scond){
        this.first=fst;
        this.second=scond;

    }

    public void  getfirst(){
        System.out.println(first);
    }

    public void getsecond(){
        System.out.println(second);
    }

}
