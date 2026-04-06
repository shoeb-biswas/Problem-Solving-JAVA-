public interface Hdmi {
    void connectWithHdmiCable();
}

public class Dvi {
    public void connectWithDviCable() {
        System.out.println("Connected with DVI cable.");
    }
}

public class Adapter implements Hdmi {
    private Dvi dvi;

    public Adapter(Dvi dvi) {
        this.dvi = dvi;
    }

    @Override
    public void connectWithHdmiCable() {
        dvi.connectWithDviCable();
    }
}

public class Main {
    public static void main(String[] args) {
        Dvi dvi = new Dvi();
        Hdmi adapter = new Adapter(dvi);
        adapter.connectWithHdmiCable();
    }
}
