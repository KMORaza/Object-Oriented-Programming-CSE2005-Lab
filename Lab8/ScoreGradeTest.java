package Lab8;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
import java.util.Scanner;
public class ScoreGradeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for student " + (i + 1));
            System.out.print("Enter Student ID: ");
            int studentID = scanner.nextInt();
            System.out.print("Enter Test Score 1: ");
            int score1 = scanner.nextInt();
            validateScore(score1);
            System.out.print("Enter Test Score 2: ");
            int score2 = scanner.nextInt();
            validateScore(score2);
            System.out.print("Enter Test Score 3: ");
            int score3 = scanner.nextInt();
            validateScore(score3);
            System.out.print("Enter Grade: ");
            char grade = scanner.next().charAt(0);
            validateGrade(grade, (score1 + score2 + score3) / 3);
        }
        scanner.close();
    }
    private static void validateScore(int score) {
        try {
            if (score < 0 || score > 100) {
                throw new ScoreException("Invalid score. Score should be between 0 and 100.");
            }
        } catch (ScoreException e) {
            System.out.println("ScoreException: " + e.getMessage());
            System.exit(1);
        }
    }
    private static void validateGrade(char grade, int averageScore) {
        try {
            if (grade != 'A' && grade != 'B' && grade != 'C' && grade != 'D' && grade != 'F') {
                throw new GradeException("Invalid grade. Grade should be A, B, C, D, or F.");
            }

            if (grade == 'F' && averageScore >= 70) {
                throw new GradeException("Invalid grade. Grade should be F for average score below 70.");
            }
        } catch (GradeException e) {
            System.out.println("GradeException: " + e.getMessage());
            System.exit(1);
        }
    }
}