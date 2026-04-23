// Strategy Interface
interface ClimateControlStrategy {
    void controlTemperature();
}

// Heating Strategy
class HeatingStrategy implements ClimateControlStrategy {
    @Override
    public void controlTemperature() {
        System.out.println("Heating the house...");
    }
}

// Cooling Strategy
class CoolingStrategy implements ClimateControlStrategy {
    @Override
    public void controlTemperature() {
        System.out.println("Cooling the house...");
    }
}

// Context Class
public class SmartHomeHub {
    private ClimateControlStrategy climateControlStrategy;

    // Set Strategy
    public void setClimateControlStrategy(ClimateControlStrategy strategy) {
        this.climateControlStrategy = strategy;
    }

    // Execute Strategy
    public void executeClimateControl() {
        if (climateControlStrategy != null) {
            climateControlStrategy.controlTemperature();
        } else {
            System.out.println("No climate control strategy set.");
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        SmartHomeHub hub = new SmartHomeHub();

        // Create strategies
        ClimateControlStrategy heating = new HeatingStrategy();
        ClimateControlStrategy cooling = new CoolingStrategy();

        // Use Heating
        hub.setClimateControlStrategy(heating);
        hub.executeClimateControl();

        // Switch to Cooling
        hub.setClimateControlStrategy(cooling);
        hub.executeClimateControl();
    }
}
