public interface State {
    void play(MusicPlayerContext context);
    void pause(MusicPlayerContext context);
    void stop(MusicPlayerContext context);
    String getName();
}

public class PlayingState implements State {
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
public class PausedState implements State {
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

public class StoppedState implements State {
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

public class MusicPlayerContext {
    private State state;

    public MusicPlayerContext() {
        // Initial state is stopped
        this.state = new StoppedState();
    }

    public void setState(State state) {
        System.out.println("Transitioning from " + this.state.getName() + " to " + state.getName());
        this.state = state;
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

    public State getCurrentState() {
        return state;
    }
}

public class Main {
    public static void main(String[] args) {
        MusicPlayerContext player = new MusicPlayerContext();

        // Initial state is stopped
        System.out.println("Initial state: " + player.getCurrentState().getName());

        // Start playing
        player.play();  // Outputs: Starting music. Transitioning from Stopped State to Playing State

        // Try to play again
        player.play();  // Outputs: Already playing.

        // Pause
        player.pause(); // Outputs: Pausing music. Transitioning from Playing State to Paused State

        // Resume
        player.play();  // Outputs: Resuming music. Transitioning from Paused State to Playing State

        // Stop
        player.stop();  // Outputs: Stopping music. Transitioning from Playing State to Stopped State
    }
}
