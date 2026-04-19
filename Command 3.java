// Command Interface
interface Command {
    void execute();
}

// Receiver
class GameCharacter {
    public void jump() {
        System.out.println("Character is jumping.");
    }

    public void crouch() {
        System.out.println("Character is crouching.");
    }
}

// Jump Command
class JumpCommand implements Command {
    private GameCharacter character;

    public JumpCommand(GameCharacter character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.jump();   // filled
    }
}

// Crouch Command
class CrouchCommand implements Command {
    private GameCharacter character;

    public CrouchCommand(GameCharacter character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.crouch();   // filled
    }
}

// Invoker
class GameController {
    private Command command;

    // setter method
    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        GameCharacter character = new GameCharacter();
        Command jump = new JumpCommand(character);
        Command crouch = new CrouchCommand(character);

        GameController controller = new GameController();

        // Jump
        controller.setCommand(jump);
        controller.pressButton();

        // Crouch
        controller.setCommand(crouch);
        controller.pressButton();
    }
}

public class GameCharacter {
    public void jump() {
        System.out.println("Character is jumping.");
    }

    public void crouch() {
        System.out.println("Character is crouching.");
    }
}
