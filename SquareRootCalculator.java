
package squarerootcalculator;


import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareRootCalculator {
    private Scanner scanner;

    public SquareRootCalculator() {
        scanner = new Scanner(System.in);
    }

    public double getNumberFromUser() throws InputMismatchException {
        System.out.print("Enter a number: ");
        return scanner.nextDouble();
    }

    public double computeSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot compute square root of a negative number.");
        }
        return Math.sqrt(number);
    }

    public void closeScanner() {
        scanner.close();
    }

    public void start() {
        try {
            double number = getNumberFromUser();
            double sqrt = computeSquareRoot(number);
            System.out.println("Square root of " + number + " is " + sqrt);
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            closeScanner();
        }
    }

    public static void main(String[] args) {
        SquareRootCalculator calculator = new SquareRootCalculator();
        calculator.start();
    }
}
