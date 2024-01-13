package Lab11;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// December 2021

// Person class
class Person {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String zipCode;
    private String phoneNumber;
    public Person(String firstName, String lastName, String streetAddress, String zipCode, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + streetAddress + ", " + zipCode + ", " + phoneNumber;
    }
}
// CollegeEmployee class
class CollegeEmployee extends Person {
    private String socialSecurityNumber;
    private double annualSalary;
    private String departmentName;
    public CollegeEmployee(String firstName, String lastName, String streetAddress, String zipCode, String phoneNumber,
                           String socialSecurityNumber, double annualSalary, String departmentName) {
        super(firstName, lastName, streetAddress, zipCode, phoneNumber);
        this.socialSecurityNumber = socialSecurityNumber;
        this.annualSalary = annualSalary;
        this.departmentName = departmentName;
    }
    @Override
    public String toString() {
        return super.toString() + ", SSN: " + socialSecurityNumber + ", Salary: " + annualSalary + ", Department: " + departmentName;
    }
}
// Faculty class
class Faculty extends CollegeEmployee {
    private boolean isTenured;
    public Faculty(String firstName, String lastName, String streetAddress, String zipCode, String phoneNumber,
                   String socialSecurityNumber, double annualSalary, String departmentName, boolean isTenured) {
        super(firstName, lastName, streetAddress, zipCode, phoneNumber, socialSecurityNumber, annualSalary, departmentName);
        this.isTenured = isTenured;
    }
    @Override
    public String toString() {
        return super.toString() + ", Tenured: " + isTenured;
    }
}
// Student class
class Student extends Person {
    private String major;
    private double gradePointAverage;
    public Student(String firstName, String lastName, String streetAddress, String zipCode, String phoneNumber,
                   String major, double gradePointAverage) {
        super(firstName, lastName, streetAddress, zipCode, phoneNumber);
        this.major = major;
        this.gradePointAverage = gradePointAverage;
    }
    @Override
    public String toString() {
        return super.toString() + ", Major: " + major + ", GPA: " + gradePointAverage;
    }
}
// GenericQueue interface
interface GenericQueuable<T> {
    void insertEnd(T element);
    T removeBegin();
    void printQueue();
    boolean isQueueEmpty();
}
// GenericQueue implementation
class GenericQueue<T> implements GenericQueuable<T> {
    private Node<T> front;
    private Node<T> rear;
    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    @Override
    public void insertEnd(T element) {
        Node<T> newNode = new Node<>(element);
        if (isQueueEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }
    @Override
    public T removeBegin() {
        if (isQueueEmpty()) {
            return null;
        }
        T data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }
    @Override
    public void printQueue() {
        Node<T> current = front;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    @Override
    public boolean isQueueEmpty() {
        return front == null;
    }
}
// GenericQueueDemo class
public class Lab11Q1 {
    public static void main(String[] args) {
        // Testing GenericQueue with Person type
        GenericQueue<Person> personQueue = new GenericQueue<>();
        personQueue.insertEnd(new Person("John", "Doe", "123 Main St", "12345", "555-1234"));
        personQueue.insertEnd(new Person("Jane", "Doe", "456 Oak St", "67890", "555-5678"));
        System.out.println("Person Queue:");
        personQueue.printQueue();
        // Testing GenericQueue with Student type
        GenericQueue<Student> studentQueue = new GenericQueue<>();
        studentQueue.insertEnd(new Student("Alice", "Smith", "789 Elm St", "54321", "555-9876", "Computer Science", 3.8));
        studentQueue.insertEnd(new Student("Bob", "Johnson", "101 Pine St", "13579", "555-4321", "Physics", 3.5));
        System.out.println("\nStudent Queue:");
        studentQueue.printQueue();
    }
}