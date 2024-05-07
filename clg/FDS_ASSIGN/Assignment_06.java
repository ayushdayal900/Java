package clg.FDS_ASSIGN;

public class Assignment_06 {
    private int maxSize; // Maximum size of the queue
    private int[] queueArray; // Array to hold the elements of the queue
    private int front; // Index of the front element
    private int rear; // Index of the rear element
    private int currentSize; // Current number of elements in the queue

    // Constructor to initialize the queue
    public Assignment_06(int maxSize) {
        this.maxSize = maxSize;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return currentSize == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return currentSize == maxSize;
    }

    // Method to add an element to the rear of the queue
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue element.");
            return;
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = data;
        currentSize++;
    }

    // Method to remove and return the front element of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1; // Return a default value indicating failure
        }
        int removedItem = queueArray[front];
        front = (front + 1) % maxSize;
        currentSize--;
        return removedItem;
    }

    // Method to display the front element of the queue
    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No front element to display.");
            return -1; // Return a default value indicating failure
        }
        return queueArray[front];
    }

    // Method to display the rear element of the queue
    public int rear() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No rear element to display.");
            return -1; // Return a default value indicating failure
        }
        return queueArray[rear];
    }

    public static void main(String[] args) {
        Assignment_06 queue = new Assignment_06(5); // Creating a queue of maximum size 5
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element: " + queue.front()); // Should print 10
        System.out.println("Rear element: " + queue.rear()); // Should print 30

        queue.dequeue(); // Remove 10 from the queue

        System.out.println("Front element after dequeue: " + queue.front()); // Should print 20
        System.out.println("Rear element after dequeue: " + queue.rear()); // Should print 30
    }
}
