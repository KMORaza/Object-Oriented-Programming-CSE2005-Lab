package Lab8;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
public class ThrowCourseException {
    public static void main(String[] args) {
        try {
            Course[] courses = new Course[6];
            courses[0] = new Course("CIS", 101, 3);
            courses[1] = new Course("ENG", 600, 3); // Invalid course number
            courses[2] = new Course("MAT", 300, 7); // Invalid credits
            courses[3] = new Course("PHY", 201, 2); // Invalid credits
            courses[4] = new Course("ART", 150, 4);
            courses[5] = new Course("BIO", 400, -1); // Invalid credits

        } catch (CourseException e) {
            System.out.println("CourseException: " + e.getMessage());
        }
    }
}
