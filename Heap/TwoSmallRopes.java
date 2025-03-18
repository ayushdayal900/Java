import java.util.PriorityQueue;

public class TwoSmallRopes {
    public static void main(String[] args) {
        int ropes[] = {2,3,3,4,6};

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i:ropes){
            pq.add(i);
        }

        int cost = 0;
        while(pq.size() != 1){
            int sum = pq.poll() + pq.poll();
            cost += sum;
            pq.add(sum);
        }

        System.out.println(cost);
    }
}
