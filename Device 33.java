import java.util.ArrayList;
import java.util.List;

// Abstract Device
abstract class Device {
    public abstract void turnOn();
    public abstract void turnOff();
}

// Legacy SmartSpeaker class
class SmartSpeaker {
    public void powerOn() {
        System.out.println("Smart Speaker is now ON");
    }

    public void powerOff() {
        System.out.println("Smart Speaker is now OFF");
    }
}

// Adapter class
class SmartSpeakerAdapter extends Device {
    private SmartSpeaker smartSpeaker;

    public SmartSpeakerAdapter(SmartSpeaker smartSpeaker) {
        this.smartSpeaker = smartSpeaker;
    }

    @Override
    public void turnOn() {
        smartSpeaker.powerOn();
    }

    @Override
    public void turnOff() {
        smartSpeaker.powerOff();
    }
}

// Singleton SmartHomeHub
class SmartHomeHub {
    private List<Device> devices = new ArrayList<>();

    private SmartHomeHub() {}

    private static class SmartHomeHubHelper {
        private static final SmartHomeHub INSTANCE = new SmartHomeHub();
    }

    public static SmartHomeHub getInstance() {
        return SmartHomeHubHelper.INSTANCE;
    }

    public void addDevice(Device device) {
        devices.add(device);
        System.out.println("Device added to Smart Home Hub");
    }

    public void controlAllDevices() {
        for (Device device : devices) {
            device.turnOn();
        }
    }

    public void shutdownAllDevices() {
        for (Device device : devices) {
            device.turnOff();
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        SmartHomeHub hub = SmartHomeHub.getInstance();

        SmartSpeaker speaker = new SmartSpeaker();
        SmartSpeakerAdapter adapter = new SmartSpeakerAdapter(speaker);

        hub.addDevice(adapter);

        System.out.println("\nTurning ON all devices:");
        hub.controlAllDevices();

        System.out.println("\nShutting down all devices:");
        hub.shutdownAllDevices();
    }
}
