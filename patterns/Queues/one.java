//  GFG Problem :https://www.geeksforgeeks.org/problems/implement-queue-using-array/1

public class one {
    int front, rear, size, capacity;
    int[] arr;
    public void myQueue(int n) {
        capacity = n;
        front = 0;
        rear = -1;
        size = 0;
        arr = new int[n];
    }
    public boolean isEmpty() {
        return size == 0;
        
    }
    public boolean isFull() {
        return size == capacity;
    }
    public void enqueue(int x) {
        if(isFull()){
            System.out.println("Queue OverFlow");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }
    public void dequeue() {
        if (isEmpty()) {
            return;
        }
        front = (front + 1) % capacity;
        size--;
    }
    public int getFront() {
        if (isEmpty()) return -1;
        return arr[front];
    }
    public int getRear() {
        if(isFull()) return -1;
        return arr[rear];
    }
}
