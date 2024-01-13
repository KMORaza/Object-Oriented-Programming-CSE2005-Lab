package Lab1;
/*
Q3]
Assume that a gallon of paint covers about 350 square feet of wall space.
Create an application with a main() method that prompts the user for the length, width, and height of a rectangular room.
Pass these three values to a method that does the following:
• Calculates the wall area for a room
• Passes the calculated wall area to another method that calculates and returns the number of
gallons of paint needed
• Displays the number of gallons needed
• Computes the price based on a paint price of $32 per gallon, assuming that the painter can
buy any fraction of a gallon of paint at the same price as a whole gallon
• Returns the price to the main() method
 */
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 25/11/2021
import java.util.Scanner;
public class PaintCalculator {
    // Constant for paint coverage per gallon
    private static final double COVERAGE_PER_GALLON = 350.0;
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for room dimensions
        System.out.print("Enter the length of the room: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the room: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height of the room: ");
        double height = scanner.nextDouble();
        // Calculate the wall area
        double wallArea = calculateWallArea(length, width, height);
        // Calculate the number of gallons needed
        double gallonsNeeded = calculateGallonsNeeded(wallArea);
        // Calculate the price based on a paint price of $32 per gallon
        double price = calculatePrice(gallonsNeeded);
        // Display the results
        System.out.println("For the given room dimensions:");
        System.out.println("Wall area: " + wallArea + " square feet");
        System.out.println("Gallons of paint needed: " + gallonsNeeded);
        System.out.println("Price: $" + price);
        // Close the scanner to prevent resource leak
        scanner.close();
    }
    // Method to calculate the wall area of a room
    public static double calculateWallArea(double length, double width, double height) {
        // Formula for wall area of a rectangular room
        return 2 * (length * height + width * height);
    }
    // Method to calculate the number of gallons of paint needed
    public static double calculateGallonsNeeded(double wallArea) {
        // Calculate the number of gallons needed
        return wallArea / COVERAGE_PER_GALLON;
    }
    // Method to calculate the price based on a paint price of $32 per gallon
    public static double calculatePrice(double gallonsNeeded) {
        // Paint price per gallon
        double paintPricePerGallon = 32.0;
        // Calculate the total price
        return gallonsNeeded * paintPricePerGallon;
    }
}
/*
OUTPUT:-
Enter the length of the room: 20
Enter the width of the room: 25
Enter the height of the room: 15
For the given room dimensions:
Wall area: 1350.0 square feet
Gallons of paint needed: 3.857142857142857
Price: $123.42857142857143
 */