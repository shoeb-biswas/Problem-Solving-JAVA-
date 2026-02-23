class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

import java.util.Scanner;

class ExceptionHandling {

    public int calculate(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExceptionHandling obj = new ExceptionHandling();

        try {
            System.out.print("Enter first number: ");
            if (!sc.hasNextInt()) {
                throw new InvalidInputException("Invalid input! Please enter integers only.");
            }
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            if (!sc.hasNextInt()) {
                throw new InvalidInputException("Invalid input! Please enter integers only.");
            }
            int num2 = sc.nextInt();

            int result = obj.calculate(num1, num2);
            System.out.println("Result: " + result);

        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
