// Main1.java
// Name: Krrish Sinha
// PRN: 23070126063
// Batch: 2023-2027

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInput userInput = new UserInput(scanner);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Fibonacci\n6. Sum of Array\n7. Mean of Array\n8. Variance\n9. Standard Deviation\n10. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 10) {
                System.out.println("Exiting program. Goodbye!");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("Result: " + calculator.add(userInput.getNumber(), userInput.getNumber()));
                    break;
                case 2:
                    System.out.println("Result: " + calculator.subtract(userInput.getNumber(), userInput.getNumber()));
                    break;
                case 3:
                    System.out.println("Result: " + calculator.multiply(userInput.getNumber(), userInput.getNumber()));
                    break;
                case 4:
                    System.out.println("Result: " + calculator.divide(userInput.getNumber(), userInput.getNumber()));
                    break;
                case 5:
                    System.out.println("Fibonacci: " + calculator.fibonacci((int) userInput.getNumber()));
                    break;
                case 6:
                    System.out.println("Sum of array: " + calculator.sumArray(userInput.getArray()));
                    break;
                case 7:
                    System.out.println("Mean: " + calculator.mean(userInput.getArray()));
                    break;
                case 8:
                    System.out.println("Variance: " + calculator.variance(userInput.getArray()));
                    break;
                case 9:
                    System.out.println("Standard Deviation: " + calculator.standardDeviation(userInput.getArray()));
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
}

