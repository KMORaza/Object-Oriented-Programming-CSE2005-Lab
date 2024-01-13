package Lab12;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// DEC 2021
import java.util.LinkedList;
import java.util.Queue;
class SharedBuffer {
    private final int capacity;
    private final Queue<Integer> buffer;
    public SharedBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new LinkedList<>();
    }
    public synchronized void produce(int element) {
        try {
            while (buffer.size() == capacity) {
                wait();
            }
            buffer.add(element);
            System.out.println("Produced: " + element);
            notify();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    public synchronized int consume() {
        try {
            while (buffer.isEmpty()) {
                wait();
            }
            int element = buffer.poll();
            System.out.println("Consumed: " + element);
            notify();
            return element;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }
}
class Producer extends Thread {
    private final SharedBuffer buffer;
    private final int totalElements;
    public Producer(SharedBuffer buffer, int totalElements) {
        this.buffer = buffer;
        this.totalElements = totalElements;
    }
    @Override
    public void run() {
        for (int i = 1; i <= totalElements; i++) {
            buffer.produce(i);
        }
    }
}
class Consumer extends Thread {
    private final SharedBuffer buffer;
    private final int totalElements;
    public Consumer(SharedBuffer buffer, int totalElements) {
        this.buffer = buffer;
        this.totalElements = totalElements;
    }
    @Override
    public void run() {
        for (int i = 1; i <= totalElements; i++) {
            buffer.consume();
        }
    }
}
public class Lab12Q1 {
    public static void main(String[] args) {
        int totalElements = 10;
        SharedBuffer buffer = new SharedBuffer(5);
        Producer producer = new Producer(buffer, totalElements);
        Consumer consumer = new Consumer(buffer, totalElements);
        producer.start();
        consumer.start();
        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}