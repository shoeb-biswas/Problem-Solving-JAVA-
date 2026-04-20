interface State {
    void changeLight(TrafficLightContext context);
    String getName();
}

// Red State
class RedLightState implements State {
    @Override
    public void changeLight(TrafficLightContext context) {
        System.out.println("Red light - Stop.");
        context.setState(new GreenLightState()); // Next: Green
    }

    @Override
    public String getName() {
        return "Red Light State";
    }
}

// Green State
class GreenLightState implements State {
    @Override
    public void changeLight(TrafficLightContext context) {
        System.out.println("Green light - Go.");
        context.setState(new YellowLightState()); // Next: Yellow
    }

    @Override
    public String getName() {
        return "Green Light State";
    }
}

// Yellow State
class YellowLightState implements State {
    @Override
    public void changeLight(TrafficLightContext context) {
        System.out.println("Yellow light - Caution.");
        context.setState(new RedLightState()); // Next: Red
    }

    @Override
    public String getName() {
        return "Yellow Light State";
    }
}

// Context
class TrafficLightContext {
    private State lightState;

    public TrafficLightContext() {
        this.lightState = new RedLightState(); // Initial state
    }

    public void setState(State state) {
        System.out.println("Transitioning from " + this.lightState.getName() + " to " + state.getName());
        this.lightState = state;
    }

    public void changeLight() {
        lightState.changeLight(this);
    }

    public State getCurrentState() {
        return lightState;
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        TrafficLightContext context = new TrafficLightContext();

        System.out.println("Initial state: " + context.getCurrentState().getName());

        context.changeLight(); // Red → Green
        context.changeLight(); // Green → Yellow
        context.changeLight(); // Yellow → Red
    }
}
