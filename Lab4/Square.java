package Lab4;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
public class Square extends GeometricFigure {
    public Square(double side) {
        super(side, side, "Square");
    }

    @Override
    public double getArea() {
        return getHeight() * getWidth();
    }
}
