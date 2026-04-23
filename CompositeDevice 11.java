import java.util.ArrayList;
import java.util.List;

// CompositeDevice class
public class CompositeDevice implements Device {
    private List<Device> devices = new ArrayList<>();

    // Add device
    public void addDevice(Device device) {
        devices.add(device);
    }

    // Remove device
    public void removeDevice(Device device) {
        devices.remove(device);
    }

    @Override
    public void turnOn() {
        for (Device device : devices) {
            device.turnOn();
        }
    }

    @Override
    public void turnOff() {
        for (Device device : devices) {
            device.turnOff();
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create individual devices
        Device light = new Light();
        Device fan = new Fan();

        // Create composite device
        CompositeDevice homeDevices = new CompositeDevice();

        // Add devices to composite
        homeDevices.addDevice(light);
        homeDevices.addDevice(fan);

        // Turn all devices ON
        System.out.println("Turning all devices ON:");
        homeDevices.turnOn();

        // Turn all devices OFF
        System.out.println("\nTurning all devices OFF:");
        homeDevices.turnOff();
    }
}

// Device interface
public interface Device {
    void turnOn();
    void turnOff();
}

// Light class
public class Light implements Device {
    @Override
    public void turnOn() {
        System.out.println("Light is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is turned off.");
    }
}

// Fan class
public class Fan implements Device {
    @Override
    public void turnOn() {
        System.out.println("Fan is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is turned off.");
    }
}
