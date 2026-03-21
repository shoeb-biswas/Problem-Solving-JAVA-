abstract class Instrument{
    public abstract void play();
}

public class Guitar extends Instrument{
    public void play(){
        System.out.println("Playing Guitar 🎸");
    }
}

public class Piano extends Instrument{
    public void play(){
        System.out.println("Playing Piano");
    }
}

public class NullInstrument extends Instrument{
    public void play(){
        System.out.println("Unsupported Instrument");
    }
}

public class InstrumentFactory{
    public enum InstrumentType{
        GUITAR, PIANO, NULL
    }
public static Instrument createInstrument(InstrumentType type){
    switch(type){
        case GUITAR:
            return new Guitar();
        case PIANO:
            return new Piano();
        default:
            return new NullInstrument();
    }
}
}

public class Main {
    public static void main(String[] args) {
        // TODO: Use the InstrumentFactory to create a Guitar and call the play method
        Instrument guiter = InstrumentFactory.createInstrument(InstrumentFactory.InstrumentType.GUITAR);
        guiter.play();
        // TODO: Use the InstrumentFactory to create a Piano and call the play method
        Instrument piano = InstrumentFactory.createInstrument(InstrumentFactory.InstrumentType.PIANO);
        piano.play();
        // TODO: Use the InstrumentFactory to create an unsupported instrument (null) and call the play method
        Instrument unknown = InstrumentFactory.createInstrument(InstrumentFactory.InstrumentType.NULL);
        unknown.play();
    }
}
