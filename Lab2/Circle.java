package Lab2;
/*
Q3] (a)
Create a class named Circle with fields named radius, diameter, and area.
Include a constructor that sets the radius to 1 and calculates the other two values.
Also include methods named setRadius() and getRadius(). The setRadius() method not only sets the radius, but it also calculates the other two values.
(The diameter of a circle is twice the radius, and the area of a circle is pi multiplied by the square of the radius. Use the Math class PI constant for this calculation.)
Save the class as Circle.java.
*/
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 29/11/2021
public class Circle {
    // Fields
    private double radius;
    private double diameter;
    private double area;
    // Default constructor with radius set to 1 and other values calculated
    public Circle() {
        setRadius(1);
    }
    // Method to set the radius and calculate diameter and area
    public void setRadius(double radius) {
        this.radius = radius;
        this.diameter = 2 * radius;
        this.area = Math.PI * Math.pow(radius, 2);
    }
    // Getter method for radius
    public double getRadius() {
        return radius;
    }
    // Getter method for diameter
    public double getDiameter() {
        return diameter;
    }
    // Getter method for area
    public double getArea() {
        return area;
    }
}