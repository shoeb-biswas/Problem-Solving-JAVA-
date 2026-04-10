// Device interface
interface Device {
    void turnOn();
    void turnOff();
}

// TV class
class TV implements Device {
    @Override
    public void turnOn() {
        System.out.println("TV is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned off.");
    }
}

// Radio class
class Radio implements Device {
    @Override
    public void turnOn() {
        System.out.println("Radio is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio is turned off.");
    }
}

// RemoteControl class
class RemoteControl {
    private Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void turnOn() {
        device.turnOn();
    }

    public void turnOff() {
        device.turnOff();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Create devices
        Device tv = new TV();
        Device radio = new Radio();

        // Create remote controls
        RemoteControl tvRemote = new RemoteControl(tv);
        RemoteControl radioRemote = new RemoteControl(radio);

        // Test TV
        tvRemote.turnOn();
        tvRemote.turnOff();

        System.out.println();

        // Test Radio
        radioRemote.turnOn();
        radioRemote.turnOff();
    }
}
