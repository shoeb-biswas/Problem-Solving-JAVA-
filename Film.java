public class Film {
    private String title;
    private String director;

    // TODO: Define the constructor that initializes the object with the provided title and director
    public Film(String title, String director){
        this.title = title;
        this.director = director;
    }
    public void display() {
        System.out.println("Title: " + title + ", Director: " + director);
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Create an instance of Film with the title "Inception" and director "Christopher Nolan" and display its data
        Film film = new Film("Inception","Christopher Nolan");
        film.display();
    }
}
