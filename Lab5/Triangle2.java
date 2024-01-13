package Lab5;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
public class Triangle2 extends GeometricFigure2 {
    public Triangle2(double base, double height) {
        super(height, base, "Triangle");
    }

    @Override
    public double getArea() {
        return 0.5 * getHeight() * getWidth();
    }

    @Override
    public void displaySides() {
        System.out.println("Number of sides: 3");
    }
}
