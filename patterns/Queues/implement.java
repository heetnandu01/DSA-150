public class implement {
    class MyQueue {

    int front;
    int rear;
    int size;
    int capacity;
    int[] arr;

    // Constructor
    public MyQueue(int n) {
        capacity = n;
        front = 0;
        rear = -1;
        size = 0;
        arr = new int[n];
    }

    // Check empty
    public boolean isEmpty() {
        return false;
    }

    // Check full
    public boolean isFull() {
        return false;
    }

    // Insert element
    public void enqueue(int x) {

    }

    // Remove element
    public void dequeue() {

    }

    // Get front
    public int getFront() {
        return -1;
    }

    // Get rear
    public int getRear() {
        return -1;
    }
}
}
