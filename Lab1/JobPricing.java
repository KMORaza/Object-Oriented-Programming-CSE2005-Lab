package Lab1;
/*
Q4]
Herbert’s Home Repair estimates each job cost as the cost of materials plus $35 per hour while on the job, plus $12 per hour for travel time to the job site.
Create a class that contains a main() method that prompts the user for the name of a job (for example, Smith bathroom remodel), the cost of materials, the number of hours of work required, and the number of hours travel time.
Pass the numeric data to a method that computes estimate for the job and returns the computed value to the main() method where the job name and estimated price are displayed.
Save the program as JobPricing.java.
*/
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 25/11/2021
import java.util.Scanner;
public class JobPricing {
    // Constants for pricing
    private static final double MATERIALS_COST = 35.0;  // Cost of materials
    private static final double WORK_HOURLY_RATE = 35.0; // Hourly rate for work
    private static final double TRAVEL_HOURLY_RATE = 12.0; // Hourly rate for travel time
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for job details
        System.out.print("Enter the name of the job: ");
        String jobName = scanner.nextLine();
        System.out.print("Enter the cost of materials: $");
        double materialsCost = scanner.nextDouble();
        System.out.print("Enter the number of hours of work required: ");
        double workHours = scanner.nextDouble();
        System.out.print("Enter the number of hours of travel time: ");
        double travelHours = scanner.nextDouble();
        // Calculate the estimate for the job
        double estimate = calculateJobEstimate(materialsCost, workHours, travelHours);
        // Display the job name and estimated price
        System.out.println("Job Name: " + jobName);
        System.out.println("Estimated Price: $" + estimate);
        // Close the scanner to prevent resource leak
        scanner.close();
    }
    // Method to calculate the estimate for the job
    public static double calculateJobEstimate(double materialsCost, double workHours, double travelHours) {
        // Calculate the estimate based on the given pricing information
        double estimate = materialsCost + (WORK_HOURLY_RATE * workHours) + (TRAVEL_HOURLY_RATE * travelHours);
        return estimate;
    }
}
/*
OUTPUT :-
Enter the name of the job: Paint
Enter the cost of materials: $12
Enter the number of hours of work required: 25
Enter the number of hours of travel time: 8
Job Name: Paint
Estimated Price: $983.0
 */