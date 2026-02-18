class Triangle {
    double a = 3;
    double b = 4;
    double c = 5;

    double getPerimeter() {
        return a + b + c;
    }

    double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

public class Main {
    public static void main(String[] args) {

        Triangle t = new Triangle();

        System.out.println("Perimeter: " + t.getPerimeter());
        System.out.println("Area: " + t.getArea());
    }
}
