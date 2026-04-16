// Strategy Interface
interface WeatherStrategy {
    void showWeather(String weather);
}

// Concrete Strategy 1
class SunnyWeatherStrategy implements WeatherStrategy {
    @Override
    public void showWeather(String weather) {
        System.out.println("The weather is sunny: " + weather);
    }
}

// Concrete Strategy 2
class RainyWeatherStrategy implements WeatherStrategy {
    @Override
    public void showWeather(String weather) {
        System.out.println("The weather is rainy: " + weather);
    }
}

// Context Class
class WeatherDisplay {
    private WeatherStrategy strategy;

    public void setWeatherStrategy(WeatherStrategy strategy) {
        this.strategy = strategy;
    }

    public void showWeather(String weather) {
        if (strategy != null) {
            strategy.showWeather(weather); // fixed method name
        } else {
            System.out.println("No weather strategy set.");
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        WeatherDisplay display = new WeatherDisplay();

        SunnyWeatherStrategy sunny = new SunnyWeatherStrategy();
        RainyWeatherStrategy rainy = new RainyWeatherStrategy();

        // Set sunny strategy
        display.setWeatherStrategy(sunny);
        display.showWeather("Clear sky");

        // Switch to rainy strategy
        display.setWeatherStrategy(rainy);
        display.showWeather("Heavy rain");
    }
}
