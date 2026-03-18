public abstract class Appliance{
    public abstract void turnOn();
        
    public abstract void turnOff();
}

public class Television extends Appliance{
    public void turnOn(){
        System.out.println("The television is now ON.");
    }
    public void turnOff(){
        System.out.println("The television is now OFF.");
    }
}

public class WashingMachine extends Appliance{
    public void turnOn(){
        System.out.println("The washing machine is now ON.");
    }
    public void turnOff(){
        System.out.println("The washing machine is now OFF.");
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Create an instance of Appliance that points to a Television object and call its turnOn and turnOff methods
        Appliance t = new Television();
        t.turnOn();
        t.turnOff();
        // TODO: Change the instance to point to a WashingMachine object and call its turnOn and turnOff methods
        Appliance w = new WashingMachine();
        w.turnOn();
        w.turnOff();
    }
}
