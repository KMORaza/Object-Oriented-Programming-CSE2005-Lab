package Lab10;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
import java.util.HashSet;
import java.util.Set;
class MathSet<T extends Number> {
    private Set<T> set;

    MathSet() {
        this.set = new HashSet<>();
    }
    void addElement(T element) {
        if (set.size() >= 5 && set.size() <= 8) {
            set.add(element);
        } else {
            System.out.println("Set size should be between 5 and 8.");
        }
    }
    void displaySet() {
        System.out.println("Set Elements: " + set);
    }
    MathSet<T> union(MathSet<T> otherSet) {
        MathSet<T> resultSet = new MathSet<>();
        resultSet.set.addAll(this.set);
        resultSet.set.addAll(otherSet.set);
        return resultSet;
    }
    MathSet<T> intersect(MathSet<T> otherSet) {
        MathSet<T> resultSet = new MathSet<>();
        resultSet.set.addAll(this.set);
        resultSet.set.retainAll(otherSet.set);
        return resultSet;
    }
    boolean findElement(T element) {
        return set.contains(element);
    }
}
public class Lab10Q4 {
    public static void main(String[] args) {
        MathSet<Integer> set1 = new MathSet<>();
        set1.addElement(1);
        set1.addElement(2);
        set1.addElement(3);
        set1.displaySet();
        MathSet<Integer> set2 = new MathSet<>();
        set2.addElement(3);
        set2.addElement(4);
        set2.addElement(5);
        set2.displaySet();
        MathSet<Integer> unionSet = set1.union(set2);
        System.out.println("Union Set:");
        unionSet.displaySet();
        MathSet<Integer> intersectSet = set1.intersect(set2);
        System.out.println("Intersection Set:");
        intersectSet.displaySet();
        int elementToFind = 2;
        boolean found = set1.findElement(elementToFind);
        System.out.println("Is " + elementToFind + " present in set1? " + found);
    }
}
