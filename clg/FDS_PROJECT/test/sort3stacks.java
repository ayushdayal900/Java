package test;

import java.util.Stack;

public class sort3stacks {

    public static void main(String[] args) {

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        Stack<Integer> temp1 = new Stack<>();

        s1.push(3);
        s1.push(5);
        s1.push(1);
        s1.push(4);
        s1.push(2);
        s1.push(8);

        while (!s1.isEmpty()) {
            if (temp.isEmpty()) {
                temp.push(s1.pop());
            }

            else if (!temp.isEmpty() && (s1.peek()) < temp.peek()) {
                temp.push(s1.pop());
            }

            else if (s1.peek() < temp.peek() && !(temp.isEmpty())) {
                while ((s1.peek() < temp.peek()) && !(temp.isEmpty())) {

                    temp1.push(temp.pop());

                    if (temp.isEmpty() || (s1.peek() > temp.peek())) {
                        temp.push(s1.pop());
                    }

                }
            }

            else {
                System.out.println("hiiiiiiii");
            }

        }

        // while((!(temp.isEmpty() && s1.peek()<temp.peek()) )){
        // while((s1.peek()<temp.peek()) && ){

        // }

        for (int i = 0; i < temp1.size(); i++) {
            System.out.println(temp.pop());
        }

    }
}