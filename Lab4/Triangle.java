package Lab4;
// KHAN MOHD OWAIS RAXZA
// 20BCD7138
public class Triangle extends GeometricFigure {
    public Triangle(double base, double height) {
        super(height, base, "Triangle");
    }

    @Override
    public double getArea() {
        return 0.5 * getHeight() * getWidth();
    }
}
