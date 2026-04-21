import java.util.ArrayList;
import java.util.List;

// Command Interface
interface Command {
    void execute();
}

// ChatCommand Class
class ChatCommand implements Command {
    private ChatRoom chatRoom;
    private String message;

    // Constructor
    public ChatCommand(ChatRoom chatRoom, String message) {
        this.chatRoom = chatRoom;
        this.message = message;
    }

    @Override
    public void execute() {
        chatRoom.sendMessage(message);
    }
}

// ChatRoom Class
class ChatRoom {
    private List<User> users = new ArrayList<>();

    public void showMessage(String message) {
        System.out.println("ChatRoom: " + message);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void sendMessage(String message) {
        showMessage(message);
        for (User user : users) {
            user.receiveMessage(message);
        }
    }
}

// User Class
class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void receiveMessage(String message) {
        System.out.println(name + " received: " + message);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        ChatRoom chatRoom = new ChatRoom();

        User user1 = new User("Shoeb");
        User user2 = new User("Imran");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);

        Command command = new ChatCommand(chatRoom, "Hello everyone!");

        command.execute();
    }
}
