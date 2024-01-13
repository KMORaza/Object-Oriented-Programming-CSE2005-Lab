package Lab2;
/*
Q1]
Create a class named Billing that includes three overloaded computeBill() methods for a photo book store.
• When computeBill() receives a single parameter, it represents the price of one photo book ordered. Add 8% tax, and return the total due.
• When computeBill() receives two parameters, they represent the price of a photo book and the quantity ordered. Multiply the two values, add 8% tax, and return the total due.
• When computeBill() receives three parameters, they represent the price of a photo book, the quantity ordered, and a coupon value. Multiply the quantity and price, reduce the result by the coupon value, and then add 8% tax and return the total due.
Write a main() method that tests all three overloaded methods. Save the application as Billing.java.
*/
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 29/11/2021
public class Billing {
    // Constant for tax rate
    private static final double TAX_RATE = 0.08;
    // Method to calculate total due with tax for one photo book
    public static double computeBill(double bookPrice) {
        return bookPrice + (bookPrice * TAX_RATE);
    }
    // Method to calculate total due with tax for multiple photo books
    public static double computeBill(double bookPrice, int quantity) {
        double totalBeforeTax = bookPrice * quantity;
        return totalBeforeTax + (totalBeforeTax * TAX_RATE);
    }
    // Method to calculate total due with tax and coupon discount for multiple photo books
    public static double computeBill(double bookPrice, int quantity, double couponValue) {
        double totalBeforeTax = bookPrice * quantity;
        double discountedTotal = totalBeforeTax - couponValue;
        return discountedTotal + (discountedTotal * TAX_RATE);
    }
    // Main method to test the overloaded computeBill() methods
    public static void main(String[] args) {
        // Test the first method with one parameter
        double total1 = computeBill(20.0);
        System.out.println("Total due for one photo book: $" + total1);
        // Test the second method with two parameters
        double total2 = computeBill(15.0, 3);
        System.out.println("Total due for three photo books: $" + total2);
        // Test the third method with three parameters
        double total3 = computeBill(25.0, 2, 5.0);
        System.out.println("Total due for two photo books with $5 coupon: $" + total3);
    }
}
/*
OUTPUT :-
Total due for one photo book: $21.6
Total due for three photo books: $48.6
Total due for two photo books with $5 coupon: $48.6
*/