package Lab11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// A. Generic Map Interface
interface MyMap<K, V> {
    void add(K key, V value);
    V remove(K key);
    int size();
    boolean isEmpty();
    List<K> keys();
    void print();
}
// B. Generic Map Implementation
class MyMapImpl<K, V> implements MyMap<K, V> {
    private final Map<K, V> map;
    MyMapImpl() {
        this.map = new HashMap<>();
    }
    @Override
    public void add(K key, V value) {
        map.put(key, value);
    }
    @Override
    public V remove(K key) {
        return map.remove(key);
    }
    @Override
    public int size() {
        return map.size();
    }
    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }
    @Override
    public List<K> keys() {
        return new ArrayList<>(map.keySet());
    }
    @Override
    public void print() {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
// C. Test Class
public class Lab11Q4 {
    public static void main(String[] args) {
        // Test Map1: <String, Integer>
        MyMap<String, Integer> map1 = new MyMapImpl<>();
        map1.add("One", 1);
        map1.add("Two", 2);
        map1.add("Three", 3);
        map1.add("Two", 22);
        // Test Map2: <Integer, Double>
        MyMap<Integer, Double> map2 = new MyMapImpl<>();
        map2.add(1, 1.1);
        map2.add(2, 2.2);
        map2.add(3, 3.3);
        map2.add(1, 1.11);
        // Print Map1
        System.out.println("Map1:");
        map1.print();
        // Print Map2
        System.out.println("\nMap2:");
        map2.print();
    }
}