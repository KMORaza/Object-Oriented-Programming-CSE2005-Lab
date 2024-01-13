package Lab10;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lab10Q2<T extends Comparable<T>> {

    private List<T> elements;

    public Lab10Q2(T[] array) {
        elements = Arrays.asList(array);
        Collections.sort(elements);
    }

    public void printSortedForward() {
        System.out.println("Sorted List (Forward Order):");
        for (T element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public void printSortedReverse() {
        System.out.println("Sorted List (Reverse Order):");
        Collections.reverse(elements);
        for (T element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {5, 2, 8, 1, 7};
        String[] strArray = {"banana", "apple", "orange", "grape"};

        Lab10Q2<Integer> intSortedList = new Lab10Q2<>(intArray);
        intSortedList.printSortedForward();
        intSortedList.printSortedReverse();

        Lab10Q2<String> strSortedList = new Lab10Q2<>(strArray);
        strSortedList.printSortedForward();
        strSortedList.printSortedReverse();
    }
}
