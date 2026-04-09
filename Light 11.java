public class Light {
    public void turnOn() {
        System.out.println("Light is turned on.");
    }

    // Method to turn off the light
    public void turnOff() {
        System.out.println("Light is turned off.");
    }
}

public class AirConditioner {
    public void turnOn() {
        System.out.println("Air Conditioner is turned on.");
    }

    // Method to turn off the air conditioner
    public void turnOff() {
        System.out.println("Air Conditioner is turned off.");
    }
}
public class HomeTheater {
    public void turnOn() {
        System.out.println("Home Theater is turned on.");
    }

    // Method to turn off the home theater
    public void turnOff() {
        System.out.println("Home Theater is turned off.");
    }
}

public class HomeAutomationFacade {
    private Light light;
    private AirConditioner airConditioner;
    private HomeTheater homeTheater;

    public HomeAutomationFacade() {
        this.light = new Light();
        this.airConditioner = new AirConditioner();
        this.homeTheater = new HomeTheater();
    }

    public void turnOnAllDevices() {
        light.turnOn();
        airConditioner.turnOn();
        homeTheater.turnOn();
        System.out.println("All devices are turned on.");
    }

    // TODO: Implement the method to turn off all devices at once
    public void turnOffAllDevices() {
        light.turnOff();
        airConditioner.turnOff();
        homeTheater.turnOff();
        System.out.println("All devices are turned off.");
    }
}

public class Main {
    public static void main(String[] args) {
        HomeAutomationFacade homeFacade = new HomeAutomationFacade();
        homeFacade.turnOnAllDevices(); // Outputs: All devices are turned on.
        homeFacade.turnOffAllDevices();
        // TODO: Use the new method to turn off all devices
    }
}
