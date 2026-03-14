class Gadget {
    private String name;
    private double price;   // price attribute

    // Constructor with price parameter
    public Gadget(String name, double price) {
        this.name = name;
        setPrice(price);   // use setter for validation
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Setter with validation
    public void setPrice(double price) {
        if (price < 50.00) {
            this.price = 50.00;
        } else {
            this.price = price;
        }
    }

    // Getter
    public double getPrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {
        Gadget gadget = new Gadget("Smartphone", 999.99);

        gadget.setName("Laptop");
        gadget.setPrice(49.99);   // will become 50.00

        System.out.println("Name: " + gadget.getName());
        System.out.println("Price: " + gadget.getPrice());
    }
}
