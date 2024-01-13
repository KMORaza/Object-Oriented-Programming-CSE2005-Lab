package Lab1;
/*
Q5]
(b)
Write a class named ShowStudent that instantiates a Student object from the class you created and assign values to its fields.
Compute the Student grade point average, and then display all the values associated with the Student.
Save the application as ShowStudent.java.
*/
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 25/11/2021
public class ShowStudent {
    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student();
        // Assign values to fields
        student1.setIdNumber(12345);
        student1.setCreditHoursEarned(15);
        student1.setPointsEarned(45);
        // Compute GPA
        student1.computeGradePointAverage();
        // Display all values associated with the Student
        System.out.println("Student Details:");
        student1.displayStudentDetails();
    }
}
/*
OUTPUT:-
Student Details:
Student ID: 12345
Credit Hours Earned: 15
Points Earned: 45
Grade Point Average: 3.0
 */