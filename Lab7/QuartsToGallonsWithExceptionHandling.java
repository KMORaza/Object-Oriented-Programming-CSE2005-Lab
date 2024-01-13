package Lab7;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
import java.util.InputMismatchException;
import java.util.Scanner;

public class QuartsToGallonsWithExceptionHandling {
    public static void main(String[] args) {
        final int QUARTS_IN_A_GALLON = 4;
        int quartsNeeded = 18; // Default value

        Scanner scanner = new Scanner(System.in);

        // Exception handling loop to ensure valid input
        while (true) {
            try {
                System.out.print("Enter the number of quarts needed for the painting job: ");
                quartsNeeded = scanner.nextInt();

                if (quartsNeeded < 0) {
                    throw new InputMismatchException("Number of quarts cannot be negative.");
                }

                break; // Exit the loop if valid input is provided
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid numeric value.");
                scanner.nextLine(); // Clear the input buffer
            }
        }

        // Calculation
        int gallonsNeeded = quartsNeeded / QUARTS_IN_A_GALLON;
        int remainingQuarts = quartsNeeded % QUARTS_IN_A_GALLON;

        // Display results
        System.out.println("A job that needs " + quartsNeeded + " quarts requires "
                + gallonsNeeded + " gallons plus " + remainingQuarts + " quarts.");

        // Close the scanner
        scanner.close();
    }
}
