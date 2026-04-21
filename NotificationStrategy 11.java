import java.util.*;

// Strategy Interface
interface NotificationStrategy {
    void sendNotification(String message);
}

// Email Notification
class EmailNotification implements NotificationStrategy {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email: " + message);
    }
}

// SMS Notification
class SMSNotification implements NotificationStrategy {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

// Push Notification
class PushNotification implements NotificationStrategy {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}

// Subscriber Interface
interface Subscriber {
    void update(String message);
}

// User Class
class User implements Subscriber {
    private String name;
    private NotificationStrategy notificationStrategy;

    // Constructor
    public User(String name, NotificationStrategy notificationStrategy) {
        this.name = name;
        this.notificationStrategy = notificationStrategy;
    }

    @Override
    public void update(String message) {
        notificationStrategy.sendNotification(name + " received message: " + message);
    }
}

// Publisher Class
class ChatRoomPublisher {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void publishMessage(String message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(message);
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        ChatRoomPublisher chatRoomPublisher = new ChatRoomPublisher();

        // Create users with different strategies
        User user1 = new User("Shoeb", new EmailNotification());
        User user2 = new User("Imran", new SMSNotification());
        User user3 = new User("Rahim", new PushNotification());

        // Add subscribers
        chatRoomPublisher.addSubscriber(user1);
        chatRoomPublisher.addSubscriber(user2);
        chatRoomPublisher.addSubscriber(user3);

        // Publish message
        chatRoomPublisher.publishMessage("Hello everyone!");
    }
}
