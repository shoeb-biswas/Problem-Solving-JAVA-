interface State {
    void play(MusicPlayerContext context);
    void pause(MusicPlayerContext context);
    void stop(MusicPlayerContext context);
    String getName();
}

// ---------------- STATES ----------------

class StoppedState implements State {
    @Override
    public void play(MusicPlayerContext context) {
        System.out.println("Starting music.");
        context.setState(new PlayingState());
    }

    @Override
    public void pause(MusicPlayerContext context) {
        System.out.println("Can't pause when stopped.");
    }

    @Override
    public void stop(MusicPlayerContext context) {
        System.out.println("Already stopped.");
    }

    @Override
    public String getName() {
        return "Stopped State";
    }
}

class PlayingState implements State {
    @Override
    public void play(MusicPlayerContext context) {
        System.out.println("Already playing.");
    }

    @Override
    public void pause(MusicPlayerContext context) {
        System.out.println("Pausing music.");
        context.setState(new PausedState());
    }

    @Override
    public void stop(MusicPlayerContext context) {
        System.out.println("Stopping music.");
        context.setState(new StoppedState());
    }

    @Override
    public String getName() {
        return "Playing State";
    }
}

class PausedState implements State {
    @Override
    public void play(MusicPlayerContext context) {
        System.out.println("Resuming music.");
        context.setState(new PlayingState());
    }

    @Override
    public void pause(MusicPlayerContext context) {
        System.out.println("Already paused.");
    }

    @Override
    public void stop(MusicPlayerContext context) {
        System.out.println("Stopping music.");
        context.setState(new StoppedState());
    }

    @Override
    public String getName() {
        return "Paused State";
    }
}

// ---------------- CONTEXT ----------------

class MusicPlayerContext {
    private State state;

    public MusicPlayerContext() {
        this.state = new StoppedState(); // correct initial state
    }

    public void setState(State state) {
        System.out.println("Transitioning from " + this.state.getName() + " to " + state.getName());
        this.state = state;
    }

    public void play() {
        state.play(this); // delegate to state
    }

    public void pause() {
        state.pause(this);
    }

    public void stop() {
        state.stop(this);
    }

    public State getCurrentState() {
        return state;
    }
}

// ---------------- MAIN ----------------

public class Main {
    public static void main(String[] args) {
        MusicPlayerContext player = new MusicPlayerContext();

        System.out.println("Initial state: " + player.getCurrentState().getName());

        player.play();   // Start playing
        player.play();   // Already playing
        player.pause();  // Pause
        player.play();   // Resume
        player.stop();   // Stop
    }
}
