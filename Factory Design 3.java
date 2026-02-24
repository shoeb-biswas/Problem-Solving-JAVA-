// 1. Rides (interface)
interface Rides {
    void startRide(String startLocation, String destination);
}

// 2. Concrete Classes
class Cng implements Rides {
    @Override
    public void startRide(String startLocation, String destination) {
        System.out.println("Starting CNG ride from " + startLocation + " to " + destination);
    }
}

class Bike implements Rides {
    @Override
    public void startRide(String startLocation, String destination) {
        System.out.println("Starting BIKE ride from " + startLocation + " to " + destination);
    }
}

class Car implements Rides {
    @Override
    public void startRide(String startLocation, String destination) {
        System.out.println("Starting CAR ride from " + startLocation + " to " + destination);
    }
}

// 3. RideServices (Factory responsible for object creation)
class RideServices {
    public Rides getRide(String rideType) {
        if (rideType == null) {
            return null;
        }
        if (rideType.equalsIgnoreCase("CNG")) {
            return new Cng();
        } else if (rideType.equalsIgnoreCase("BIKE")) {
            return new Bike();
        } else if (rideType.equalsIgnoreCase("CAR")) {
            return new Car();
        }
        throw new IllegalArgumentException("Unknown ride type requested.");
    }
}

// 4. Chalao (Main Class)
public class Chalao {
    public static void main(String[] args) {
        RideServices rideService = new RideServices();

        // The main application only requests a RideService and doesn't use 'new Cng()', etc.
        Rides myRide = rideService.getRide("BIKE");
        myRide.startRide("Mirpur", "Gulshan");

        Rides familyRide = rideService.getRide("CAR");
        familyRide.startRide("Dhanmondi", "Banani");
    }
}
