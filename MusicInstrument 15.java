public abstract class MusicInstrument implements Cloneable {

    private String instrumentType;

    // Constructor
    public MusicInstrument(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    // Abstract method to be implemented by concrete prototypes
    public abstract MusicInstrument cloneInstrument();

    @Override
    protected MusicInstrument clone() {
        try {
            return (MusicInstrument) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}

public class Guitar extends MusicInstrument {

    private String brand;

    // Constructor
    public Guitar(String instrumentType, String brand) {
        super(instrumentType);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    // Clone method
    @Override
    public MusicInstrument cloneInstrument() {
        return new Guitar(getInstrumentType(), brand);
    }

    public void showDetails() {
        System.out.println("Instrument Type: " + getInstrumentType() + ", Brand: " + brand);
    }
}

public class Main {
    public static void main(String[] args) {
        Guitar originalGuitar = new Guitar("String", "Fender");
        Guitar clonedGuitar = (Guitar) originalGuitar.cloneInstrument();

        // Display details of the original and cloned guitars
        originalGuitar.showDetails(); // Outputs: Instrument Type: String, Brand: Fender
        clonedGuitar.showDetails();   // Outputs: Instrument Type: String, Brand: Fender
    }
}
