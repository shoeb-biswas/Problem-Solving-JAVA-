public enum CarType {
    SEDAN(1500, 190),
    SUV(2000, 180),
    TRUCK(3000, 120),
    COUPE(1400, 220),
    SPORTS(1200, 300);
    // TODO: Extend the enum with a new car type, SPORTS, with a weight of 1,200 kg and a top speed of 300 km/h.

    private final double weight;   // in kilograms
    private final double topSpeed; // in km/h

    // Constructor
    CarType(double weight, double topSpeed) {
        this.weight = weight;
        this.topSpeed = topSpeed;
    }

    // Accessor methods
    public double getWeight() {
        return weight;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    // Calculate the acceleration of the car
    public double acceleration() {
        final double accelerationFactor = 2.0; // arbitrary constant for example
        return topSpeed / (weight * accelerationFactor);
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Iterate over the CarType values
        for (CarType cartype: CarType.values()){
            System.out.println("Car: " + cartype + ", Weight: " + cartype.getWeight() + ", Top Speed: " + cartype.getTopSpeed() + ", Acceleration: " + cartype.acceleration());
        }
        // TODO: For each car type, print out the weight, top speed, and acceleration.
    }
}
