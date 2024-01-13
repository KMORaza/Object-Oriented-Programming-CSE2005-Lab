package Lab10;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// Shape class
abstract class Shape {
    abstract double calcArea();
}
// Circle class
class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double calcArea() {
        return Math.PI * radius * radius;
    }
}
// Square class
class Square extends Shape {
    private double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double calcArea() {
        return side * side;
    }
}
// Rectangle class
class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double calcArea() {
        return length * width;
    }
}
// Node class
class Node<T extends Shape> {
    private T shape;
    private double area;
    Node(T shape) {
        this.shape = shape;
        this.area = shape.calcArea();
    }
    double compareArea(Node<?> other) {
        return Double.compare(this.area, other.area);
    }
}
public class Lab10Q3 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(6, 8);
        Node<Circle> circleNode = new Node<>(circle);
        Node<Square> squareNode = new Node<>(square);
        Node<Rectangle> rectangleNode = new Node<>(rectangle);
        System.out.println("Circle Area: " + circleNode.compareArea(squareNode));
        System.out.println("Square Area: " + squareNode.compareArea(rectangleNode));
        System.out.println("Rectangle Area: " + rectangleNode.compareArea(circleNode));
    }
}