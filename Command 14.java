import java.util.*;

// ================= COMMAND PATTERN =================
interface Command {
    void execute();
}

class ChatCommand implements Command {
    private ChatRoom chatRoom;
    private String message;

    public ChatCommand(ChatRoom chatRoom, String message) {
        this.chatRoom = chatRoom;
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println("Logging: Sending message to chat room.");
        chatRoom.showMessage(message);
    }
}

// ================= STRATEGY PATTERN =================
interface NotificationStrategy {
    void notify(String userName, String message);
}

class EmailNotification implements NotificationStrategy {
    @Override
    public void notify(String userName, String message) {
        System.out.println("Sending email to " + userName + ": " + message);
    }
}

class SMSNotification implements NotificationStrategy {
    @Override
    public void notify(String userName, String message) {
        System.out.println("Sending SMS to " + userName + ": " + message);
    }
}

// ================= OBSERVER PATTERN =================
interface Subscriber {
    void update(String message);
}

class User implements Subscriber {
    private String name;
    private NotificationStrategy notificationStrategy;

    public User(String name, NotificationStrategy notificationStrategy) {
        this.name = name;
        this.notificationStrategy = notificationStrategy;
    }

    @Override
    public void update(String message) {
        notificationStrategy.notify(name, message);
    }

    // Fix for ChatRoom compatibility
    public void receiveMessage(String message) {
        System.out.println(name + " received: " + message);
    }
}

interface ChatPublisher {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers(String message, boolean isUrgent);
}

class ChatRoomPublisher implements ChatPublisher {
    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String message, boolean isUrgent) {
        if (isUrgent) {
            System.out.println("Urgent message: " + message);
        }

        for (Subscriber subscriber : subscribers) {
            subscriber.update(message);
        }
    }

    public void publishMessage(String message, boolean isUrgent) {
        notifySubscribers(message, isUrgent);
    }
}

// ================= CHAT ROOM =================
class ChatRoom {
    private List<User> users = new ArrayList<>();

    public void showMessage(String message) {
        System.out.println("Message: " + message);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void sendMessage(String message) {
        for (User user : users) {
            user.receiveMessage(message);
        }
    }
}

// ================= MAIN =================
public class Main {
    public static void main(String[] args) {

        // Command Pattern
        ChatRoom chatRoom = new ChatRoom();
        Command chatCommand = new ChatCommand(chatRoom, "Welcome to the chat!");
        chatCommand.execute();

        // Strategy Pattern
        NotificationStrategy email = new EmailNotification();
        NotificationStrategy sms = new SMSNotification();

        User user1 = new User("Alice", email);
        User user2 = new User("Bob", sms);

        // Observer Pattern
        ChatRoomPublisher publisher = new ChatRoomPublisher();
        publisher.addSubscriber(user1);
        publisher.addSubscriber(user2);

        publisher.publishMessage("Hello, everyone!", false);
        publisher.publishMessage("System update in 5 minutes!", true);
    }
}
