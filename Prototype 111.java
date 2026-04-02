// Abstract Prototype class
abstract class Prototype implements Cloneable {

    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported");
        }
    }
}
class CustomerProfile extends Prototype {
    private String customerName;
    private String address;
    private String accountNumber;

    // Constructor
    public CustomerProfile(String customerName, String address, String accountNumber) {
        this.customerName = customerName;
        this.address = address;
        this.accountNumber = accountNumber;
    }

    // Getters
    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "CustomerProfile [Name=" + customerName +
               ", Address=" + address +
               ", AccountNumber=" + accountNumber + "]";
    }
}
public class Main {
    public static void main(String[] args) {

        // Original object
        CustomerProfile original = new CustomerProfile(
                "Shoeb", "Dhaka", "ACC12345"
        );

        // Cloned object
        CustomerProfile cloned = (CustomerProfile) original.clone();

        // Print both
        System.out.println("Original: " + original);
        System.out.println("Cloned:   " + cloned);
    }
}
