public class Main {
    public static void main(String[] args) {
        SuperheroContext superhero = new SuperheroContext();

        System.out.println("Initial state: " + superhero.getCurrentState().getName());

        superhero.fly();   // Start flying
        superhero.fly();   // Already flying
        superhero.run();   // Switch to running
        superhero.fly();   // Back to flying
        superhero.rest();  // Switch to resting
    }
}

// ================= STATE INTERFACE =================
interface State {
    void fly(SuperheroContext context);
    void run(SuperheroContext context);
    void rest(SuperheroContext context);
    String getName();
}

// ================= FLYING STATE =================
class FlyingState implements State {
    @Override
    public void fly(SuperheroContext context) {
        System.out.println("Already flying.");
    }

    @Override
    public void run(SuperheroContext context) {
        System.out.println("Landing to run.");
        context.setState(new RunningState());
    }

    @Override
    public void rest(SuperheroContext context) {
        System.out.println("Landing to rest.");
        context.setState(new RestingState());
    }

    @Override
    public String getName() {
        return "Flying State";
    }
}

// ================= RUNNING STATE =================
class RunningState implements State {

    @Override
    public void fly(SuperheroContext context) {
        System.out.println("Taking off to fly.");
        context.setState(new FlyingState());
    }

    @Override
    public void run(SuperheroContext context) {
        System.out.println("Already running.");
    }

    @Override
    public void rest(SuperheroContext context) {
        System.out.println("Stopping to rest.");
        context.setState(new RestingState());
    }

    @Override
    public String getName() {
        return "Running State";
    }
}

// ================= RESTING STATE =================
class RestingState implements State {

    @Override
    public void fly(SuperheroContext context) {
        System.out.println("Taking off from rest.");
        context.setState(new FlyingState());
    }

    @Override
    public void run(SuperheroContext context) {
        System.out.println("Starting to run.");
        context.setState(new RunningState());
    }

    @Override
    public void rest(SuperheroContext context) {
        System.out.println("Already resting.");
    }

    @Override
    public String getName() {
        return "Resting State";
    }
}

// ================= CONTEXT =================
class SuperheroContext {
    private State state;

    public SuperheroContext() {
        this.state = new RestingState();
    }

    public void setState(State state) {
        System.out.println("Transitioning from " + this.state.getName() + " to " + state.getName());
        this.state = state;
    }

    public void fly() {
        state.fly(this);
    }

    public void run() {
        state.run(this);
    }

    public void rest() {
        state.rest(this);
    }

    public State getCurrentState() {
        return state;
    }
}
