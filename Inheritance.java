class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car drives");
    }
}

public class TestInheritance {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();   // Inherited method
        c.drive();
    }
}
