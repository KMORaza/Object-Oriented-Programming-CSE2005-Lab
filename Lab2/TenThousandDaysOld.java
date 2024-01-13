package Lab2;
/*
Q5 (b)
Write an application that computes and displays the day on which you become (or became) 10,000 days old.
Save the application as TenThousandDaysOld.java.
*/
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 29/11/2021
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class TenThousandDaysOld {
    public static void main(String[] args) {
        // Specify the target date (29/11/2021)
        LocalDate specifiedDate = LocalDate.of(2021, 11, 29);
        // Calculate the day when you become 10,000 days old from the specified date
        LocalDate tenThousandDaysOld = specifiedDate.plusDays(10000);
        // Display the result
        System.out.println("Specified Date: " + formatLocalDate(specifiedDate));
        System.out.println("You become 10,000 days old on: " + formatLocalDate(tenThousandDaysOld));
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
You become 10,000 days old on: 16/04/2049
 */