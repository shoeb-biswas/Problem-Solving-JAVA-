public class Musician {
    private String name;
    private String instrument;
    // TODO: Add a new data member 'yearsActive' to capture the number of years the musician has been active
    private int yearsActive;
    // TODO: Update the constructor to include the yearsActive data member
    public Musician(String name, String instrument, int yearsActive) {
        this.name = name;
        this.instrument = instrument;
        this.yearsActive = yearsActive;
    }

    // TODO: Update the display method to include the yearsActive data member in the output
    public void display() {
        System.out.println("Name: " + name + ", Instrument: " + instrument + ", Years Active: " + yearsActive);
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Update the instance of Musician to include the yearsActive data member with a value of 10
        Musician musician = new Musician("John", "Guitar", 10);
        musician.display();
    }
}
