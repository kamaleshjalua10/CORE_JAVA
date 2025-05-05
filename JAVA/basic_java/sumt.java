package basic_java;
import java.util.Scanner;

public class sumt {
    public static void main(String[] args) {
        System.out.print("enter first no :");
        Scanner Sc=new Scanner(System.in);
        int a=Sc.nextInt();
        System.out.print("enter second no :");
        int b=Sc.nextInt();
        int sum=a+b;
        System.out.println(sum);

    }
}
