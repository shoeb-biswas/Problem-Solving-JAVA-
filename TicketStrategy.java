// Strategy Interface
interface TicketStrategy {
    void bookTicket(String event);
}

// Concrete Strategy 1
class RegularStrategy implements TicketStrategy {
    @Override
    public void bookTicket(String event) {
        System.out.println("Booked a regular ticket for: " + event);
    }
}

// Concrete Strategy 2
class VIPStrategy implements TicketStrategy {
    private String vipCode;

    public VIPStrategy(String vipCode) {
        this.vipCode = vipCode;
    }

    @Override
    public void bookTicket(String event) {
        System.out.println("Booked a VIP ticket for: " + event + " with VIP code: " + vipCode);
    }
}

// Context Class
class BookingSystem {
    private TicketStrategy strategy;

    public void setTicketStrategy(TicketStrategy strategy) {
        this.strategy = strategy; // fixed: allow switching strategies
    }

    public void book(String event) {
        if (strategy != null) {
            strategy.bookTicket(event);
        } else {
            System.out.println("No ticket strategy set.");
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        BookingSystem system = new BookingSystem();

        TicketStrategy regular = new RegularStrategy();
        TicketStrategy vip = new VIPStrategy("VIP123");

        system.setTicketStrategy(regular);
        system.book("Concert");

        system.setTicketStrategy(vip);
        system.book("Theater");
    }
}
