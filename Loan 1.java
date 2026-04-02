// Abstract class
abstract class Loan {
    protected double interestRate;
    protected double loanAmount;

    public Loan(double interestRate, double loanAmount) {
        this.interestRate = interestRate;
        this.loanAmount = loanAmount;
    }

    abstract void loanDetails();
}

// HomeLoan class
class HomeLoan extends Loan {

    public HomeLoan(double interestRate, double loanAmount) {
        super(interestRate, loanAmount);
    }

    @Override
    void loanDetails() {
        System.out.println("Home Loan -> Interest Rate: " + interestRate + "%, Amount: " + loanAmount);
    }
}

// CarLoan class
class CarLoan extends Loan {

    public CarLoan(double interestRate, double loanAmount) {
        super(interestRate, loanAmount);
    }

    @Override
    void loanDetails() {
        System.out.println("Car Loan -> Interest Rate: " + interestRate + "%, Amount: " + loanAmount);
    }
}

// Factory Interface
interface LoanFactory {
    Loan createLoan(double interestRate, double loanAmount);
}

// HomeLoanFactory
class HomeLoanFactory implements LoanFactory {

    @Override
    public Loan createLoan(double interestRate, double loanAmount) {
        return new HomeLoan(interestRate, loanAmount);
    }
}

// CarLoanFactory
class CarLoanFactory implements LoanFactory {

    @Override
    public Loan createLoan(double interestRate, double loanAmount) {
        return new CarLoan(interestRate, loanAmount);
    }
}

// LoanApplication class
class LoanApplication {

    public Loan applyForLoan(LoanFactory factory, double interestRate, double loanAmount) {
        return factory.createLoan(interestRate, loanAmount);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        LoanApplication app = new LoanApplication();

        // Apply for Home Loan
        Loan homeLoan = app.applyForLoan(new HomeLoanFactory(), 7.5, 500000);
        homeLoan.loanDetails();

        // Apply for Car Loan
        Loan carLoan = app.applyForLoan(new CarLoanFactory(), 9.0, 200000);
        carLoan.loanDetails();
    }
}
