import java.util.*;

public class Main {

    static Deque<Integer> printQueue = new ArrayDeque<>();

    public static void submitJob(int jobId) {
        printQueue.addLast(jobId);
    }

    public static void submitUrgentJob(int jobId) {
        printQueue.addFirst(jobId);
    }

    public static int printNextJob() {
        return printQueue.removeFirst();
    }

    public static void main(String[] args) {

        submitJob(101);
        submitJob(102);
        submitUrgentJob(999);
        submitJob(103);

        while (!printQueue.isEmpty()) {
            System.out.println(printNextJob());
        }
    }
}