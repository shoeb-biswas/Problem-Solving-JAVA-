public class Smartphone {

    // Required parameters
    private String brand;
    private String model;

    // Optional parameters
    private boolean hasFrontCamera;
    private boolean hasWirelessCharging;
    private boolean hasExpandableStorage;

    // TODO: Complete the constructor to enforce the use of the builder
    private Smartphone(SmartphoneBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.hasFrontCamera = builder.hasFrontCamera;
        this.hasWirelessCharging = builder.hasWirelessCharging;
        this.hasExpandableStorage = builder.hasExpandableStorage;
    }

    public static class SmartphoneBuilder {

        // Required parameters
        private final String brand;
        private final String model;

        // Optional parameters with default values
        private boolean hasFrontCamera = false;
        private boolean hasWirelessCharging = false;
        private boolean hasExpandableStorage = false;

        // Constructor for required parameters
        public SmartphoneBuilder(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        // TODO: Complete the setter method for hasFrontCamera
        public SmartphoneBuilder setFrontCamera(boolean hasFrontCamera) {
            this.hasFrontCamera = hasFrontCamera;
            return this;
        }

        // TODO: Complete the setter method for hasWirelessCharging
        public SmartphoneBuilder setWirelessCharging(boolean hasWirelessCharging) {
            this.hasWirelessCharging = hasWirelessCharging;
            return this;
        }

        // TODO: Complete the setter method for hasExpandableStorage
        public SmartphoneBuilder setExpandableStorage(boolean hasExpandableStorage) {
            this.hasExpandableStorage = hasExpandableStorage;
            return this;
        }

        // TODO: Complete the build method
        public Smartphone build() {
            return new Smartphone(this);
        }
    }

    // Getters (optional)
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public boolean hasFrontCamera() {
        return hasFrontCamera;
    }

    public boolean hasWirelessCharging() {
        return hasWirelessCharging;
    }

    public boolean hasExpandableStorage() {
        return hasExpandableStorage;
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Complete the builder pattern usage
        Smartphone phone = new Smartphone.SmartphoneBuilder("BrandX", "ModelY")  
                .setFrontCamera(true)                  
                .setWirelessCharging(true)         
                .setExpandableStorage(true)   
                .build();

        // TODO: Complete the print statements
        System.out.println("Brand: " + phone.getBrand());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Has front camera: " + phone.hasFrontCamera());
        System.out.println("Has wireless charging: " + phone.hasWirelessCharging());
        System.out.println("Has expandable storage: " + phone.hasExpandableStorage());
    }
}
