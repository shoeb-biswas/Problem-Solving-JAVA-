public class Main {

    public static void main(String[] args) {

        // Get the Singleton instance

        SmartHomeHub hub1 = SmartHomeHub.getInstance();

        SmartHomeHub hub2 = SmartHomeHub.getInstance();

        // Verify both references point to the same instance

        System.out.println(hub1 == hub2); // true

    }

}

public class SmartHomeHub {

    // Private constructor to prevent external instantiation

    private SmartHomeHub() {

        System.out.println("SmartHomeHub instance created!");

    }

    // Static inner helper class

    private static class Holder {

        private static final SmartHomeHub INSTANCE = new SmartHomeHub();

    }

    // Public method to provide access to the instance

    public static SmartHomeHub getInstance() {

        return Holder.INSTANCE;

    }

}
