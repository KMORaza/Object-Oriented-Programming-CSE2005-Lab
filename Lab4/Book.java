package Lab4;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
public abstract class Book {
    private String title;
    protected double price; // Change access modifier to protected

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public abstract void setPrice();
}
