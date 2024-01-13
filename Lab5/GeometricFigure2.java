package Lab5;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
public abstract class GeometricFigure2 implements SidedObject {
    private double height;
    private double width;
    private String figureType;

    public GeometricFigure2(double height, double width, String figureType) {
        this.height = height;
        this.width = width;
        this.figureType = figureType;
    }

    public abstract double getArea();

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public String getFigureType() {
        return figureType;
    }
}
