package Lab9;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 15/12/2021
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Product {
    private String productId;
    private String productName;
    private double productPrice;

    public Product(String productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return String.format("| %-20s | %-13s | %-15s | %-13.2f |", "", productId, productName, productPrice);
    }
}

class ProductList implements Iterable<Product> {
    private Map<String, Product> products = new HashMap<>();

    public void addProduct(String productId, String productName, double productPrice) {
        products.put(productId, new Product(productId, productName, productPrice));
    }

    @Override
    public Iterator<Product> iterator() {
        return products.values().iterator();
    }
}

class ProductCategory {
    private Map<String, ProductList> categoryMap = new HashMap<>();

    public void addProductToCategory(String category, String productId, String productName, double productPrice) {
        ProductList productList = categoryMap.computeIfAbsent(category, k -> new ProductList());
        productList.addProduct(productId, productName, productPrice);
    }

    public void displayAllProducts() {
        System.out.println(String.format("| %-20s | %-13s | %-15s | %-13s |", "Product Category", "Product_Id", "Product_Name", "Product_Price"));
        System.out.println("|----------------------|----------------|------------------|----------------|");

        Set<Map.Entry<String, ProductList>> entrySet = categoryMap.entrySet();
        for (Map.Entry<String, ProductList> entry : entrySet) {
            System.out.println("Category: " + entry.getKey());
            ProductList productList = entry.getValue();
            for (Product product : productList) {
                System.out.println(product);
            }
            System.out.println("|----------------------|----------------|------------------|----------------|");
        }
    }
}

public class Lab9Q4 {
    public static void main(String[] args) {
        ProductCategory productCategory = new ProductCategory();

        // Adding products to different categories
        productCategory.addProductToCategory("Fancy", "F101", "Fancy Product 1", 15.99);
        productCategory.addProductToCategory("Fancy", "F102", "Fancy Product 2", 19.99);
        productCategory.addProductToCategory("Grocery", "G201", "Grocery Product 1", 5.49);
        productCategory.addProductToCategory("Plastic", "P301", "Plastic Product 1", 8.99);
        productCategory.addProductToCategory("Steel", "S401", "Steel Product 1", 29.99);
        productCategory.addProductToCategory("Steel", "S402", "Steel Product 2", 35.99);

        // Displaying all products
        productCategory.displayAllProducts();
    }
}
