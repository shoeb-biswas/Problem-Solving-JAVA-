import java.util.ArrayList;
import java.util.List;

// Subscriber interface
interface Subscriber {
    void update(String movie);
}

// Concrete Subscriber
class MovieSubscriber implements Subscriber {
    private String name;

    public MovieSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String movie) {
        System.out.println(name + " received notification: New movie released - " + movie);
    }
}

// Publisher interface
interface MoviePublisher {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers(String movie);
}

// Concrete Publisher
class MovieTopic implements MoviePublisher {

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
    public void notifySubscribers(String movie) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(movie);
        }
    }

    // Publish new movie
    public void publishMovie(String movie) {
        System.out.println("\nNew Movie Published: " + movie);
        notifySubscribers(movie);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        MovieTopic movieTopic = new MovieTopic();

        MovieSubscriber sub1 = new MovieSubscriber("Alice");
        MovieSubscriber sub2 = new MovieSubscriber("Bob");

        movieTopic.addSubscriber(sub1);
        movieTopic.addSubscriber(sub2);

        movieTopic.publishMovie("Avengers: Secret Wars");
        movieTopic.publishMovie("Spider-Man 4");
    }
}
