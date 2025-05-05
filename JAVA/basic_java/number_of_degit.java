package basic_java;

import java.util.Scanner;

public class number_of_degit {
    public static void main(String[] args) {
    int no = 0, a = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter any number : ");
    no = scanner.nextInt();
    if(no<0)
    {
        no = no * -1;
    } else if (no==0) {
         no=1;
    }
    while(no>0){
        no=no/10;
        a++;
    }
    System.out.println("Number of digits in given number is :" +a);
    }
}