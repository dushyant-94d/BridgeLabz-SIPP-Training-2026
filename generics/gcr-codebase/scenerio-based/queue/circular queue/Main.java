class PacketBuffer {
    private int[] data;
    private int front;
    private int count;

    public PacketBuffer(int capacity) {
        data = new int[capacity];
        front = 0;
        count = 0;
    }

    public boolean enqueue(int packetId) {
        if (count == data.length) {
            System.out.println("Buffer Full");
            return false;
        }

        int rear = (front + count) % data.length;
        data[rear] = packetId;
        count++;
        return true;
    }

    public int dequeue() {
        if (count == 0) {
            throw new RuntimeException("Buffer Empty");
        }

        int value = data[front];
        front = (front + 1) % data.length;
        count--;
        return value;
    }

    public boolean isEmpty() {
        return count == 0;
    }
}

public class Main {
    public static void main(String[] args) {

        PacketBuffer buffer = new PacketBuffer(3);

        buffer.enqueue(101);
        buffer.enqueue(102);
        buffer.enqueue(103);

        System.out.println(buffer.dequeue());

        buffer.enqueue(104);

        System.out.println(buffer.dequeue());
        System.out.println(buffer.dequeue());
        System.out.println(buffer.dequeue());
    }
}