package Lab1;
/*
Q2]
There are 12 inches in a foot and 3 feet in a yard. Create a class named InchConversion.
Its main() method accepts a value in inches from a user at the keyboard, and in turn passes
the entered value to two methods. One converts the value from inches to feet, and the other
converts the same value from inches to yards. Each method displays the results with
appropriate explanation. Save the application as InchConversion.java.
*/
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 25/11/2021
import java.util.Scanner;
public class InchConversion {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a value in inches
        System.out.print("Enter a value in inches: ");
        double inches = scanner.nextDouble();
        // Call the methods to convert inches to feet and yards
        convertToFeet(inches);
        convertToYards(inches);
        // Close the scanner to prevent resource leak
        scanner.close();
    }
    // Method to convert inches to feet and display the result
    public static void convertToFeet(double inches) {
        // Conversion factor: 1 foot = 12 inches
        double feet = inches / 12;
        // Display the result
        System.out.println(inches + " inches is equal to " + feet + " feet.");
    }
    // Method to convert inches to yards and display the result
    public static void convertToYards(double inches) {
        // Conversion factor: 1 yard = 36 inches
        double yards = inches / 36;
        // Display the result
        System.out.println(inches + " inches is equal to " + yards + " yards.");
    }
}
/*
Enter a value in inches: 12
12.0 inches is equal to 1.0 feet.
12.0 inches is equal to 0.3333333333333333 yards.
 */