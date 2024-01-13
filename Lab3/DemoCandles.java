package Lab3;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 01/12/2021
public class DemoCandles {
    public static void main(String[] args) {
        // Instantiate a Candle object
        Candle candle = new Candle();
        candle.setColor("Red");
        candle.setHeight(5.0);
        // Display details of the Candle object
        System.out.println("Candle Details:");
        System.out.println("Color: " + candle.getColor());
        System.out.println("Height: " + candle.getHeight() + " inches");
        System.out.println("Price: $" + candle.getPrice());
        System.out.println();
        // Instantiate a ScentedCandle object
        ScentedCandle scentedCandle = new ScentedCandle();
        scentedCandle.setColor("Blue");
        scentedCandle.setHeight(4.0);
        scentedCandle.setScent("Lavender");
        // Display details of the ScentedCandle object
        System.out.println("Scented Candle Details:");
        System.out.println("Color: " + scentedCandle.getColor());
        System.out.println("Height: " + scentedCandle.getHeight() + " inches");
        System.out.println("Price: $" + scentedCandle.getPrice());
        System.out.println("Scent: " + scentedCandle.getScent());
    }
}