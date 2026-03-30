public class DatabaseConnection {

    // Private constructor to prevent instantiation
    private DatabaseConnection() {}

    // TODO: Implement the static inner helper class to hold the Singleton instance
    public static class Holder{
        private static final DatabaseConnection INSTANCE = new DatabaseConnection();
    }
    

    // TODO: Implement the public method to provide access to the Singleton instance
    public static DatabaseConnection getInstance(){
        return Holder.INSTANCE;
    }

    public void connect() {
        System.out.println("Database connected.");
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Create the first instance of DatabaseConnection
        DatabaseConnection db1 = DatabaseConnection.getInstance();

        // TODO: Create the second instance of DatabaseConnection
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        // TODO: Verify if both instances are the same
        if (db1 == db2) {
            System.out.println("Both instances are the SAME (Singleton works).");
        } else {
            System.out.println("Instances are DIFFERENT.");
        }
        // TODO: Test the connect method
        db1.connect();
    }
}
