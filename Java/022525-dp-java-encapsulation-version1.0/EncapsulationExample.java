
class BankAccount {
    // Private fields (cannot be accessed directly outside this class)
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter method for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter method for accountHolder
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter method for balance (only allows viewing the balance)
    public double getBalance() {
        return balance;
    }

    // Setter method for balance (ensures only valid amounts are set)
    public void setBalance(double balance) {
        if (balance >= 0) {  // Validation to prevent negative balance
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
}

// Main class to test encapsulation
public class EncapsulationExample {
    public static void main(String[] args) {
        // Creating an encapsulated object
        BankAccount account = new BankAccount("John Doe", 5000);

        // Accessing and modifying data using getter & setter methods
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Initial Balance: " + account.getBalance());

        // Depositing money
        account.deposit(2000);

        // Withdrawing money
        account.withdraw(1500);

        // Trying to set a negative balance (this should be prevented)
        account.setBalance(-100);
        
        // Checking final balance
        System.out.println("Final Balance: " + account.getBalance());
    }
}
