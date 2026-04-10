// 3. Write a Java program to create a class called BankAccount with instance variables 
// 'accountNo' and balance, and static variables bankName and interestRate. Implement 
// static methods to get and set the static variables. Create three BankAccount objects and 
// print their details along with the static variables. [A]

class BankAccount {

    // Instance variables
    int accountNo;
    double balance;

    // Static variables
    static String bankName;
    static double interestRate;

    // Constructor
    BankAccount(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    // Static setter methods
    static void setBankName(String name) {
        bankName = name;
    }

    static void setInterestRate(double rate) {
        interestRate = rate;
    }

    // Static getter methods
    static String getBankName() {
        return bankName;
    }

    static double getInterestRate() {
        return interestRate;
    }

    // Method to display account details
    void display() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Balance: " + balance);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class a3 {

    public static void main(String[] args) {

        // Set static variables
        BankAccount.setBankName("State Bank of India");
        BankAccount.setInterestRate(4.5);

        // Create 3 BankAccount objects
        BankAccount b1 = new BankAccount(101, 5000);
        BankAccount b2 = new BankAccount(102, 15000);
        BankAccount b3 = new BankAccount(103, 25000);

        // Display details
        b1.display();
        b2.display();
        b3.display();
    }
}
