package java_project;
import java.util.Scanner;

class atm{
    double balance =394.1;
    int pin = 2003;

    public void firstpin(){
        System.out.print("Enter PIN : ");
        Scanner input=new Scanner(System.in);
        int wpin=input.nextInt();

        if(wpin == pin){
            display();
        }
        else{
            System.out.println("Enter valid PIN");
            System.out.println();
            firstpin();
        }
    }
    
    public void enterpin(){
        System.out.print(" Enter PIN : ");
        Scanner input=new Scanner(System.in);
        int epin=input.nextInt();

        if(epin == pin){
            System.out.println(" PIN is Correct ");
        }
        else{
            System.out.println(" PIN is inCorrect ");
            enterpin();
        }
        
    }
    public void forgetpin(){
        Scanner input4= new Scanner(System.in);
        System.out.print(" Enter A new Pin : ");
        int newpin=input4.nextInt();
        pin=newpin;
        System.out.println(" Pin forget Successfully ");
        System.out.println();
        display();
    }

    public void display(){
        Scanner input2=new Scanner(System.in);
        System.out.println(" 1 : WiTHDRAWAL      2: ADD MONEY ");
        System.out.println(" 3 : CHACK BALANCE   4: EXIT ");
        System.out.println(" 5 : Forget PIN ");
        System.out.println();
        System.out.print(" Enter a Choice : ");
        int option=input2.nextInt();
        switch (option) {
            case 1:
                withdrawal();
                break;
            case 2:
                addmoney();
                break;
            case 3:
                checkbalance();
                break;
            case 4:
                return;
                // break;
            case 5:
                  forgetpin();
                break;                             
            default:
                System.out.println(" Enter valid option ");
                System.out.println();
        }
        display();

    }

    public void withdrawal(){
        Scanner input2= new Scanner(System.in);
        System.out.print(" Enter Amount : ");
        float amount=input2.nextFloat();
        enterpin();
        if(amount == balance || amount < balance){
            balance = balance - amount;
            System.out.println(" Withdrawal Successfull ");
        }
        else{
            System.out.println( " This balance not available ");
            return;
        }
        System.out.println();
        display();
    }

    public void addmoney(){
        Scanner input3=new Scanner(System.in);
        System.out.print(" Enter Amount : ");
        float addamount= input3.nextInt();
        enterpin();
        balance = balance+addamount;
        System.out.println(" Money deposite Successfull ");
        System.out.println();
        display();
    } 

    public void checkbalance(){
        enterpin();
        System.out.println(" Bank Balance  "+ balance);
        System.out.println();
        display();
    }

}

public class project1Atm {
    public static void main(String[]ares){
        System.out.println();
        System.out.println(" ----    Welcome To ATM  -----  ");
        atm sbi = new atm();
        sbi.firstpin();

    }
}
