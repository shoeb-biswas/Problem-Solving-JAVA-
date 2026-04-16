public interface PaymentStrategy {
    void pay(int amount);
}
public class CreditCardStrategy implements PaymentStrategy {
    private String cardNumber;

    public CreditCardStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card: " + cardNumber);
    }
}

public class PayPalStrategy implements PaymentStrategy {
    private String email;

    public PayPalStrategy(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal: " + email);
    }
}

public class BitcoinStrategy implements PaymentStrategy{
    private String Bitcoinwallet;
    public BitcoinStrategy(String Bitcoinwallet){
        this.Bitcoinwallet = Bitcoinwallet;
    }
    public void pay(int amount){
        System.out.println("Paid " + amount + " using Bitcoin wallet: " + Bitcoinwallet);
    }
}

public class ShoppingCart {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void checkout(int amount) {
        if (strategy != null) {
            strategy.pay(amount);
        } else {
            System.out.println("No payment strategy set.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        CreditCardStrategy creditCard = new CreditCardStrategy("1234-5678-9876-5432");
        PayPalStrategy payPal = new PayPalStrategy("user@example.com");
        
        BitcoinStrategy bitcoinwallet = new BitcoinStrategy("sawa");
        // TODO: Create an instance of BitcoinStrategy with a sample wallet address.

        cart.setPaymentStrategy(creditCard);
        cart.checkout(100);

        cart.setPaymentStrategy(payPal);
        cart.checkout(200);

        // TODO: Set the payment strategy to Bitcoin and checkout with a sample amount.
        cart.setPaymentStrategy(bitcoinwallet);
        cart.checkout(100);
    }
}
