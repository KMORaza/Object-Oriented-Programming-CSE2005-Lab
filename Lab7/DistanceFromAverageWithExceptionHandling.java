package Lab7;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DistanceFromAverageWithExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize array size
        int arraySize = 5;

        // Handle NumberFormatException when entering array size
        try {
            System.out.print("Enter the size of the array: ");
            arraySize = Integer.parseInt(scanner.nextLine());
            if (arraySize < 0) {
                throw new NegativeArraySizeException();
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            return; // Exit the program if invalid input for array size
        } catch (NegativeArraySizeException e) {
            System.out.println("Array size cannot be negative. Setting array size to default value (5).");
            arraySize = 5;
        }

        // Create array
        double[] numbers = new double[arraySize];

        // Input array values and calculate average
        double sum = 0;
        for (int i = 0; i < arraySize; i++) {
            while (true) {
                try {
                    System.out.print("Enter value #" + (i + 1) + ": ");
                    numbers[i] = Double.parseDouble(scanner.nextLine());
                    sum += numbers[i];
                    break; // Exit the loop if valid input is provided
                } catch (NumberFormatException ex) {
                    System.out.println("Invalid input. Please enter a valid double value.");
                }
            }
        }

        // Calculate average
        double average = sum / arraySize;

        // Display each entered value and its distance from the average
        System.out.println("\nValues and their distance from the average:");
        for (int i = 0; i < arraySize; i++) {
            double distance = Math.abs(numbers[i] - average);
            System.out.println("Value #" + (i + 1) + ": " + numbers[i] + ", Distance from Average: " + distance);
        }

        // Close the scanner
        scanner.close();
    }
}
