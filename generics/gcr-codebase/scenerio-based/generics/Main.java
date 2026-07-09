import java.util.*;

// Generic Pair Class
class Pair<T, U> {
    T key;
    U value;

    Pair(T key, U value) {
        this.key = key;
        this.value = value;
    }

    void display() {
        System.out.println("Key = " + key + ", Value = " + value);
    }
}

// Generic Stack Class
class Stack<T> {
    ArrayList<T> stack = new ArrayList<>();

    void push(T item) {
        stack.add(item);
    }

    T pop() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    void display() {
        System.out.println(stack);
    }
}

// Generic Repository
class Repository<T> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    void show() {
        System.out.println(list);
    }
}

// Product Class
class Product {
    int id;
    String name;

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

// Utility Class
class Utility {

    // Generic Method
    public static <T extends Comparable<T>> T findMax(T[] arr) {
        T max = arr[0];

        for (T item : arr) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }

        return max;
    }

    // Wildcard Method
    public static void print(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        // Pair Example
        Pair<String, Double> p = new Pair<>("Laptop Price", 65000.50);
        p.display();

        // Stack Example
        Stack<Character> st = new Stack<>();
        st.push('A');
        st.push('B');
        st.push('C');

        System.out.println("\nStack:");
        st.display();
        System.out.println("Removed: " + st.pop());

        // Generic Method Example
        Double[] marks = {75.5, 92.0, 81.2, 98.4};
        System.out.println("\nHighest Marks = " + Utility.findMax(marks));

        // Repository Example
        Repository<Product> repo = new Repository<>();
        repo.add(new Product(101, "Keyboard"));
        repo.add(new Product(102, "Mouse"));

        System.out.println("\nProducts:");
        repo.show();

        // Wildcard Example
        List<String> cities = Arrays.asList("Delhi", "Mumbai", "Pune");
        List<Float> temperature = Arrays.asList(35.5f, 36.8f, 38.1f);

        System.out.println("\nCities:");
        Utility.print(cities);

        System.out.println("Temperatures:");
        Utility.print(temperature);
    }
}