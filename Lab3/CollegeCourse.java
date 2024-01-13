package Lab3;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 01/12/202
public class CollegeCourse {
    private String department;
    private int courseNumber;
    private int credits;
    private double fee;

    public CollegeCourse(String department, int courseNumber, int credits) {
        this.department = department;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.fee = credits * 120.0;
    }

    public double getFee() {
        return fee;
    }

    protected void setFee(double fee) {
        this.fee = fee;
    }

    public void display() {
        System.out.println("Course Information:");
        System.out.println("Department: " + department);
        System.out.println("Course Number: " + courseNumber);
        System.out.println("Credits: " + credits);
        System.out.println("Course Fee: $" + fee);
    }
}
