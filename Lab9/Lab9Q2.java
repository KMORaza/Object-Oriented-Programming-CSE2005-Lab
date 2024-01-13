package Lab9;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 15/12/2021
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Product {
    private int productId;
    private String productName;
    private double productPrice;

    public Product(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }
}

class ProductList {
    private List<Product> productList = new LinkedList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void displayProducts(Comparator<Product> comparator) {
        // Sort the productList using the provided comparator
        Collections.sort(productList, comparator);

        // Display the sorted products
        for (Product product : productList) {
            System.out.println("Product ID: " + product.getProductId());
            System.out.println("Product Name: " + product.getProductName());
            System.out.println("Product Price: $" + product.getProductPrice());
            System.out.println("--------------------------");
        }
    }
}

public class Lab9Q2 {
    public static void main(String[] args) {
        ProductList productList = new ProductList();

        productList.addProduct(new Product(1, "Laptop", 899.99));
        productList.addProduct(new Product(2, "Smartphone", 599.99));
        productList.addProduct(new Product(3, "Headphones", 99.99));

        System.out.println("Products in ascending order of names:");
        productList.displayProducts(Comparator.comparing(Product::getProductName));

        System.out.println("\nProducts in descending order of prices:");
        productList.displayProducts(Comparator.comparing(Product::getProductPrice).reversed());
    }
}
