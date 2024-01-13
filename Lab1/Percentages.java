package Lab1;
/*
Q1]
(a)
Create an application named Percentages whose main() method holds two double variables.
Assign values to the variables. Pass both variables to a method named computePercent()
that displays the two values and the value of the first number as a percentage of the second one.
For example, if the numbers are 2.0 and 5.0, the method should display a statement similar to “2.0 is 40 percent of 5.0.”
Then call the method a second time, passing the values in reverse order. Save the application as Percentages.java.
*/
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 25/11/2021
public class Percentages {
    public static void main(String[] args) {
        // Assign values to the variables
        double num1 = 2.0;
        double num2 = 5.0;
        // Call the computePercent() method with the original order of values
        computePercent(num1, num2);
        // Call the computePercent() method with the values in reverse order
        computePercent(num2, num1);
    }
    // Method to compute and display the percentage relationship between two numbers
    public static void computePercent(double x, double y) {
        // Calculate the percentage
        double percentage = (x / y) * 100;
        // Display the result
        System.out.println(x + " is " + percentage + " percent of " + y + ".");
    }
}

/*
OUTPUT :-
2.0 is 40.0 percent of 5.0.
5.0 is 250.0 percent of 2.0.
*/