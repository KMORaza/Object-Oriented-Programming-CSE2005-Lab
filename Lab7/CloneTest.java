package Lab7;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
import java.util.ArrayList;
import java.util.List;

class Product implements Cloneable {
    private String name;
    private double price;
    private double discount;

    public Product(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public Product clone() {
        try {
            return (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            // This should never happen, as we're Cloneable
            throw new InternalError(e);
        }
    }
}

class ProductBasket implements Cloneable {
    private List<Product> products;

    public ProductBasket() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    @Override
    public ProductBasket clone() {
        try {
            ProductBasket clonedBasket = (ProductBasket) super.clone();
            clonedBasket.products = new ArrayList<>(this.products); // Deep copy the products list
            return clonedBasket;
        } catch (CloneNotSupportedException e) {
            // This should never happen, as we're Cloneable
            throw new InternalError(e);
        }
    }
}

public class CloneTest {
    public static void main(String[] args) {
        // Create products
        Product apple = new Product("Apple", 1.0, 0.1);
        Product bread = new Product("Bread", 2.0, 0.2);

        // Create a product basket and add products
        ProductBasket basket1 = new ProductBasket();
        basket1.addProduct(apple);
        basket1.addProduct(bread);

        // Clone the basket to create a second bill
        ProductBasket basket2 = basket1.clone();

        // Display the products in both baskets
        System.out.println("Basket 1 Products: " + basket1.getProducts());
        System.out.println("Basket 2 Products: " + basket2.getProducts());

        // Remove a product from the second basket
        basket2.removeProduct(bread);

        // Display the modified products in both baskets
        System.out.println("\nAfter removing a product from Basket 2:");
        System.out.println("Basket 1 Products: " + basket1.getProducts());
        System.out.println("Basket 2 Products: " + basket2.getProducts());
    }
}
