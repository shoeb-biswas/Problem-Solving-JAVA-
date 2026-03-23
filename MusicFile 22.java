// Abstract class
public abstract class MusicFile {
    public abstract void play();
}

// MP3 class
public class MP3File extends MusicFile {
    public void play() {
        System.out.println("Playing MP3 File.");
    }
}

// WAV class
public class WAVFile extends MusicFile {
    public void play() {
        System.out.println("Playing WAV File.");
    }
}

// FLAC class
public class FLACFile extends MusicFile {
    public void play() {
        System.out.println("Playing FLAC File.");
    }
}

// Factory Interface
public interface MusicFileAbstractFactory {
    MusicFile createMusicFile();
}

// MP3 Factory
public class MP3FileFactory implements MusicFileAbstractFactory {
    public MusicFile createMusicFile() {
        return new MP3File();
    }
}

// WAV Factory
public class WAVFileFactory implements MusicFileAbstractFactory {
    public MusicFile createMusicFile() {
        return new WAVFile();
    }
}

// FLAC Factory
public class FLACFileFactory implements MusicFileAbstractFactory {
    public MusicFile createMusicFile() {
        return new FLACFile();
    }
}

// Main Factory
public class MusicFileFactory {
    public static MusicFile createMusicFile(MusicFileAbstractFactory factory) {
        return factory.createMusicFile();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        MusicFile mp3 = MusicFileFactory.createMusicFile(new MP3FileFactory());
        mp3.play();

        MusicFile wav = MusicFileFactory.createMusicFile(new WAVFileFactory());
        wav.play();

        MusicFile flac = MusicFileFactory.createMusicFile(new FLACFileFactory());
        flac.play();
    }
}
