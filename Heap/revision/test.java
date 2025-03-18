package revision;

import java.util.PriorityQueue;

public class test {

    public static class Point implements Comparable<Point> {
        int x,y,d,i;
        
        public Point(int x, int y, int d, int i){
            this.x = x;
            this.y = y;
            this.d = d;
            this.i = i;
        }

        @Override
        public int compareTo(Point p) {
            return this.d - p.d;
        }
    }

    public static void main(String[] args) {
        int pts[][] = {{3,3}, {5,-1}, {-2,4}};
        int k = 2;
        
        PriorityQueue<Point> pq = new PriorityQueue<>();
        for(int i=0; i<pts.length; i++){
            int d = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new Point(pts[i][0], pts[i][1], d, i));
        }


        for(int i=0; i<k; i++){
            System.out.println("C" + pq.remove().i);
        }
    }
}