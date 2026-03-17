public abstract class Shape {
    abstract double area();
    abstract double perimeter();
    // TODO: Add an abstract method 'description'
    abstract String description();
}

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }

    // TODO: Implement the description method for Circle
    // return "This is a circle.";
    String description(){
        return "This is a circle.";
    }
}

public class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }

    @Override
    double perimeter() {
        return 2 * (width + height);
    }

    // TODO: Implement the description method for Rectangle
    // return "This is a rectangle.";
    String description(){
        return "This is a rectangle.";
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(3);
        System.out.println("Shape Area: " + shape.area() + ", Perimeter: " + shape.perimeter());
        // TODO: Print the description of the shape
        System.out.println(shape.description());

        shape = new Rectangle(4, 6);
        System.out.println("Shape Area: " + shape.area() + ", Perimeter: " + shape.perimeter());
        // TODO: Print the description of the shape
        System.out.println(shape.description());
    }
}
