public class House {

    // Required parameters
    private int rooms;
    private int bathrooms;

    // Optional parameters
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasGarden;

    // Private constructor to enforce the use of the builder
    private House(HouseBuilder builder) {
        this.rooms = builder.rooms;
        this.bathrooms = builder.bathrooms;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
        this.hasGarden = builder.hasGarden;
    }

    // Getters (optional)
    public int getRooms() {
        return rooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public boolean hasGarage() {
        return hasGarage;
    }

    public boolean hasSwimmingPool() {
        return hasSwimmingPool;
    }

    public boolean hasGarden() {
        return hasGarden;
    }

    // Static nested Builder class
    public static class HouseBuilder {

        // Required parameters
        private final int rooms;
        private final int bathrooms;

        // Optional parameters with default values
        private boolean hasGarage = false;
        private boolean hasSwimmingPool = false;
        private boolean hasGarden = false;

        // Constructor for required parameters
        public HouseBuilder(int rooms, int bathrooms) {
            this.rooms = rooms;
            this.bathrooms = bathrooms;
        }

        // Setter for optional parameters
        public HouseBuilder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public HouseBuilder setGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        // Build method to create the House object
        public House build() {
            return new House(this);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        // Building a House object using the Builder pattern
        House house = new House.HouseBuilder(4, 3)  // Required parameters
                .setGarage(true)                    // Optional parameter
                .setSwimmingPool(true)              // Optional parameter
                .setGarden(true)                    // Optional parameter
                .build();

        System.out.println("House has " + house.getRooms() + " rooms.");
        System.out.println("House has " + house.getBathrooms() + " bathrooms.");
        System.out.println("House has a garage: " + house.hasGarage());
        System.out.println("House has a swimming pool: " + house.hasSwimmingPool());
        System.out.println("House has a garden: " + house.hasGarden());
    }
}
