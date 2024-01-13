package Lab1;
/*
Q5]
(c)
Create a constructor for the Student class you created.
The constructor should initialize each Student’s ID number to 9999, his or her points earned to 12, and credit hours to 3 (resulting in a grade point average of 4.0).
Write a program that demonstrates that the constructor works by instantiating an object and displaying the initial values.
Save the application as ShowStudent2.java.
*/
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 25/11/2021
public class ShowStudent2 {
    public static void main(String[] args) {
        // Create a Student object using the constructor
        Student student2 = new Student();
        // Display initial values
        System.out.println("Initial Student Details:");
        student2.displayStudentDetails();
    }
}
