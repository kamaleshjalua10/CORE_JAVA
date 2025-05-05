package String;

import java.util.Scanner;

public class revers_string {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a string: ");
 String input = scanner.nextLine();
 char ch;
 String nstr = "";

 for (int i = 0; i < input.length(); i++) {
    ch = input.charAt(i);
    nstr = ch + nstr;
 }
    System.out.println("Reversed String is : " + nstr);

 }
}
