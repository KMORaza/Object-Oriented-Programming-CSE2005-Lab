package Lab5;
// KHAN MOHD OWAIS RAZA
// 20BCD7138

// I have added to two classes Door.java and SteeringWheel.java

public class DemoTurners2 {
    public static void main(String[] args) {
        Turner leaf = new Leaf();
        Turner page = new Page();
        Turner pancake = new Pancake();
        Turner door = new Door();
        Turner steeringWheel = new SteeringWheel();

        // Demonstrating the turn() method for each class
        turnAndDisplay(leaf);
        turnAndDisplay(page);
        turnAndDisplay(pancake);
        turnAndDisplay(door);
        turnAndDisplay(steeringWheel);
    }

    private static void turnAndDisplay(Turner turner) {
        turner.turn();
    }
}
