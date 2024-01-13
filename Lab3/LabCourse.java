package Lab3;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 01/12/2021
public class LabCourse extends CollegeCourse {
    private static final double LAB_FEE = 50.0;

    public LabCourse(String department, int courseNumber, int credits) {
        super(department, courseNumber, credits);
        // Add lab fee to the course fee
        super.setFee(super.getFee() + LAB_FEE);
    }

    // Override display method to indicate it's a lab course
    @Override
    public void display() {
        super.display();
        System.out.println("This is a Lab Course.");
    }
}

