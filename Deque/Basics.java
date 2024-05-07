package Deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Basics {

    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        Deque<Integer> d1 = new ArrayDeque<>();

        //adding at first position
        d.addFirst(0);  //0
        d.addFirst(1);  //1,0

        System.out.println(d);

        //removing first element
        d.removeFirst();
        System.out.println(d);

        //adding at last position
        d.addLast(1);
        d.addLast(2);
        System.out.println(d);

        //removing last element
        d.removeLast();
        System.out.println(d);

        //getting first element
        System.out.println(d.getFirst());

        //getting last element
        System.out.println(d.getLast());



    }

    
}
