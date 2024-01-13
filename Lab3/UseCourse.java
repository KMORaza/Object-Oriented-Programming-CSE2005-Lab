package Lab3;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 01/12/2021
import java.util.Scanner;
public class UseCourse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt user for course information
        System.out.print("Enter department: ");
        String department = scanner.next().toUpperCase();
        System.out.print("Enter course number: ");
        int courseNumber = scanner.nextInt();
        System.out.print("Enter number of credits: ");
        int credits = scanner.nextInt();
        // Check if the department is one of the specified ones
        if (department.equals("BIO") || department.equals("CHM") || department.equals("CIS") || department.equals("PHY")) {
            // Create a LabCourse
            LabCourse labCourse = new LabCourse(department, courseNumber, credits);
            labCourse.display();
        } else {
            // Create a CollegeCourse
            CollegeCourse collegeCourse = new CollegeCourse(department, courseNumber, credits);
            collegeCourse.display();
        }
        scanner.close();
    }
}