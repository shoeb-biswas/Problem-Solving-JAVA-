import java.util.ArrayList;
import java.util.List;

// FileSystem interface
public interface FileSystem {
    void showDetails();
}

// File class (Leaf)
public class File implements FileSystem {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name);
    }
}

// Directory class (Composite)
public class Directory implements FileSystem {
    private List<FileSystem> contents = new ArrayList<>();

    // Add File or Directory
    public void add(FileSystem fs) {
        contents.add(fs);
    }

    // Remove File or Directory
    public void remove(FileSystem fs) {
        contents.remove(fs);
    }

    @Override
    public void showDetails() {
        for (FileSystem fs : contents) {
            fs.showDetails();
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Create files
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");

        // Create directories
        Directory dir1 = new Directory();
        Directory dir2 = new Directory();

        // Add files to first directory
        dir1.add(file1);
        dir1.add(file2);

        // Add first directory to second directory
        dir2.add(dir1);

        // Display details
        System.out.println("Directory 1 contents:");
        dir1.showDetails();

        System.out.println("\nDirectory 2 contents:");
        dir2.showDetails();
    }
}
