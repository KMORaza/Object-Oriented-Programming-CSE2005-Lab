package Lab5;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
public class DemoTurners {
    public static void main(String[] args) {
        Turner leaf = new Leaf();
        Turner page = new Page();
        Turner pancake = new Pancake();

        // Demonstrating the turn() method for each class
        turnAndDisplay(leaf);
        turnAndDisplay(page);
        turnAndDisplay(pancake);
    }

    private static void turnAndDisplay(Turner turner) {
        turner.turn();
    }
}
