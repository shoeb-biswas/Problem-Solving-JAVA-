import java.util.ArrayList;
import java.util.List;

// Abstract Device
abstract class Device {
    public abstract void turnOn();
    public abstract void turnOff();
}

// Thermostat with Builder Pattern
class Thermostat {
    private double temperature;
    private double humidity;
    private String schedule;

    // Private constructor
    private Thermostat(Builder builder) {
        this.temperature = builder.temperature;
        this.humidity = builder.humidity;
        this.schedule = builder.schedule;
    }

    // Builder inner class
    public static class Builder {
        private double temperature;
        private double humidity;
        private String schedule;

        public Builder setTemperature(double temperature) {
            this.temperature = temperature;
            return this;
        }

        public Builder setHumidity(double humidity) {
            this.humidity = humidity;
            return this;
        }

        public Builder setSchedule(String schedule) {
            this.schedule = schedule;
            return this;
        }

        public Thermostat build() {
            return new Thermostat(this);
        }
    }

    // Display settings
    public void displaySettings() {
        System.out.println("Thermostat Settings:");
        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
        System.out.println("Schedule: " + schedule);
    }
}

// Singleton SmartHomeHub
class SmartHomeHub {
    private List<Device> devices = new ArrayList<>();
    private List<Thermostat> thermostats = new ArrayList<>();

    private SmartHomeHub() {
        System.out.println("SmartHomeHub instance created.");
    }

    private static class SmartHomeHubHelper {
        private static final SmartHomeHub INSTANCE = new SmartHomeHub();
    }

    public static SmartHomeHub getInstance() {
        return SmartHomeHubHelper.INSTANCE;
    }

    public void addDevice(Device device) {
        devices.add(device);
        System.out.println("Device added: " + device.getClass().getSimpleName());
    }

    // Add thermostat
    public void addThermostat(Thermostat thermostat) {
        thermostats.add(thermostat);
        System.out.println("Thermostat added.");
    }

    // Display all thermostat settings
    public void displayAllThermostats() {
        for (Thermostat t : thermostats) {
            t.displaySettings();
            System.out.println("-------------------");
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Create SmartHomeHub instance
        SmartHomeHub hub = SmartHomeHub.getInstance();

        // Build a Thermostat using Builder pattern
        Thermostat thermostat = new Thermostat.Builder()
                .setTemperature(24.5)
                .setHumidity(60)
                .setSchedule("Morning & Evening")
                .build();

        // Add thermostat to hub and display settings
        hub.addThermostat(thermostat);
        hub.displayAllThermostats();
    }
}
