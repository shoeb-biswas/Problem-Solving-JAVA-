public abstract class Vehicle {
    public abstract double speed();
    public abstract double fuelEfficiency();
}

public class Car extends Vehicle {
    private double engineDisplacement;

    public Car(double engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    @Override
    public double speed() {
        return engineDisplacement * 2;
    }
    public double fuelEfficiency() {
        return 15 / engineDisplacement;
    }
}

public class Bicycle extends Vehicle {
    private int gearCount;

    public Bicycle(int gearCount) {
        this.gearCount = gearCount;
    }

    @Override
    public double speed() {
        return gearCount * 3;
    }

    @Override
    public double fuelEfficiency() {
        return gearCount * 10;
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car(3.5);
        Bicycle bicycle = new Bicycle(15);

        System.out.println("Car Speed: " + car.speed() + ", Fuel Efficiency: " + car.fuelEfficiency());
        System.out.println("Bicycle Speed: " + bicycle.speed() + ", Fuel Efficiency: " + bicycle.fuelEfficiency());

        Vehicle vehicle = new Car(2.0);
        System.out.println("Vehicle Speed: " + vehicle.speed() + ", Fuel Efficiency: " + vehicle.fuelEfficiency());
    }
}
