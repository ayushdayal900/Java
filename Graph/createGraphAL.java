import java.util.ArrayList;

public class createGraphAL {

    public static class Edge {
        
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }
    public static void main(String[] args) {
         /*
                        (5)                    
                    0 -------- 1
                             /  \
                       (1)  /    \  (3)
                           /      \
                          2--------3
                          |   (1)
                     (2)  |
                          |
                          4
          */

          int V = 5;
        //   int[] arr = new int[V]
        // graph is the array of arraylist of size V
        ArrayList<Edge>[] graph = new ArrayList[V]; //null (empty arraylist)stored on each index

        // initialize graph (array) by arraylist
        for(int i=0; i<V; i++){
            graph[i] = new ArrayList<>();
        }


        // for node 0
        graph[0].add(new Edge(0, 1, 5));

        // for node 1
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // for node 2
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));

        // for node 3
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));
        
        // for node 4
        graph[4].add(new Edge(4,2,2));


        // to store neighbours
        for(int i=0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dest);
        }
        
    }
}
