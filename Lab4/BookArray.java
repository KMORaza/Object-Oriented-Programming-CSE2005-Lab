package Lab4;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
public class BookArray {
    public static void main(String[] args) {
        // Create an array of 10 books
        Book[] books = new Book[10];
        // Assign Fiction and NonFiction books to the array
        books[0] = new Fiction("The Great Novel");
        books[1] = new NonFiction("Encyclopedia of Everything");
        books[2] = new Fiction("Mystery Masterpiece");
        books[3] = new NonFiction("Science Chronicles");
        books[4] = new Fiction("Adventure Quest");
        books[5] = new NonFiction("History Unveiled");
        books[6] = new Fiction("Fantasy Realm");
        books[7] = new NonFiction("Geography Essentials");
        books[8] = new Fiction("Romantic Saga");
        books[9] = new NonFiction("Mathematics Insights");
        // Display details about all 10 books using a for loop
        for (Book book : books) {
            System.out.println("Book Title: " + book.getTitle());
            System.out.println("Book Price: $" + book.getPrice());
            System.out.println();
        }
    }
}