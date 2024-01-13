package Lab2;
/*
Q4]
Write a Java application that uses the Math class to determine the answers for each of
the following:
a. The square root of 37.
b. The sine and cosine of 300.
c. The value of the floor, ceiling, and round of 22.8.
d. The larger and the smaller of the character ‘D’ and the integer 71.
e. A random number between 0 and 20.
(Hint: The random() method returns a value between 0 and 1; you want a number that is 20
times larger.)
Save the application as MathTest.java
*/
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 29/11/2021
public class MathTest {
    public static void main(String[] args) {
        // a. Square root of 37
        double squareRoot = Math.sqrt(37);
        System.out.println("a. Square root of 37: " + squareRoot);
        // b. Sine and cosine of 300 (in radians)
        double angleInRadians = Math.toRadians(300);
        double sineValue = Math.sin(angleInRadians);
        double cosineValue = Math.cos(angleInRadians);
        System.out.println("b. Sine of 300: " + sineValue);
        System.out.println("   Cosine of 300: " + cosineValue);
        // c. Floor, ceiling, and round of 22.8
        double value = 22.8;
        double floorValue = Math.floor(value);
        double ceilingValue = Math.ceil(value);
        long roundValue = Math.round(value);
        System.out.println("c. Floor of 22.8: " + floorValue);
        System.out.println("   Ceiling of 22.8: " + ceilingValue);
        System.out.println("   Round of 22.8: " + roundValue);
        // d. Larger and smaller of 'D' and 71
        char charD = 'D';
        int int71 = 71;
        char largerChar = (char) Math.max(charD, int71);
        char smallerChar = (char) Math.min(charD, int71);
        System.out.println("d. Larger of 'D' and 71: " + largerChar);
        System.out.println("   Smaller of 'D' and 71: " + smallerChar);
        // e. Random number between 0 and 20
        double randomValue = Math.random() * 20;
        System.out.println("e. Random number between 0 and 20: " + randomValue);
    }
}
/*
OUTPUT :-
a. Square root of 37: 6.082762530298219
b. Sine of 300: -0.8660254037844386
   Cosine of 300: 0.5000000000000001
c. Floor of 22.8: 22.0
   Ceiling of 22.8: 23.0
   Round of 22.8: 23
d. Larger of 'D' and 71: G
   Smaller of 'D' and 71: D
e. Random number between 0 and 20: 4.1256025187557155
 */