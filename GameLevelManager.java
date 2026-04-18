// Abstract class
abstract class GameLevelManager {

    // Template method
    public final void playLevel() {
        initializeLevel();
        startLevel();
        completeLevel();
        cleanupLevel();
    }

    // Default implementation
    public void initializeLevel() {
        System.out.println("Initializing the game level.");
    }

    // Abstract methods
    public abstract void startLevel();
    public abstract void completeLevel();
    public abstract void cleanupLevel();
}

// EasyLevel class
class EasyLevel extends GameLevelManager {

    @Override
    public void startLevel() {
        System.out.println("Starting Easy Level.");
    }

    @Override
    public void completeLevel() {
        System.out.println("Completing Easy Level.");
    }

    @Override
    public void cleanupLevel() {
        System.out.println("Cleaning up after Easy Level.");
    }
}

// HardLevel class
class HardLevel extends GameLevelManager {

    @Override
    public void startLevel() {
        System.out.println("Starting Hard Level.");
    }

    @Override
    public void completeLevel() {
        System.out.println("Completing Hard Level.");
    }

    @Override
    public void cleanupLevel() {
        System.out.println("Cleaning up after Hard Level.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        GameLevelManager easy = new EasyLevel();
        easy.playLevel();

        GameLevelManager hard = new HardLevel();
        hard.playLevel();
    }
}
