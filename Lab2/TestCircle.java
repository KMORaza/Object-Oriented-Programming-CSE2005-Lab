package Lab2;
/*
Q3] (b)
Create a class named TestCircle whose main() method declares several Circle objects.
Using the setRadius() method, assign one Circle a small radius value, and assign another a larger radius value.
Do not assign a value to the radius of the third circle; instead, retain the value assigned at construction. Display all the values for all the Circle objects.
Save the application as TestCircle.java.
*/
public class TestCircle {
    public static void main(String[] args) {
        // Create Circle objects
        Circle circle1 = new Circle(); // Default radius (1)
        Circle circle2 = new Circle(); // Default radius (1)
        Circle circle3 = new Circle(); // Default radius (1)
        // Assign radius values using setRadius() method
        circle1.setRadius(2.5); // Small radius
        circle2.setRadius(7.0); // Larger radius
        // Display values for all Circle objects
        displayCircleDetails("Circle 1", circle1);
        displayCircleDetails("Circle 2", circle2);
        displayCircleDetails("Circle 3", circle3);
    }
    // Helper method to display Circle details
    private static void displayCircleDetails(String label, Circle circle) {
        System.out.println(label + ":");
        System.out.println("   Radius: " + circle.getRadius());
        System.out.println("   Diameter: " + circle.getDiameter());
        System.out.println("   Area: " + circle.getArea());
        System.out.println(); // Add a line break for better readability
    }
}
/*
OUTPUT :-
Circle 1:
   Radius: 2.5
   Diameter: 5.0
   Area: 19.634954084936208

Circle 2:
   Radius: 7.0
   Diameter: 14.0
   Area: 153.93804002589985

Circle 3:
   Radius: 1.0
   Diameter: 2.0
   Area: 3.141592653589793
 */