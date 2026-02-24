class DatabaseConnectionManager {

    // Step 1: Create private static instance
    private static DatabaseConnectionManager instance;

    // Step 2: Private constructor (prevents object creation)
    private DatabaseConnectionManager() {
        System.out.println("Database Connection Created");
    }

    // Step 3: Public method to get instance
    public static DatabaseConnectionManager getInstance() {

        if (instance == null) {
            instance = new DatabaseConnectionManager();
        }

        return instance;
    }

    public void connect() {
        System.out.println("Connected to Central Banking Database");
    }
}

class TransactionModule {

    public void processTransaction() {
        DatabaseConnectionManager db = DatabaseConnectionManager.getInstance();
        db.connect();
        System.out.println("Processing Transaction...");
    }
}

class AccountModule {

    public void manageAccount() {
        DatabaseConnectionManager db = DatabaseConnectionManager.getInstance();
        db.connect();
        System.out.println("Managing Account...");
    }
}

public class BankingApp {

    public static void main(String[] args) {

        TransactionModule t = new TransactionModule();
        AccountModule a = new AccountModule();

        t.processTransaction();
        a.manageAccount();
    }
}
