package Heaps;

import java.util.PriorityQueue;

/**
 * PriorityQueueJCF
 */
public class PriorityQueueJCF {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);      pq.add(4);
        pq.add(9);      pq.add(7);
        pq.add(200);      pq.add(100);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }

    
}