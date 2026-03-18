public abstract class Device {
    private double powerRating; // in watts

    public Device(double powerRating) {
        this.powerRating = powerRating;
    }

    public abstract double usageHours();
    public double calculatePowerConsumption(){
        return powerRating*usageHours();
    }

}

public class Laptop extends Device {
    private double dailyUsage; // in hours

    public Laptop(double powerRating, double dailyUsage) {
        super(powerRating);
        this.dailyUsage = dailyUsage;
    }

    public double usageHours(){
        return dailyUsage;
    }
}

public class Smartphone extends Device {
    private double dailyUsage; // in hours

    public Smartphone(double powerRating, double dailyUsage) {
        super(powerRating);
        this.dailyUsage = dailyUsage;
    }

     public double usageHours(){
        return dailyUsage;
    }
}

public class Main {
    public static void main(String[] args) {
        Laptop l = new Laptop(50, 5);
        
        Smartphone s = new Smartphone(10,3);
        
        System.out.println("Laptop Power Consumption: "+ l.calculatePowerConsumption());
        System.out.println("Laptop Power Smartphone: "+ s.calculatePowerConsumption());
    }
}
