// Abstract class Shape
abstract class Shape implements Cloneable {
    private String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Getter
    public String getColor() {
        return color;
    }

    // Abstract clone method
    public abstract Shape cloneShape();

    // Override clone method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

// Circle class
class Circle extends Shape {
    private int radius;

    // Constructor
    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    // Getter
    public int getRadius() {
        return radius;
    }

    // Clone implementation
    @Override
    public Shape cloneShape() {
        return new Circle(this.getColor(), this.radius);
    }

    // Display details
    public void showDetails() {
        System.out.println("Circle -> Color: " + getColor() + ", Radius: " + radius);
    }
}

// Rectangle class
class Rectangle extends Shape {
    private int width;
    private int height;

    // Constructor
    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    // Getters
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    // Clone implementation
    @Override
    public Shape cloneShape() {
        return new Rectangle(this.getColor(), this.width, this.height);
    }

    // Display details
    public void showDetails() {
        System.out.println("Rectangle -> Color: " + getColor() +
                ", Width: " + width + ", Height: " + height);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Circle cloning
        Circle originalCircle = new Circle("Red", 10);
        Circle clonedCircle = (Circle) originalCircle.cloneShape();

        originalCircle.showDetails();
        clonedCircle.showDetails();

        System.out.println();

        // Rectangle cloning
        Rectangle originalRectangle = new Rectangle("Blue", 5, 8);
        Rectangle clonedRectangle = (Rectangle) originalRectangle.cloneShape();

        originalRectangle.showDetails();
        clonedRectangle.showDetails();
    }
}
