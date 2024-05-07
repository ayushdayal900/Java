package test;

import java.util.Scanner;

public class MyDeque {
    private int[] array;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public MyDeque(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void insertFront(int element) {
        if (isFull()) {
            System.out.println("Deque is full. Cannot insert front.");
            return;
        }
        front = (front - 1 + capacity) % capacity;
        array[front] = element;
        size++;
    }

    public void insertRear(int element) {
        if (isFull()) {
            System.out.println("Deque is full. Cannot insert rear.");
            return;
        }
        rear = (rear + 1) % capacity;
        array[rear] = element;
        size++;
    }

    public int deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot delete front.");
            return -1;
        }
        int element = array[front];
        front = (front + 1) % capacity;
        size--;
        return element;
    }

    public int deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot delete rear.");
            return -1;
        }
        int element = array[rear];
        rear = (rear - 1 + capacity) % capacity;
        size--;
        return element;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty.");
            return;
        }
        int index = front;
        for (int i = 0; i < size; i++) {
            System.out.print(array[index] + " ");
            index = (index + 1) % capacity;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the deque: ");
        int capacity = scanner.nextInt();
        MyDeque deque = new MyDeque(capacity);
        
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert Front");
            System.out.println("2. Insert Rear");
            System.out.println("3. Delete Front");
            System.out.println("4. Delete Rear");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert at front: ");
                    int elementFront = scanner.nextInt();
                    deque.insertFront(elementFront);
                    break;
                case 2:
                    System.out.print("Enter element to insert at rear: ");
                    int elementRear = scanner.nextInt();
                    deque.insertRear(elementRear);
                    break;
                case 3:
                    System.out.println("Deleted element from front: " + deque.deleteFront());
                    break;
                case 4:
                    System.out.println("Deleted element from rear: " + deque.deleteRear());
                    break;
                case 5:
                    System.out.println("Deque elements:");
                    deque.display();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        } while (choice != 6);
        
        scanner.close();
    }
}