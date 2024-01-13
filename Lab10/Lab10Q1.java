package Lab10;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
public class Lab10Q1 {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"apple", "banana", "cherry", "date"};

        System.out.println("Printing Integer Array:");
        printArray(intArray);

        System.out.println("Printing String Array:");
        printArray(stringArray);
    }
}
