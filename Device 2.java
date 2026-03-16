public class Device {
    private String name;
    private String powerStatus;

    // TODO: Implement the constructor that initializes the device name and power status
    public Device(String name, String powerStatus){
        this.name = name;
        this.powerStatus = powerStatus;
    }
    public String getName(){
        return name;
    }
     public String getPowerStatus(){
        return powerStatus;
    }

    // TODO: Implement the 'status' method that prints the device name and power status
    public void status(){
        System.out.println("Device Name: " + getName() + ", Power Status: " +getPowerStatus());
    }
}

public class Laptop extends Device{
    public String operatingsystem;
    
    public Laptop(String name, String powerStatus, String operatingsystem){
        super(name, powerStatus);
        this.operatingsystem = operatingsystem;
    }
    public void status(){
        System.out.println("Device Name: " + getName() + ", Power Status: " +getPowerStatus() + ", Operating System: " + operatingsystem);
    }
}

public class Smartphone extends Device{
    public String carrier;
    
    public Smartphone(String name, String powerStatus, String carrier){
        super(name, powerStatus);
        this.carrier = carrier;
    }
    public void status(){
        System.out.println("Carrier: " +carrier + ", Device Name: " + getName() + ", Power Status: " + getPowerStatus());
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Create an instance of Laptop with the name "MacBook Pro", power status "On", and OS "macOS"
        Laptop l = new Laptop("MacBook Pro", "On", "macOS");
        // TODO: Create an instance of Smartphone with the name "iPhone", power status "Off", and carrier "Verizon"
        Smartphone s = new Smartphone("iPhone", "Off", "Verizon");
        // TODO: Call the status method on both objects to print their details
        l.status();
        s.status();
    }
}
