public abstract class Vehicle implements Cloneable {

    private String model;

    // Constructor
    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    // Abstract method to be implemented by concrete prototypes
    public abstract Vehicle cloneVehicle();

    @Override
    protected Vehicle clone() {
        try {
            return (Vehicle) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}

public class Car extends Vehicle {

    private String engineType;

    // Constructor
    public Car(String model, String engineType) {
        super(model);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    // Clone method
    @Override
    public Vehicle cloneVehicle() {
        return new Car(getModel(), engineType);
    }

    public void showDetails() {
        System.out.println("Car Model: " + getModel() + ", Engine Type: " + engineType);
    }
}

public class Main {
    public static void main(String[] args) {
        Car originalCar = new Car("Sedan", "V6");
        Car clonedCar = (Car) originalCar.cloneVehicle();

        // Display details of the original and cloned cars
        originalCar.showDetails(); // Outputs: Car Model: Sedan, Engine Type: V6
        clonedCar.showDetails();   // Outputs: Car Model: Sedan, Engine Type: V6
    }
}
