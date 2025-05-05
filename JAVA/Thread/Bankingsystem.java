package Thread;

class BankTransaction extends Thread {
    private String transactionType;
    private int amount;

    BankTransaction(String transactionType, int amount) {
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public void run() {
        System.out.println("Processing " + transactionType + " of Rs. " + amount);
    }
}

public class Bankingsystem {
    public static void main(String[] args) {
        BankTransaction t1 = new BankTransaction("Deposit", 5000);
        BankTransaction t2 = new BankTransaction("Withdrawal", 2000);

        t1.start();
        t2.start();
    }
}

