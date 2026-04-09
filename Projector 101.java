// Subsystem: Projector
class Projector {
    public void turnOn() {
        System.out.println("Projector is turned on.");
    }

    public void display() {
        System.out.println("Projector is displaying content.");
    }

    public void turnOff() {
        System.out.println("Projector is turned off.");
    }
}

// Subsystem: SoundSystem
class SoundSystem {
    public void start() {
        System.out.println("Sound system is starting.");
    }

    public void playSound() {
        System.out.println("Sound system is playing sound.");
    }

    public void stop() {
        System.out.println("Sound system is stopped.");
    }
}

// Subsystem: Lights
class Lights {
    public void dim() {
        System.out.println("Lights are dimmed.");
    }

    public void brighten() {
        System.out.println("Lights are brightened.");
    }
}

// Facade Class
class HomeTheaterFacade {

    private Projector projector;
    private SoundSystem soundSystem;
    private Lights lights;

    public HomeTheaterFacade() {
        projector = new Projector();
        soundSystem = new SoundSystem();
        lights = new Lights();
    }

    public void watchMovie() {
        System.out.println("Starting movie...");

        lights.dim();
        projector.turnOn();
        projector.display();
        soundSystem.start();
        soundSystem.playSound();

        System.out.println("Movie is now playing.");
    }

    public void endMovie() {
        System.out.println("Ending movie...");

        soundSystem.stop();
        projector.turnOff();
        lights.brighten();

        System.out.println("Movie ended.");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        HomeTheaterFacade homeTheater = new HomeTheaterFacade();

        homeTheater.watchMovie();
        homeTheater.endMovie();
    }
}
