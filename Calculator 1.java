public class Calculator {
    // TODO: Define the calculate methods
     public int calculate(int a,int b){
        return a + b;
    }
     public double calculate(double base, double exponent){
        return Math.pow(base, exponent);
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Create an instance of the Calculator class
        Calculator calculator = new Calculator();
        System.out.println("Result: " +calculator.calculate(5, 7));
        System.out.println("Result: " +calculator.calculate(2.0, 3.0));
        // TODO: Print out the result of adding 5 and 7
        // TODO: Print out the result of raising 2.0 to the power of 3.0
    }
}
