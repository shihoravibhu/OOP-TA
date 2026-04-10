// 2. Write a program to create Account class, which is representing a bank account where 
// we can deposit and withdraw money. If user need to withdraw money which exceed 
// our minimum bank balance then it will not be allowed, and will throw  
// InSufficientFundException(Custom Exception). Handle above exception and display 
// proper error message. [A] 

import java.util.Scanner;

class InSufficientFundException extends Exception {

    InSufficientFundException(String message) {
        super(message);
    }

}

class Account {

    int balance = 5000;
    final int MIN_BALANCE = 2000;

    public void deposit(int amount) {

        balance += amount;
        System.out.println("Deposit successful");
        System.out.println("Current Balance: " + balance);

    }

    public void withdraw(int amount) throws InSufficientFundException {

        if (balance - amount < MIN_BALANCE) {
            throw new InSufficientFundException(
                "Withdrawal denied! Minimum balance of 2000 must be maintained."
            );
        }

        balance -= amount;
        System.out.println("Withdrawal successful");
        System.out.println("Current Balance: " + balance);
        
    }
}


public class A2 {
    public static void main(String[] args) {

        Account acc = new Account();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("Enter 1 (Deposit), 2 (Withdraw), Any other Numberkey to Exit :");
            choice = sc.nextInt();

            try {
                if (choice == 1) {
                    System.out.print("Enter deposit amount :");
                    acc.deposit(sc.nextInt());
                }
                else if (choice == 2) {
                    System.out.print("Enter withdraw amount :");
                    acc.withdraw(sc.nextInt());
                }
                else {
                    System.out.println("Exiting");
                    break;
                }
            }
            catch (InSufficientFundException e) {
                System.out.println(e.getMessage());
                // e.printStackTrace();
            }

        } while (true);

        sc.close();
        
    }
}
