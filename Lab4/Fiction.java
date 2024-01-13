package Lab4;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
public class Fiction extends Book {
    public Fiction(String title) {
        super(title);
        setPrice();
    }

    @Override
    public void setPrice() {
        super.price = 24.99;
    }
}
