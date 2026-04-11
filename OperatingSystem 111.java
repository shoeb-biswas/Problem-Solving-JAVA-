// OperatingSystem interface
interface OperatingSystem {
    void run(String device);
}

// LinuxOS implementation
class LinuxOS implements OperatingSystem {
    @Override
    public void run(String device) {
        System.out.println(device + " is running on Linux OS.");
    }
}

// ChromeOS implementation
class ChromeOS implements OperatingSystem {
    @Override
    public void run(String device) {
        System.out.println(device + " is running on Chrome OS.");
    }
}

// Abstract Device class
abstract class Device {
    protected OperatingSystem os;

    public Device(OperatingSystem os) {
        this.os = os;
    }

    abstract void start();
}

// Laptop class
class Laptop extends Device {
    public Laptop(OperatingSystem os) {
        super(os);
    }

    @Override
    void start() {
        System.out.print("Laptop: ");
        os.run("Laptop");
    }
}

// Tablet class
class Tablet extends Device {
    public Tablet(OperatingSystem os) {
        super(os);
    }

    @Override
    void start() {
        System.out.print("Tablet: ");
        os.run("Tablet");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Laptop with Linux OS
        Device laptop = new Laptop(new LinuxOS());
        laptop.start();

        // Tablet with Chrome OS
        Device tablet = new Tablet(new ChromeOS());
        tablet.start();
    }
}
