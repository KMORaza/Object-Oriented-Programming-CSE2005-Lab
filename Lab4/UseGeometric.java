package Lab4;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
public class UseGeometric {
    public static void main(String[] args) {
        GeometricFigure[] figures = new GeometricFigure[2];

        // Creating objects of Square and Triangle
        figures[0] = new Square(5);
        figures[1] = new Triangle(4, 3);

        // Displaying information for each figure
        for (GeometricFigure figure : figures) {
            figure.displayInfo();
            System.out.println();
        }
    }
}
