public class Main {
    public static void main(String[] args) {

        // Create device instances
        Light light = new Light();
        Fan fan = new Fan();
        Thermostat thermostat = new Thermostat();

        // Create facade
        SmartHomeFacade smartHome = new SmartHomeFacade(light, fan, thermostat);

        // Use facade
        System.out.println("Turning ON all devices:");
        smartHome.turnOnAll();

        System.out.println("\nTurning OFF all devices:");
        smartHome.turnOffAll();
    }
}

// Facade Class
class SmartHomeFacade {
    private Light light;
    private Fan fan;
    private Thermostat thermostat;

    // Constructor
    public SmartHomeFacade(Light light, Fan fan, Thermostat thermostat) {
        this.light = light;
        this.fan = fan;
        this.thermostat = thermostat;
    }

    // Turn on all devices
    public void turnOnAll() {
        light.turnOn();
        fan.turnOn();
        thermostat.turnOn();
    }

    // Turn off all devices
    public void turnOffAll() {
        light.turnOff();
        fan.turnOff();
        thermostat.turnOff();
    }
}

// Device Interface
interface Device {
    void turnOn();
    void turnOff();
}

// Light Class
class Light implements Device {
    public void turnOn() {
        System.out.println("Light is turned on.");
    }

    public void turnOff() {
        System.out.println("Light is turned off.");
    }
}

// Fan Class
class Fan implements Device {
    public void turnOn() {
        System.out.println("Fan is turned on.");
    }

    public void turnOff() {
        System.out.println("Fan is turned off.");
    }
}

// Thermostat Class
class Thermostat implements Device {
    public void turnOn() {
        System.out.println("Thermostat is set to 22°C.");
    }

    public void turnOff() {
        System.out.println("Thermostat is turned off.");
    }
}
