package Lab3;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 01/12/2021
public class DemoPoems {
    public static void main(String[] args) {
        // Create objects of each type
        Couplet couplet = new Couplet("A Simple Couplet");
        Limerick limerick = new Limerick("A Funny Limerick");
        Haiku haiku = new Haiku("A Tranquil Haiku");
        // Display details of each poem
        displayPoemDetails(couplet);
        displayPoemDetails(limerick);
        displayPoemDetails(haiku);
    }
    // Helper method to display Poem details
    private static void displayPoemDetails(Poem poem) {
        System.out.println("Poem Name: " + poem.getName());
        System.out.println("Number of Lines: " + poem.getLines());
        System.out.println(); // Add a line break for better readability
    }
}