// TODO: Implement the Singleton pattern for this class
public class SessionManager {

    // TODO: Create a private constructor to prevent instantiation from other classes
    private SessionManager(){
         System.out.println("SessionManager instance created!");
     }
    // Print statement to indicate the constructor is only called once per JVM
    private static class SingletonHelper{
        private static final SessionManager INSTANCE = new SessionManager();
    }
    
    // TODO: Create a static inner helper class that holds the Singleton instance
    public static SessionManager getInstance(){
        return SingletonHelper.INSTANCE;
    }
    // TODO: Create a public method to provide access to the Singleton instance
}

// TODO: Use the Main class to test the Singleton pattern
public class Main {
    public static void main(String[] args) {
        // TODO: Get the Singleton instance using getInstance() method
        SessionManager obj1 = SessionManager.getInstance();
        SessionManager obj2 = SessionManager.getInstance();
        // TODO: Call the getInstance method again to demonstrate Singleton behavior
        if (obj1 == obj2) {
            System.out.println("Same instance (Singleton works!)");
        }
    }
}
