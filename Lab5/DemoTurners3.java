package Lab5;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
public class DemoTurners3 {
    public static void main(String[] args) {
        Turner leaf = new Leaf();
        Turner page = new Page();
        Turner pancake = new Pancake();
        Turner door = new Door();
        Turner steeringWheel = new SteeringWheel();

        // Create an array of Turner objects
        Turner[] turners = { leaf, page, pancake, door, steeringWheel };

        // Demonstrating the turn() method for each class using dynamic method dispatch
        for (Turner turner : turners) {
            turnAndDisplay(turner);
        }
    }

    private static void turnAndDisplay(Turner turner) {
        turner.turn();
    }
}
