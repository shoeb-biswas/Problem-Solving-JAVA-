public class Vehicle{
    private String make;
    private int year;
    
    public Vehicle(String make, int year){
        this.make = make;
        this.year = year;
    }
    public void drive(){
        System.out.println("Driving a vehicle made by " + make + "in the year " +year);
    }
}

public class Car extends Vehicle{
    private String model;
    
    public Car(String make, int year,String model){
        super(make, year);
        this.model = model;
    }
    public void displayDetails(){
        drive();
        System.out.println("The model is "+model);
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Create an object of Car and call the displayDetails method to show its details
        Car car = new Car("Lamborgini", 2003, "C4u");
        car.displayDetails();
    }
}
