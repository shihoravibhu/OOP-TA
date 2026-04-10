import java.util.Scanner;

class InSufficientFundException2 extends Exception {

    InSufficientFundException2(String message) {
        super(message);
    }

}

class Account2 {
    int balance = 5000;

    void deposit(int amt) {
        balance += amt;
        System.out.println("Balance: " + balance);
    }

    void withdraw(int amt) {
        try {

            if (balance - amt < 2000) {

                throw new InSufficientFundException2("Withdrawal denied! Minimum balance of 2000 must be maintained.");

            }

            balance -= amt;
            System.out.println("Balance: " + balance);

        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class A2_P2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account2 a = new Account2();

        System.out.print("Deposit: ");
        a.deposit(sc.nextInt());

        System.out.print("Withdraw: ");
        a.withdraw(sc.nextInt());

        sc.close();
        
    }
}
