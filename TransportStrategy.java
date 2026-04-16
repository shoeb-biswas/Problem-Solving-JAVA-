// Strategy Interface
interface TransportStrategy {
    void travel(String destination);
}

// Concrete Strategy 1
class CarTransport implements TransportStrategy {
    @Override
    public void travel(String destination) {
        System.out.println("Traveling by car to: " + destination);
    }
}

// Concrete Strategy 2
class TrainTransport implements TransportStrategy {
    @Override
    public void travel(String destination) {
        System.out.println("Traveling by train to: " + destination);
    }
}

// Concrete Strategy 3
class AirplaneTransport implements TransportStrategy {
    private String flightNumber;

    public AirplaneTransport(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public void travel(String destination) {
        System.out.println("Traveling by airplane to: " + destination + " with flight number: " + flightNumber);
    }
}

// Context Class
class TravelPlanner {
    private TransportStrategy strategy;

    public void setTransportStrategy(TransportStrategy strategy) {
        this.strategy = strategy;
    }

    public void planTrip(String destination) {
        if (strategy != null) {
            strategy.travel(destination);
        } else {
            System.out.println("No transport strategy set");
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        TravelPlanner planner = new TravelPlanner();

        TransportStrategy car = new CarTransport();
        TransportStrategy train = new TrainTransport();
        TransportStrategy airplane = new AirplaneTransport("BG101");

        // Travel by car
        planner.setTransportStrategy(car);
        planner.planTrip("Dhaka");

        // Travel by train
        planner.setTransportStrategy(train);
        planner.planTrip("Chittagong");

        // Travel by airplane
        planner.setTransportStrategy(airplane);
        planner.planTrip("Sylhet");
    }
}
