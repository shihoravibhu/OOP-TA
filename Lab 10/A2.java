// 2. Write a Java program to create an abstract class BankAccount with abstract methods 
// deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that 
// extend the BankAccount class and implement the respective methods to handle 
// deposits and withdrawals for each account type.[A] 

import java.util.Scanner;

// Abstract Class
abstract class BankAccount {

    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}


// Savings Account Class
class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited. New Balance = " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < 5000) {
            System.out.println("Cannot withdraw! Minimum balance of 5000 required.");
        } 
        else {
            balance -= amount;
            System.out.println("Amount Withdrawn. New Balance = " + balance);
        }
    }
}


// Current Account Class
class CurrentAccount extends BankAccount {

    public CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited. New Balance = " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < 0) {
            System.out.println("Cannot withdraw! Balance Must Be Positive.");
        } else {
            balance -= amount;
            System.out.println("Amount Withdrawn. New Balance = " + balance);
        }
    }
}

public class A2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount acc;

        System.out.println("Choose Account Type (1: Savings, 2: Current): ");
        int type = sc.nextInt();

        System.out.println("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        // Dynamic Method Dispatch
        if (type == 1)
            acc = new SavingsAccount(bal);
        else
            acc = new CurrentAccount(bal);

        System.out.println("Enter Amount to Deposit: ");
        acc.deposit(sc.nextDouble());

        System.out.println("Enter Amount to Withdraw: ");
        acc.withdraw(sc.nextDouble());

        sc.close();
    }
}
