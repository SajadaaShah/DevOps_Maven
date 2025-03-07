package kaamkaj;

import java.util.Scanner;

public class Calculator {

    // Method to perform the arithmetic operations
    public double calculate(double num1, double num2, int choice) {
        double result = 0;

        switch (choice) {
            case 1: // Addition
                result = num1 + num2;
                break;
            case 2: // Subtraction
                result = num1 - num2;
                break;
            case 3: // Multiplication
                result = num1 * num2;
                break;
            case 4: // Division
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid choice! Please choose between 1, 2, 3, or 4.");
        }

        return result;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        // Display the calculator menu
        System.out.println("Simple Calculator");
        System.out.println("------------------");
        System.out.println("Select an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Enter choice (1/2/3/4): ");
        
        int choice = scanner.nextInt();

        // Get two numbers from the user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        try {
            // Perform the calculation and display the result
            double result = calculator.calculate(num1, num2, choice);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close the scanner to avoid resource leak
            scanner.close();
        }
    }
}
