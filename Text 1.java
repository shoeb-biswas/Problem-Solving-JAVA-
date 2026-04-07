// TODO: Define the Text interface with a format() method.
public interface Text {
    // Method to format the text
    String format();
}

// TODO: Implement the SimpleText class that provides a base implementation of the Text interface.
public class SimpleText implements Text {
    private String text;

    public SimpleText(String text) {
        this.text = text;
    }

    @Override
    public String format() {
        // Return the text
        return "Simple text";
    }
}

// TODO: Create an abstract TextDecorator class that implements the Text interface and adds extra functionality.
public abstract class TextDecorator implements Text {
    protected Text decoratedText;

    public TextDecorator(Text text) {
        this.decoratedText = text;
    }

    @Override
    public String format() {
        // Return the result of calling format() on decoratedText
        return decoratedText.format();
    }
}

// TODO: Implement the BoldText decorator that adds bold formatting to the Text.
public class BoldText extends TextDecorator {
    public BoldText(Text text) {
        super(text);
    }

    @Override
    public String format() {
        // Extend the functionality by adding "<b>" before and "</b>" after the text
        return "<b>" + super.format() + "</b>" ;
    }
}

// TODO: Implement the ItalicText decorator that adds italic formatting to the Text.
public class ItalicText extends TextDecorator {
    public ItalicText(Text text) {
        super(text);
    }

    @Override
    public String format() {
        // Extend the functionality by adding "<i>" before and "</i>" after the text
        return "<i>" + super.format() + "</i>";
    }
}

public class Main {
    public static void main(String[] args) {
        // Create SimpleText
        Text text = new SimpleText("Hello, World!");

        // Apply decorators: first Bold, then Italic
        text = new ItalicText(new BoldText(text));

        // Output result
        System.out.println(text.format());
    }
}
