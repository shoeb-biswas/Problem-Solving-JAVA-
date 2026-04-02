// Abstract class
abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Abstract method
    abstract void accountType();
}

// SavingsAccount class
class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void accountType() {
        System.out.println("This is a Savings Account");
    }
}

// CheckingAccount class
class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void accountType() {
        System.out.println("This is a Checking Account");
    }
}

// Factory class
class BankAccountFactory {

    public static BankAccount createAccount(String type, String accountNumber, double balance) {

        switch (type) {
            case "Savings":
                return new SavingsAccount(accountNumber, balance);

            case "Checking":
                return new CheckingAccount(accountNumber, balance);

            default:
                throw new IllegalArgumentException("Unknown account type: " + type);
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Create Savings Account
        BankAccount acc1 = BankAccountFactory.createAccount("Savings", "SA123", 1000);
        acc1.accountType();

        // Create Checking Account
        BankAccount acc2 = BankAccountFactory.createAccount("Checking", "CA456", 2000);
        acc2.accountType();
    }
}
