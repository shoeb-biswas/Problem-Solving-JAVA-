public class Xshop {
    
    // Extracted Magic Numbers to constants for better maintainability
    private static final double VIP_DISCOUNT_RATE = 0.10;
    private static final double FREE_SHIPPING_THRESHOLD = 2000.0;
    private static final double STANDARD_SHIPPING_COST = 80.0;

    public static void main(String[] args) {
        Xshop shop = new Xshop();
        String receipt = shop.processCheckout("Ayesha", "Laptop Bag", 2, 1200.0, true);
        System.out.println(receipt);
    }

    // Refactored method with proper naming and delegated responsibilities
    public String processCheckout(String customerName, String productName, int quantity, double unitPrice, boolean isVip) {
        if (isInvalidInput(customerName, quantity, unitPrice)) {
            return "Checkout failed.";
        }

        double subtotal = calculateSubtotal(quantity, unitPrice);
        double discount = calculateDiscount(subtotal, isVip);
        double shipping = calculateShipping(subtotal, discount);
        double total = (subtotal - discount) + shipping;

        return generateReceipt(customerName, productName, quantity, subtotal, discount, shipping, total);
    }

    // Extracted helper methods to ensure Single Responsibility
    private boolean isInvalidInput(String name, int quantity, double unitPrice) {
        return name == null || name.isBlank() || quantity <= 0 || unitPrice <= 0;
    }

    private double calculateSubtotal(int quantity, double unitPrice) {
        return quantity * unitPrice;
    }

    private double calculateDiscount(double subtotal, boolean isVip) {
        return isVip ? subtotal * VIP_DISCOUNT_RATE : 0.0;
    }

    private double calculateShipping(double subtotal, double discount) {
        return (subtotal - discount) >= FREE_SHIPPING_THRESHOLD ? 0.0 : STANDARD_SHIPPING_COST;
    }

    private String generateReceipt(String name, String product, int quantity, double sub, double disc, double ship, double total) {
        return "Receipt: " + name + " bought " + product + " x" + quantity +
               " | Sub=" + sub +
               " | Disc=" + disc +
               " | Ship=" + ship +
               " | Total=" + total;
    }
}
