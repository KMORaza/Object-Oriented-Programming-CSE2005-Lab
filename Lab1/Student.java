package Lab1;
/*
Q5]
(a)
Create a class named Student that has fields for an ID number, number of credit hours earned, and number of points earned. (For example, many schools compute grade point averages based on a scale of 4, so a three-credit-hour class in which a student earns an A is worth 12 points.)
Include methods to assign values to all fields. A Student also has a field for grade point average.
Include a method to compute the grade point average field by dividing points by credit hours earned.
Write methods to display the values in each Student field. Save this class as Student.java.
 */
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 25/11/2021
public class Student {
    // Fields
    private int idNumber;
    private int creditHoursEarned;
    private int pointsEarned;
    private double gradePointAverage;
    // Methods to assign values to fields
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    public void setCreditHoursEarned(int creditHoursEarned) {
        this.creditHoursEarned = creditHoursEarned;
    }
    public void setPointsEarned(int pointsEarned) {
        this.pointsEarned = pointsEarned;
    }
    // Method to compute the grade point average
    public void computeGradePointAverage() {
        if (creditHoursEarned != 0) {
            gradePointAverage = (double) pointsEarned / creditHoursEarned;
        } else {
            // Avoid division by zero error
            System.out.println("Error: Cannot compute GPA. Credit hours earned is zero.");
        }
    }
    // Method to display values in each field
    public void displayStudentDetails() {
        System.out.println("Student ID: " + idNumber);
        System.out.println("Credit Hours Earned: " + creditHoursEarned);
        System.out.println("Points Earned: " + pointsEarned);
        System.out.println("Grade Point Average: " + gradePointAverage);
    }
    // Example usage in a main method
    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student();
        // Assign values to fields
        student1.setIdNumber(12345);
        student1.setCreditHoursEarned(15);
        student1.setPointsEarned(45);
        // Compute GPA
        student1.computeGradePointAverage();
        // Display student details
        student1.displayStudentDetails();
    }
}
/*
Student ID: 12345
Credit Hours Earned: 15
Points Earned: 45
Grade Point Average: 3.0
 */