import java.util.*;

class Patient {
    int priority;
    String name;

    public Patient(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }
}

public class Main {

    public static void main(String[] args) {

        PriorityQueue<Patient> triageQueue =
                new PriorityQueue<>((a, b) -> a.priority - b.priority);

        triageQueue.offer(new Patient(3, "Anil"));
        triageQueue.offer(new Patient(1, "Rahul"));
        triageQueue.offer(new Patient(2, "Priya"));

        while (!triageQueue.isEmpty()) {
            Patient p = triageQueue.poll();
            System.out.println(p.name + " Priority: " + p.priority);
        }
    }
}