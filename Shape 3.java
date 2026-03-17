import java.lang.Math;

public abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
}

public class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}

import java.lang.Math;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// TODO: Define a public class named Triangle that extends the Shape class
import java.lang.Math;
public class Triangle extends Shape{
    private double side;
    public Triangle(double side){
        this.side = side;
    }
    public double area(){
        return (Math.sqrt(3)/4)*side*side;
    }
     public double perimeter() {
        return 3 * side;
    }
}

public class Main {
    public static void main(String[] args) {
        
        Shape shape = new Circle(3);
        System.out.println("Shape Area: " + shape.area() + ", Perimeter: " + shape.perimeter());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + rectangle.area() + ", Perimeter: " + rectangle.perimeter());

    
        Triangle t = new Triangle(3);
        System.out.println("Triangle area: "+t.area()+", Perimeter: "+
        t.perimeter());
    }
}
