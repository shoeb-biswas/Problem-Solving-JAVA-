import java.util.ArrayList;
import java.util.List;

// Person class with a name and a list of addresses.
public class Person implements Cloneable {
    private String name;
    private List<Address> addresses;

    public Person(String name) {
        this.name = name;
        this.addresses = new ArrayList<>();
    }

    public void addAddress(Address address) {
        addresses.add(address);
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    @Override
    public Person clone() {
        try {
            // Shallow copy
            Person clonedPerson = (Person) super.clone();
            // TODO: Update the clone method to implement deep cloning for the addresses list
            List<Address> clonedAddresses = new ArrayList<>();
        for (Address addr : this.addresses) {
            Address newAddress = new Address(addr.getStreet(), addr.getCity());
            clonedAddresses.add(newAddress);
        }

        clonedPerson.addresses = clonedAddresses;

        return clonedPerson;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}

// Simple Address class with street and city fields.
public class Address {
    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // Original person
        Person originalPerson = new Person("John Doe");
        originalPerson.addAddress(new Address("123 Main St", "New York"));
        originalPerson.addAddress(new Address("456 Elm St", "Boston"));

        // Clone
        Person clonedPerson = originalPerson.clone();

        // Modify cloned person's address
        clonedPerson.getAddresses().get(0).setStreet("789 Oak St");

        // Print both
        System.out.println("Original Person: " + originalPerson);
        System.out.println("Cloned Person: " + clonedPerson);
    }
}
