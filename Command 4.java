// Command Interface
interface Command {
    void execute();
}

// Receiver
class TextEditor {
    public void bold() {
        System.out.println("Text is bold.");
    }

    public void italic() {
        System.out.println("Text is italic.");
    }
}

// Concrete Command: Bold
class BoldCommand implements Command {
    private TextEditor editor;

    public BoldCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.bold();
    }
}

// Concrete Command: Italic
class ItalicCommand implements Command {
    private TextEditor editor;

    public ItalicCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.italic();
    }
}

// Invoker
class TextEditorInvoker {
    private Command command;

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
        // Create receiver
        TextEditor editor = new TextEditor();

        // Create commands
        Command bold = new BoldCommand(editor);
        Command italic = new ItalicCommand(editor);

        // Invoker
        TextEditorInvoker invoker = new TextEditorInvoker();

        // Execute Bold
        invoker.setCommand(bold);
        invoker.pressButton();

        // Execute Italic
        invoker.setCommand(italic);
        invoker.pressButton();
    }
}
