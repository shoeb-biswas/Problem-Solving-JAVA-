// TODO: Define the Device interface with a method specs returning String
public interface Device {
    String specs();
}

// TODO: Implement the Device interface in BasicSmartphone class
public class BasicSmartphone implements Device {
    @Override
    // TODO: Implement the specs method to return "Basic Smartphone"
    public String specs() {
        return "Basic Smartphone";
    }
}

// TODO: Implement the Device interface in DeviceDecorator class
public class DeviceDecorator implements Device {
    // TODO: Add a private Device variable named decoratedDevice
    private Device decoratedDevice;

    // TODO: Create a constructor that takes a Device object and assigns it to decoratedDevice
    public DeviceDecorator(Device device) {
        this.decoratedDevice = device;
    }

    @Override
    // TODO: Implement the specs method that returns decoratedDevice.specs()
    public String specs() {
        return decoratedDevice.specs();
    }
}

// TODO: Extend the DeviceDecorator class in CameraModule class
public class CameraModule extends DeviceDecorator {
    // TODO: Create a constructor that takes a Device object and passes it to the DeviceDecorator constructor
    public CameraModule(Device device) {
        super(device);
    }

    @Override
    // TODO: Override the specs method to add " + High-Resolution Camera" to the base description
    public String specs() {
        return super.specs() + " + High-Resolution Camera";
    }
}

// TODO: Extend the DeviceDecorator class in BatteryBooster class
public class BatteryBooster extends DeviceDecorator {
    // TODO: Create a constructor that takes a Device object and passes it to the DeviceDecorator constructor
    public BatteryBooster(Device device) {
        super(device);
    }

    @Override
    // TODO: Override the specs method to add " + Enhanced Battery Life" to the base description
    public String specs() {
        return super.specs() + " + Enhanced Battery Life";
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Create a CameraModule wrapping a BasicSmartphone and print the description
        Device cameraPhone = new CameraModule(new BasicSmartphone());
        System.out.println(cameraPhone.specs()); // Outputs: Basic Smartphone + High-Resolution Camera

        // TODO: Create a BatteryBooster wrapping a BasicSmartphone and print the description
        Device batteryPhone = new BatteryBooster(new BasicSmartphone());
        System.out.println(batteryPhone.specs()); // Outputs: Basic Smartphone + Enhanced Battery Life
    }
}
