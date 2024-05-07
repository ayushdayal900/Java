package test;

import java.util.Stack;

public class SortingWithThreeStacks {

    public static void main(String[] args) {
        
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        Stack<Integer> temp1 = new Stack<>();

        s1.push(3);     s1.push(5);
        s1.push(1);     s1.push(4);
        s1.push(2);     s1.push(8);

        while (!s1.isEmpty()) {
            int current = s1.pop();

            while (!temp.isEmpty() && current < temp.peek()) {
                temp1.push(temp.pop());
            }

            temp.push(current);
        }
        
        while (!temp.isEmpty()) {
            temp1.push(temp.pop());
        }
        
        // Printing the sorted elements
        while (!temp1.isEmpty()) {
            System.out.println(temp1.pop());
        }
    }
}