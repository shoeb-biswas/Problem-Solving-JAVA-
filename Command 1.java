public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();

        Command lightOn = new LightOnCommand(light);
        Command fanOn = new FanOnCommand(fan);

        RemoteControl remote = new RemoteControl();
        
        // Light ON
        remote.setCommand(lightOn);
        remote.pressButton();

        // Fan ON
        remote.setCommand(fanOn);
        remote.pressButton();
    }
}

// Command Interface
interface Command {
    void execute();
}

// Receiver: Light
class Light {
    public void on() {
        System.out.println("Light is on.");
    }

    public void off() {
        System.out.println("Light is off.");
    }
}

// Receiver: Fan
class Fan {
    public void on() {
        System.out.println("Fan is on.");
    }

    public void off() {
        System.out.println("Fan is off.");
    }
}

// Concrete Command: Light ON
class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}

// Concrete Command: Fan ON
class FanOnCommand implements Command {
    private Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.on();
    }
}

// Invoker: Remote Control
class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
