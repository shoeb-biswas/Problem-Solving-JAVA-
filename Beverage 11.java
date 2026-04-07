// TODO: Define the Beverage interface with a method getDescription returning String
public interface Beverage {
    String getDescription();
}

// TODO: Implement the Beverage interface in BasicCoffee class
public class BasicCoffee implements Beverage{
    public String getDescription(){
        return "Black Coffee";
    }
    
}

public class BeverageDecorator implements Beverage{
    private Beverage decoratedBeverage;
    public BeverageDecorator(Beverage beverage){
        this.decoratedBeverage = beverage;
    }
    public String getDescription(){
        return decoratedBeverage.getDescription();
    }
}

public class MilkDecorator extends BeverageDecorator{
    public MilkDecorator(Beverage beverage){
        super(beverage);
    }
    public String getDescription(){
        return super.getDescription() + " + Milk";
    
    }
}

// SugarDecorator extends BeverageDecorator
public class SugarDecorator extends BeverageDecorator {

    // Constructor
    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    // Override getDescription
    @Override
    public String getDescription() {
        return super.getDescription() + " + Sugar";
    }
}
public class Main {
    public static void main(String[] args) {
        // TODO: Create instances of BasicCoffee and wrap them using MilkDecorator and SugarDecorator.
        Beverage milk = new MilkDecorator(new BasicCoffee());
        System.out.println(milk.getDescription());
        // Print the final descriptions.
        Beverage sugar = new SugarDecorator(new BasicCoffee());
        System.out.println(sugar.getDescription());
    }
}
