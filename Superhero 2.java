// TODO: Define the Superhero enum
// TODO: Define the constants SUPERMAN, BATMAN, WONDER_WOMAN, and SPIDERMAN with their respective power levels and year introduced
// TODO: Create private final int fields for power level and year introduced
// TODO: Implement a constructor that accepts power level and year introduced as parameters and initializes the corresponding fields
// TODO: Write accessor methods getPowerLevel() and getYearIntroduced() returning int values

public enum Superhero {
    // TODO: Implement the enum constants and methods
    SUPERMAN(100, 2000), 
    BATMAN(23, 2003),
    WONDER_WOMAN(45, 3047),
    SPIDERMAN(56, 2005);
    private final int powerlevels;
    private final int yearintroduced;
    Superhero(int powerlevels, int yearintroduced){
        this.powerlevels = powerlevels;
        this.yearintroduced = yearintroduced;
    }
    public int getPowerLevel(){
        return powerlevels;
    }
    public int getYearIntroduced(){
        return yearintroduced;
    }
}

// TODO: Iterate over all values of the Superhero enum and print out the power level and year introduced for each superhero
public class Main {
    public static void main(String[] args) {
        // TODO: Implement the loop to iterate and print details of superheroes here 
        for (Superhero sup: Superhero.values()){
            System.out.println("Power level: " + sup.getPowerLevel() + ", Year Introduced: " + sup.getYearIntroduced());
        }
    }
}
