// 3. Create class BankDemo and Account(accNum:int, accType:String, balance: double). 
// Implement getter() and setter() method to assign and display data for 3 students.[A] 

class Account {
    int accNum;
    String accType;
    double balance;

    // to assign values
    void setter(int accNum, String accType, double balance) {
        this.accNum = accNum;
        this.accType = accType;
        this.balance = balance;
    }

    // to display values
    void getter() {
        System.out.println("Account Number: " + accNum);
        System.out.println("Account Type: " + accType);
        System.out.println("Balance: " + balance);
    }
}

public class a3_BankDemo {
    public static void main(String[] args) {

        Account a1 = new Account();
        Account a2 = new Account();
        Account a3 = new Account();

        // Assign values
        a1.setter(101, "Saving", 5000.50);
        a2.setter(102, "Current", 12000.75);
        a3.setter(103, "Saving", 8500.00);

        // Display values
        a1.getter();
        a2.getter();
        a3.getter();
    }
}
