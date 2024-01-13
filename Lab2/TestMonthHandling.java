package Lab2;
/*
Q5] (a)
Write a program that declares two LocalDate objects and assign values that represent
January 31 and December 31 in the current year. Display output that demonstrates the dates
displayed when one, two, and three months are added to each of the objects. Save the
application as TestMonthHandling.java.
 */
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 29/11/2021
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class TestMonthHandling {
    public static void main(String[] args) {
        // Get the current year
        int currentYear = LocalDate.now().getYear();
        // Create LocalDate objects for January 31 and December 31 of the current year
        LocalDate january31 = LocalDate.of(currentYear, 1, 31);
        LocalDate december31 = LocalDate.of(currentYear, 12, 31);
        // Display original dates
        System.out.println("Original Dates:");
        displayFormattedDate("January 31: ", january31);
        displayFormattedDate("December 31: ", december31);
        // Add one month to each date
        january31 = january31.plusMonths(1);
        december31 = december31.plusMonths(1);
        // Display dates after adding one month
        System.out.println("\nDates After Adding One Month:");
        displayFormattedDate("January 31: ", january31);
        displayFormattedDate("December 31: ", december31);
        // Add two months to each date
        january31 = january31.plusMonths(2);
        december31 = december31.plusMonths(2);
        // Display dates after adding two months
        System.out.println("\nDates After Adding Two Months:");
        displayFormattedDate("January 31: ", january31);
        displayFormattedDate("December 31: ", december31);
        // Add three months to each date
        january31 = january31.plusMonths(3);
        december31 = december31.plusMonths(3);
        // Display dates after adding three months
        System.out.println("\nDates After Adding Three Months:");
        displayFormattedDate("January 31: ", january31);
        displayFormattedDate("December 31: ", december31);
    }
    // Helper method to display formatted date
    private static void displayFormattedDate(String label, LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, yyyy");
        System.out.println(label + date.format(formatter));
    }
}
/*
OUTPUT :-
Original Dates:
January 31: Jan 31, 2024
December 31: Dec 31, 2024

Dates After Adding One Month:
January 31: Feb 29, 2024
December 31: Jan 31, 2025

Dates After Adding Two Months:
January 31: Apr 29, 2024
December 31: Mar 31, 2025

Dates After Adding Three Months:
January 31: Jul 29, 2024
December 31: Jun 30, 2025
 */