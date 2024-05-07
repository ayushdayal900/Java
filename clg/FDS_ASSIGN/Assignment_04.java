package clg.FDS_ASSIGN;

public class Assignment_04 {
    public static void main(String[] args) {
        Stack stack = new Stack(5); // Create a stack of size 5

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.push(60); // Simulating stack overflow

        stack.displayStack();

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        stack.pop(); // Simulating stack underflow
    }
}

class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top + 1 < maxSize) {
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " onto the stack.");
        } else {
            System.out.println("Stack Overflow! Cannot push " + value + ".");
        }
    }

    public int pop() {
        if (top >= 0) {
            int value = stackArray[top--];
            System.out.println("Popped " + value + " from the stack.");
            return value;
        } else {
            System.out.println("Stack Underflow! Cannot pop from an empty stack.");
            return -1;
        }
    }

    public void displayStack() {
        if (top >= 0) {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stackArray[i]);
            }
        } else {
            System.out.println("Stack is empty.");
        }
    }
}


