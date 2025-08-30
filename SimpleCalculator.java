import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true; // Control variable for loop

        while (running) {
            System.out.println("Simple Calculator");
            System.out.println("------------------");

            // Get user inputs
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Display operation options
            System.out.println("\nSelect operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");

            System.out.print("Enter choice (1/2/3/4): ");
            int choice = scanner.nextInt();

            double result;

            // Perform calculation
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;

                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;

                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    }
                    break;

                default:
                    System.out.println("Invalid input. Please select a valid operation.");
                    break;
            }

            // Ask if user wants to continue
            System.out.print("\nDo you want to perform another calculation? (yes/no): ");
            String response = scanner.next().trim().toLowerCase();
            if (response.equals("no") || response.equals("n")) {
                running = false;
                System.out.println("Exiting calculator. Goodbye!");
            }

            System.out.println(); // Blank line for readability
        }

        scanner.close();
    }
}
