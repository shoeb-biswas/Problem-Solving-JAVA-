public class Singleton {

    // Private constructor to prevent instantiation from other classes
    private Singleton() {
        // TODO: Log "Singleton instance created." whenever the Singleton instance is created
        System.out.println("Singleton instance created.");

    }

    // Static inner helper class that holds the Singleton instance
    private static class SingletonHelper {
        // The Singleton instance is created when this class is loaded
        private static final Singleton INSTANCE = new Singleton();
    }

    // Public method to provide access to the Singleton instance
    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        // TODO: Create another instance using getInstance()
        Singleton singleton2 = Singleton.getInstance();
        // Notice that the log message "Singleton instance created." is only displayed once,
        // demonstrating that the Singleton instance is only created once.
        System.out.println(singleton1 == singleton2);
    }
}
