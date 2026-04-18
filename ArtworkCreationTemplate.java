public abstract class ArtworkCreationTemplate {
    // Template method defining the steps of the algorithm
    public final void createArtwork() {
        chooseCanvas();
        sketchOutline();
        applyColors();
        finalizeArtwork(); // added
    }

    // Default implementation for choosing a canvas
    private void chooseCanvas() {
        System.out.println("Choosing a canvas for the artwork.");
    }

    // Abstract methods to be implemented by subclasses
    public abstract void sketchOutline();   // added
    public abstract void applyColors();     // added

    // Default implementation for finalizing the artwork
    private void finalizeArtwork() {
        System.out.println("Finalizing the artwork.");
    }
}

public class OilPaintingCreation extends ArtworkCreationTemplate {
    @Override
    public void sketchOutline() {   // fixed
        System.out.println("Sketching outline for oil painting.");
    }

    @Override
    public void applyColors() {     // fixed
        System.out.println("Applying oil paints.");
    }
}

public class WatercolorPaintingCreation extends ArtworkCreationTemplate {
    @Override
    public void sketchOutline() {   // fixed
        System.out.println("Sketching outline for watercolor painting.");
    }

    @Override
    public void applyColors() {     // fixed
        System.out.println("Applying watercolor paints.");
    }
}

public class Main {
    public static void main(String[] args) {
        ArtworkCreationTemplate oilPainting = new OilPaintingCreation();
        oilPainting.createArtwork();   // added

        ArtworkCreationTemplate watercolorPainting = new WatercolorPaintingCreation();
        watercolorPainting.createArtwork();   // added
    }
}
