package Lab1;
/*
Q2]
(b)
Modify the Percentages class to accept the values of the two doubles from a user at the keyboard. Save the file as Percentages2.java.
*/
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 25/11/2021
import java.util.Scanner;
public class Percentages2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first double value: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second double value: ");
        double num2 = scanner.nextDouble();
        computePercent(num1, num2);
        computePercent(num2, num1);
        scanner.close();
    }
    public static void computePercent(double x, double y) {
        // Calculate the percentage
        double percentage = (x / y) * 100;
        // Display the result
        System.out.println(x + " is " + percentage + " percent of " + y + ".");
    }
}
/*
OUTPUT :-
Enter the first double value: 12
Enter the second double value: 36
12.0 is 33.33333333333333 percent of 36.0.
36.0 is 300.0 percent of 12.0.
*/