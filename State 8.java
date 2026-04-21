public class Main {
    public static void main(String[] args) {
        TVContext tv = new TVContext();

        System.out.println("Initial State: " + tv.getCurrentState().getName());

        tv.play();   // Start playing
        tv.play();   // Already playing (invalid)

        tv.pause();  // Pause
        tv.pause();  // Already paused (invalid)

        tv.stop();   // Stop
        tv.stop();   // Already stopped (invalid)

        tv.pause();  // Invalid from stopped
        tv.play();   // Start again
    }
}

// ================= STATE INTERFACE =================
interface State {
    void play(TVContext context);
    void pause(TVContext context);
    void stop(TVContext context);
    String getName();
}

// ================= PLAYING STATE =================
class PlayingState implements State {

    @Override
    public void play(TVContext context) {
        System.out.println("Already playing.");
    }

    @Override
    public void pause(TVContext context) {
        System.out.println("Pausing TV.");
        context.setState(new PausedState());
    }

    @Override
    public void stop(TVContext context) {
        System.out.println("Stopping TV.");
        context.setState(new StoppedState());
    }

    @Override
    public String getName() {
        return "Playing State";
    }
}

// ================= PAUSED STATE =================
class PausedState implements State {

    @Override
    public void play(TVContext context) {
        System.out.println("Resuming TV.");
        context.setState(new PlayingState());
    }

    @Override
    public void pause(TVContext context) {
        System.out.println("Already paused.");
    }

    @Override
    public void stop(TVContext context) {
        System.out.println("Stopping from pause.");
        context.setState(new StoppedState());
    }

    @Override
    public String getName() {
        return "Paused State";
    }
}

// ================= STOPPED STATE =================
class StoppedState implements State {

    @Override
    public void play(TVContext context) {
        System.out.println("Starting TV.");
        context.setState(new PlayingState());
    }

    @Override
    public void pause(TVContext context) {
        System.out.println("Can't pause when stopped.");
    }

    @Override
    public void stop(TVContext context) {
        System.out.println("Already stopped.");
    }

    @Override
    public String getName() {
        return "Stopped State";
    }
}

// ================= CONTEXT =================
class TVContext {
    private State state;

    public TVContext() {
        this.state = new StoppedState();
    }

    public void setState(State state) {
        System.out.println("Transitioning from " + this.state.getName() + " to " + state.getName());
        this.state = state;
    }

    public State getCurrentState() {
        return state;
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void stop() {
        state.stop(this);
    }
}
