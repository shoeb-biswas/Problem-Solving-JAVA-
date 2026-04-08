public interface FileSystemComponent{
    void showDetails();
}

public class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println(name);

    }
}

 public void showDetails() {
        // Print the name of the folder
        System.out.println("Folder: " + name);
        // Iterate over the components and call showDetails() on each
        for(FileSystemComponent component: components){
            component.showDetails();
        }

    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Create two File instances
        File file1 = new File("Condom");
        File file2 = new File("Lubricant");
        // TODO: Create a Folder instance "MyFolder" and add the above files to it
        Folder folder = new Folder("MyFolder");

        // TODO: Show details of the folder and its contents
        
        folder.addComponent(file1);
        folder.addComponent(file2);
        folder.showDetails();
    }
}
