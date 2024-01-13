package Lab3;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 01/12/2021
public class Candle {
    private String color;
    private double height;
    private double price;
    public String getColor() {
        return color;
    }
    public double getHeight() {
        return height;
    }
    public double getPrice() {
        return price;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setHeight(double height) {
        this.height = height;
        this.price = height * 2; // $2 per inch
    }
    public void setPrice(double price) {
        this.price = price;
    }
}