package Lab4;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
public abstract class GeometricFigure {
    private double height;
    private double width;
    private String figureType;

    public GeometricFigure(double height, double width, String figureType) {
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

    public void displayInfo() {
        System.out.println("Figure Type: " + figureType);
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Area: " + getArea());
    }
}

