import java.util.ArrayList;
import java.util.List;

// Subscriber interface
interface Subscriber {
    void update(String alert);
}

// Concrete Subscriber
class WeatherSubscriber implements Subscriber {
    private String name;

    public WeatherSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String alert) {
        System.out.println(name + " received alert: " + alert);
    }
}

// Publisher class
class WeatherAlert {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void sendSevereAlert(String alert) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(alert);
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        WeatherAlert weatherAlert = new WeatherAlert();

        WeatherSubscriber sub1 = new WeatherSubscriber("Alice");
        WeatherSubscriber sub2 = new WeatherSubscriber("Bob");

        weatherAlert.addSubscriber(sub1);
        weatherAlert.addSubscriber(sub2);

        weatherAlert.sendSevereAlert("Severe thunderstorm warning!");
    }
}
