package Graph.Algo;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgorithm {

    public static class Edge {
        int src;
        int dest;
        int cost;

        public Edge(int src, int dest, int cost){
            this.src = src;
            this.dest = dest;
            this.cost = cost;
        }
    }

    public static ArrayList<Edge>[] createGraph(int V) {
        ArrayList<Edge>[] graph = new ArrayList[V];

        // initialize arraylist
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // edges (undirected graph)

        // 0 - 1 (10)
        graph[0].add(new Edge(0, 1, 10));
        graph[1].add(new Edge(1, 0, 10));

        // 0 - 2 (15)
        graph[0].add(new Edge(0, 2, 15));
        graph[2].add(new Edge(2, 0, 15));

        // 0 - 3 (30)
        graph[0].add(new Edge(0, 3, 30));
        graph[3].add(new Edge(3, 0, 30));

        // 1 - 3 (40)
        graph[1].add(new Edge(1, 3, 40));
        graph[3].add(new Edge(3, 1, 40));

        // 2 - 3 (50)
        graph[2].add(new Edge(2, 3, 50));
        graph[3].add(new Edge(3, 2, 50));

        return graph;
    }

    public static class  Pair implements Comparable<Pair>{
        int node;
        int cost;

        public Pair(int node, int cost){
            this.node = node;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost;
        }
        
    }

    public static int primsAlgo(ArrayList<Edge>[] graph){
        int minCost = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean[] inMST = new boolean[graph.length];

        pq.offer(new Pair(0, 0));

        while(!pq.isEmpty()){
            Pair currPair = pq.poll();

            if(!inMST[currPair.node]){
                inMST[currPair.node] = true;

                minCost += currPair.cost;

                // explore all neighbours
                for(int i=0; i<graph[currPair.node].size(); i++){

                    Edge e = graph[currPair.node].get(i);

                    if(!inMST[e.dest]){
                        pq.offer(new Pair(e.dest, e.cost));
                    }

                }

            }
        }
        return minCost;
    }

    public static void main(String[] args) {
        
        int V = 4;
        ArrayList<Edge>[] graph = createGraph(V);

        int minCost = primsAlgo(graph);
        System.out.println(minCost);




    }
}
