public class Animal {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    public void showSpecies() {
        System.out.println("Species: " + species);
    }
}

class Bird extends Animal{
    private String color;
    
    public Bird(String species, String color){
        super(species);
        this.color = color;
    }
    public void displayColor(){
        System.out.println("Color: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Create a Bird object with species "Parrot" and color "Green"
        Bird bird = new Bird("Parrot", "Green");
        // TODO: Call the showSpecies method to display the species
        bird.showSpecies();
        // TODO: Call the displayColor method to display the color
        bird.displayColor();
    }
}
