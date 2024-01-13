package Lab2;
/*
The LocalDate class includes an instance method named lengthOfMonth() that returns the number of days in the month.
Write an application that uses methods in the LocalDate class to calculate how many days are left until the first day of next month.
Display the result, including the name of the next month.
Save the file as DaysTilNextMonth.java.
*/
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 29/11/2021
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DaysTilNextMonth {
    public static void main(String[] args) {
        // Specify the target date (29/11/2021)
        LocalDate specifiedDate = LocalDate.of(2021, 11, 29);
        // Calculate the first day of next month
        LocalDate firstDayOfNextMonth = specifiedDate.plusMonths(1).withDayOfMonth(1);
        // Calculate the number of days left until the first day of next month
        int daysLeft = specifiedDate.lengthOfMonth() - specifiedDate.getDayOfMonth();
        // Display the result
        System.out.println("Specified Date: " + formatLocalDate(specifiedDate));
        System.out.println("Days left until the first day of next month (" + formatLocalDate(firstDayOfNextMonth) + "): " + daysLeft + " days");
    }
    // Helper method to format LocalDate as a string
    private static String formatLocalDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(formatter);
    }
}
/*
OUTPUT :-
Specified Date: 29/11/2021
Days left until the first day of next month (01/12/2021): 1 days
 */