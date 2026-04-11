// NoSQLDatabase interface
public interface NoSQLDatabase {
    void connectToNoSQL();
}

// SQLDatabase interface
public interface SQLDatabase {
    void connectToSQL();
}

// MongoDB class (Adaptee)
public class MongoDB implements NoSQLDatabase {
    @Override
    public void connectToNoSQL() {
        System.out.println("Connected to MongoDB (NoSQL) database.");
    }
}

// Adapter class
public class SQLDatabaseAdapter implements SQLDatabase {
    private NoSQLDatabase noSQLDatabase;

    // Constructor
    public SQLDatabaseAdapter(NoSQLDatabase noSQLDatabase) {
        this.noSQLDatabase = noSQLDatabase;
    }

    @Override
    public void connectToSQL() {
        noSQLDatabase.connectToNoSQL();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        NoSQLDatabase mongoDB = new MongoDB();
        SQLDatabase adapter = new SQLDatabaseAdapter(mongoDB);

        adapter.connectToSQL();
    }
}
