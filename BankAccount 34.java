public class BankAccount {
    private final String accountNumber;
    private final double balance;
    private final boolean hasOverdraftProtection;
    private final boolean allowsInternationalTransactions;
    private final boolean hasOnlineBankingAccess;

    private BankAccount(AccountBuilder builder) {
        this.accountNumber = builder.accountNumber;
        this.balance = builder.balance;
        this.hasOverdraftProtection = builder.hasOverdraftProtection;
        this.allowsInternationalTransactions = builder.allowsInternationalTransactions;
        this.hasOnlineBankingAccess = builder.hasOnlineBankingAccess;
    }

    public static class AccountBuilder {
        private String accountNumber;
        private double balance;
        private boolean hasOverdraftProtection;
        private boolean allowsInternationalTransactions;
        private boolean hasOnlineBankingAccess;

        // Constructor with required fields
        public AccountBuilder(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        // Optional features (method chaining)
        public AccountBuilder withOverdraftProtection(boolean hasOverdraftProtection) {
            this.hasOverdraftProtection = hasOverdraftProtection;
            return this;
        }

        public AccountBuilder withInternationalTransactions(boolean allowsInternationalTransactions) {
            this.allowsInternationalTransactions = allowsInternationalTransactions;
            return this;
        }

        public AccountBuilder withOnlineBankingAccess(boolean hasOnlineBankingAccess) {
            this.hasOnlineBankingAccess = hasOnlineBankingAccess;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }

    @Override
    public String toString() {
        return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + 
               ", Overdraft Protection=" + hasOverdraftProtection +
               ", International Transactions=" + allowsInternationalTransactions +
               ", Online Banking Access=" + hasOnlineBankingAccess + "]";
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount.AccountBuilder("123456789", 1000.00)
                .withOverdraftProtection(true)
                .withInternationalTransactions(true)
                .withOnlineBankingAccess(true)
                .build();

        System.out.println(account);
    }
}
