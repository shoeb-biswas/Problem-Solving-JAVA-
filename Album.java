import java.time.Year;

public class Album {
    private String title;
    private String genre;
    private int releaseYear;

    public Album(String title, String genre, int releaseYear) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    // TODO: Add the overloaded constructor here with default release year as current year
    public Album(String title, String genre){
        this.title = title;
        this.genre = genre;
        this.releaseYear = Year.now().getValue();
    }
    // Hint: You can use Year.now().getValue(); to fetch the current year

    public void display() {
        System.out.println("Title: " + title + ", Genre: " + genre + ", Release Year: " + releaseYear);
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Create an Album object with the title "Abbey Road", genre "Rock", and release year 1969
        Album album1 = new Album("Abbey Road","Rock",1969);

        // TODO: Using the overloaded constructor to create an Album object with title "Green River" and genre "Rock"
        Album album2 = new Album("Green River","Rock");

        // TODO: Display the album details for both albums
        album1.display();
        album2.display();
    }
}
