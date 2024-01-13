package Lab5;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
public class UseGeometric2 {
    public static void main(String[] args) {
        GeometricFigure2[] figures = { new Square2(5), new Triangle2(4, 3) };

        // Demonstrating the use of both subclasses
        for (GeometricFigure2 figure : figures) {
            System.out.println("Figure Type: " + figure.getFigureType());
            System.out.println("Area: " + figure.getArea());
            figure.displaySides();
            System.out.println();
        }
    }
}
