package Lab4;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
public class UseBook {
    public static void main(String[] args) {
        Fiction fictionBook = new Fiction("The Great Novel");
        NonFiction nonFictionBook = new NonFiction("Encyclopedia of Everything");

        displayBookInfo(fictionBook);
        displayBookInfo(nonFictionBook);
    }

    private static void displayBookInfo(Book book) {
        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Book Price: $" + book.getPrice());
        System.out.println();
    }
}
