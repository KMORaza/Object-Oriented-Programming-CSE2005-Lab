package Lab8;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
public class Course {
    private String department;
    private int courseNumber;
    private int credits;

    public Course(String department, int courseNumber, int credits) throws CourseException {
        if (!isValidDepartment(department) || !isValidCourseNumber(courseNumber) || !isValidCredits(credits)) {
            throw new CourseException("Invalid course parameters");
        }

        this.department = department;
        this.courseNumber = courseNumber;
        this.credits = credits;
        System.out.println("Course created successfully: " + this);
    }

    private boolean isValidDepartment(String department) {
        return department.length() == 3;
    }

    private boolean isValidCourseNumber(int courseNumber) {
        return courseNumber >= 100 && courseNumber <= 499;
    }

    private boolean isValidCredits(int credits) {
        return credits >= 1 && credits <= 6;
    }

    @Override
    public String toString() {
        return "Course: Department=" + department + ", CourseNumber=" + courseNumber + ", Credits=" + credits;
    }
}
