public abstract class Vehicle {
    // TODO: Complete the abstract method drive()
    public abstract void drive();
}

public class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car.");
    }
}

public class Bike extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a bike.");
    }
}

public interface VehicleAbstractFactory {
    // TODO: Declare the createVehicle() method
    Vehicle createVehicle();

}

public class CarFactory implements VehicleAbstractFactory {
    @Override
    // TODO: Complete the method to return a new Car object
    public Vehicle createVehicle() {
        return new Car();
    }
}

public class BikeFactory implements VehicleAbstractFactory {
    @Override
    // TODO: Complete the method to return a new Bike object
    public Vehicle createVehicle() {
        return new Bike();
    }
}

public class VehicleFactory {
    public static Vehicle createVehicle(VehicleAbstractFactory factory) {
        return factory.createVehicle();
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Create a Car object using the factory and call the drive method
        Vehicle car = VehicleFactory.createVehicle(new CarFactory());
        car.drive();
        // Should Output: Driving a car.

        // TODO: Create a Bike object using the factory and call the drive method
        Vehicle bike = VehicleFactory.createVehicle(new BikeFactory());
        bike.drive();
        // Should Output: Riding a bike.
    }
}
