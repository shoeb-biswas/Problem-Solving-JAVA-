public class Singleton {

    // Private constructor to prevent instantiation from other classes
    private Singleton() { }

    // Static inner helper class that holds the Singleton instance
    private static class SingletonHelper {
        // The Singleton instance is created when this class is loaded
        private static final Singleton INSTANCE = new Singleton();
    }

    // Public method to provide access to the Singleton instance
    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE; // TODO: Fix this to ensure only one instance is created
    }

    // Example method for demonstration purposes
    public void showMessage() {
        System.out.println("Hello from the Singleton instance!");
    }
}

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("Both references point to the same Singleton instance.");
        } else {
            System.out.println("The references point to different instances (This should not happen in a correct Singleton implementation).");
        }

        singleton1.showMessage();
    }
}
