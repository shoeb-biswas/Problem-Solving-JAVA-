public interface MusicPlayer {
    // TODO: Complete the playMusic method signature with the correct return type
   void playMusic();
}

public class CDPlayer {
    // TODO: Define the playCD method to print "Playing music from CD."
    
    public void playCD() {
        System.out.println("Playing music from CD.");
    }
}

public class MusicAdapter implements MusicPlayer {
    private CDPlayer cdPlayer;

    // TODO: Complete the constructor to initialize cdPlayer
    public MusicAdapter(CDPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    // TODO: Override the playMusic method to call playCD on cdPlayer
    @Override
    public void playMusic() {
        cdPlayer.playCD();
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Complete the code to create an instance of CDPlayer
        CDPlayer cdPlayer = new CDPlayer();

        // TODO: Complete the code to create an instance of MusicAdapter passing cdPlayer to it
        MusicPlayer adapter = new MusicAdapter(cdPlayer);

        // TODO: Complete the code to use the adapter to play music
        adapter.playMusic(); // Outputs: Playing music from CD.
    }
}
