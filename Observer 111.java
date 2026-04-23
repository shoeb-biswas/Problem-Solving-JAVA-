import java.util.ArrayList;
import java.util.List;

// Observer interface
interface Observer {
    void update(String status);
}

// User class (Observer)
class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        System.out.println(name + " received update: " + status);
    }
}

// SmartHomeHub (Subject)
class SmartHomeHub {
    private List<Observer> observers = new ArrayList<>();

    // Add observer
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Remove observer
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notify all observers
    public void notifyObservers(String status) {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }

    // Simulate status change
    public void statusChanged(String status) {
        System.out.println("SmartHomeHub status changed: " + status);
        notifyObservers(status);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        SmartHomeHub hub = new SmartHomeHub();

        User user1 = new User("Shoeb");
        User user2 = new User("Imran");

        // Add observers
        hub.addObserver(user1);
        hub.addObserver(user2);

        // Trigger status change
        hub.statusChanged("Lights turned ON");

        // Remove one observer
        hub.removeObserver(user2);

        // Another update
        hub.statusChanged("Temperature set to 24°C");
    }
}
