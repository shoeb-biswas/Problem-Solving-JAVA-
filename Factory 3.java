interface Notification {
    void notifyUser();
}

class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending Email Notification...");
    }
}

class SMSNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending SMS Notification...");
    }
}

class NotificationFactory {

    public static Notification getNotification(String type) {

        if (type == null) {
            return null;
        }

        if (type.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        } 
        else if (type.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        }

        return null;
    }
}

import java.util.Scanner;

public class NotificationDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter notification type (EMAIL/SMS): ");
        String type = sc.nextLine();

        Notification notification = NotificationFactory.getNotification(type);

        if (notification != null) {
            notification.notifyUser();
        } else {
            System.out.println("Invalid notification type.");
        }
    }
}
