import java.util.ArrayList;
import java.util.List;

// Abstract Device
abstract class Device {
    public abstract void turnOn();
    public abstract void turnOff();
}

// Light class
class Light extends Device {
    @Override
    public void turnOn() {
        System.out.println("Light is on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is off.");
    }
}

// Fan class
class Fan extends Device {
    @Override
    public void turnOn() {
        System.out.println("Fan is on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is off.");
    }

    public void setSpeed(int speed) {
        System.out.println("Fan speed set to " + speed + ".");
    }
}

// DeviceFactory
class DeviceFactory {
    public enum DeviceType {
        LIGHT,
        FAN
    }

    public static Device createDevice(DeviceType type) {
        switch (type) {
            case LIGHT:
                return new Light();
            case FAN:
                return new Fan();
            default:
                throw new IllegalArgumentException("Invalid device type");
        }
    }
}

// Singleton SmartHomeHub
class SmartHomeHub {

    private List<Device> devices = new ArrayList<>();

    private SmartHomeHub() {
        System.out.println("SmartHomeHub instance created.");
    }

    private static class Helper {
        private static final SmartHomeHub INSTANCE = new SmartHomeHub();
    }

    public static SmartHomeHub getInstance() {
        return Helper.INSTANCE;
    }

    public void addDevice(Device device) {
        devices.add(device);
        System.out.println("Device added: " + device.getClass().getSimpleName());
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Get Singleton instance
        SmartHomeHub hub = SmartHomeHub.getInstance();

        // Create devices using factory
        Device light = DeviceFactory.createDevice(DeviceFactory.DeviceType.LIGHT);
        Device fan = DeviceFactory.createDevice(DeviceFactory.DeviceType.FAN);

        // Add devices to hub
        hub.addDevice(light);
        hub.addDevice(fan);

        // Test devices
        light.turnOn();
        light.turnOff();

        fan.turnOn();
        ((Fan) fan).setSpeed(5);
        fan.turnOff();
    }
}
