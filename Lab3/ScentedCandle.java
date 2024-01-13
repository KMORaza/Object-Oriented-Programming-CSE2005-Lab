package Lab3;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 01/12/2021
public class ScentedCandle extends Candle {
    private String scent;
    public String getScent() {
        return scent;
    }
    public void setScent(String scent) {
        this.scent = scent;
    }
    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        // Override setHeight() to set the price of ScentedCandle at $3 per inch
        super.setPrice(height * 3); // $3 per inch
    }
}