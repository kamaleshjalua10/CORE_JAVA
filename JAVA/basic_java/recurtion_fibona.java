package basic_java;
public class recurtion_fibona {

    public static void fibon(int number,int a,int b){
        if(number == 2){
            return;
        }
        int c=a+b;//0+1=1 //1+1=2 // 1+2=3 // 2+3= 5 // 3+5=8 // 5+8 =13 // 8+13 =21
        System.out.print(" "+c);
        
        int swap=b;
            b=c;
            a=swap;

        fibon(number-1,a,b);
            
    }
    public static void main(String[]ares){
        int number=10;
        int a=0,b=1;
        System.out.print(a);
        System.out.print(" "+b);
        fibon(number,a,b);

    }
}
