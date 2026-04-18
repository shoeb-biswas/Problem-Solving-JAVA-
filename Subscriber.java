import java.util.ArrayList;
import java.util.List;

// Subscriber Interface
interface Subscriber {
    void update(String stockUpdate);
}

// Publisher Interface
interface StockPublisher {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers(String stockUpdate);
}

// Concrete Subscriber
class StockSubscriber implements Subscriber {
    private String name;

    public StockSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockUpdate) {
        System.out.println(name + " received stock update: " + stockUpdate);
    }
}

// Concrete Publisher
class StockMarket implements StockPublisher {
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
    public void notifySubscribers(String stockUpdate) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(stockUpdate);
        }
    }

    // Method to publish updates
    public void publishUpdate(String stockUpdate) {
        System.out.println("Publishing stock update: " + stockUpdate);
        notifySubscribers(stockUpdate);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Subscriber subscriber1 = new StockSubscriber("Subscriber 1");
        Subscriber subscriber2 = new StockSubscriber("Subscriber 2");

        stockMarket.addSubscriber(subscriber1);
        stockMarket.addSubscriber(subscriber2);

        stockMarket.publishUpdate("AAPL stock price increased by 2%!");

        stockMarket.removeSubscriber(subscriber1);

        stockMarket.publishUpdate("GOOGL stock price decreased by 1.5%!");
    }
}
