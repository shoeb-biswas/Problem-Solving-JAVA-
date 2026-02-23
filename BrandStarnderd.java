// 1. Target Interface (Brand A Standard)
interface ProjectorInterface {
    void turnOn();
    void turnOff();
    void changeSource();
}

// 2. Adaptee (Brand B Projector)
class BrandBProjector {
    public void powerUp() {
        System.out.println("Brand B Projector powering up.");
    }
    public void powerDown() {
        System.out.println("Brand B Projector powering down.");
    }
    public void switchInput() {
        System.out.println("Brand B Projector switching input.");
    }
}

// 3. Adapter Class
class BrandBAdapter implements ProjectorInterface {
    private BrandBProjector brandBProjector;

    // Inject the adaptee into the adapter
    public BrandBAdapter(BrandBProjector brandBProjector) {
        this.brandBProjector = brandBProjector;
    }

    @Override
    public void turnOn() {
        brandBProjector.powerUp();
    }

    @Override
    public void turnOff() {
        brandBProjector.powerDown();
    }

    @Override
    public void changeSource() {
        brandBProjector.switchInput();
    }
}
