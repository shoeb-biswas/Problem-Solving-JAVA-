abstract class Shape {
    abstract double area();   // abstract method
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

public class TestAbstraction {
    public static void main(String[] args) {
        Shape s = new Circle(5);
        System.out.println("Area: " + s.area());
    }
}
