package basic_java;
public class recurtion_sum {

    public static void recurtion(int number,int sum){

        System.out.println(number);
        if(number == 1){
            sum+=number;
            System.out.println(sum);
            return;
        }
        sum+=number;
        recurtion(number - 1,sum);
    
    }

    public static void main(String[]ares){
        int number = 5,sum=0;
        recurtion(number,sum);

    }
    
}
