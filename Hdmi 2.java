public interface Hdmi {
void connectWithHdmiCable();
}
public class Vga{
    void connectWithVgaCable(){
        System.out.println("Connected with VGA cable.");
    }
}

public class HdmiAdapter implements Hdmi{
    private Vga vga;
    public HdmiAdapter(Vga vga){
        this.vga = vga;
    }
    public void connectWithHdmiCable(){
        vga.connectWithVgaCable();
    }
}

public class Main {
    public static void main(String[] args) {
        Vga vga = new Vga();
        Hdmi adapter = new HdmiAdapter(vga);
        adapter.connectWithHdmiCable();
    }
}
