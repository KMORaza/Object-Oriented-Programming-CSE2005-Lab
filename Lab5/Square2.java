package Lab5;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
public class Square2 extends GeometricFigure2 {
    public Square2(double side) {
        super(side, side, "Square");
    }

    @Override
    public double getArea() {
        return getHeight() * getWidth();
    }

    @Override
    public void displaySides() {
        System.out.println("Number of sides: 4");
    }
}
