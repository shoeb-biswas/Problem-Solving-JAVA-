interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class PayPalPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

class BankTransferPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Bank Transfer.");
    }
}

class PaymentFactory {

    public static Payment getPayment(String type) {
        if (type.equalsIgnoreCase("credit")) {
            return new CreditCardPayment();
        } else if (type.equalsIgnoreCase("paypal")) {
            return new PayPalPayment();
        } else if (type.equalsIgnoreCase("bank")) {
            return new BankTransferPayment();
        }
        return null;
    }
}

public class MarketplaceClient {
    public static void main(String[] args) {

        Payment payment = PaymentFactory.getPayment("paypal");
        payment.pay(1500.0);
    }
}
