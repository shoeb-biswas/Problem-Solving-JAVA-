public class Singleton {

    // TODO: Create a private constructor to prevent instantiation from other classes
    private Singleton(){
        
    }

    private static class SingletonHelper {
        // TODO: Initialize the Singleton instance when this class is loaded
        private static final Singleton INSTANCE = new Singleton();
    }

    // TODO: Create a public method to provide access to the Singleton instance
    public static Singleton getInstance(){
       return SingletonHelper.INSTANCE;
    }

    // Example method for demonstration purposes
    public void showMessage() {
        System.out.println("Hello from the Singleton instance!");
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Get the Singleton instance using getInstance() method
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}
