public interface OperatingSystem {
    void run(String device);
}
public class WindowsOS implements OperatingSystem {
    @Override
    public void run(String device) {
        System.out.println("Running " + device + " on Windows OS.");
    }
}
public class MacOS implements OperatingSystem {
    @Override
    public void run(String device) {
        System.out.println("Running " + device + " on MacOS.");
    }
}

public abstract class Device {
    protected OperatingSystem os;

    public Device(OperatingSystem os) {
        this.os = os;
    }

    public abstract void start();
}

public class Printer extends Device {
    public Printer(OperatingSystem os) {
        super(os);
    }

    @Override
    public void start() {
        System.out.print("Printer: ");
        os.run("Printer");
    }
}

public class Scanner extends Device {
    public Scanner(OperatingSystem os) {
        super(os);
    }

    @Override
    public void start() {
        System.out.print("Scanner: ");
        os.run("Scanner");
    }
}

public class Main {
    public static void main(String[] args) {
        // Running a Printer on Windows OS
        Device printerOnWindows = new Printer(new WindowsOS());
        printerOnWindows.start(); // Outputs: Printer: Running Printer on Windows OS.

        // Running a Scanner on MacOS
        Device scannerOnMac = new Scanner(new MacOS());
        scannerOnMac.start(); // Outputs: Scanner: Running Scanner on MacOS.
    }
}
