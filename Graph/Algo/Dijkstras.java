package Graph.Algo;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstras {

    public static class Edge{

        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static class Pair implements Comparable<Pair>{
        int n;
        int path;

        public Pair(int n, int path){
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2){
            // return smallest value -------sort by path
            return this.path - p2.path;
        }
        
    }

    static void createGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }



    public static void dijkstras(ArrayList<Edge> graph[], int src){

        int[] dist = new int[graph.length];
        for(int i=0; i<graph.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        boolean[] vis = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        // loop
        while(!pq.isEmpty()){
            // get shortest node
            Pair currPair = pq.remove();
            if(!vis[currPair.n]){
                vis[currPair.n] = true;

                // neighbours
                for(int i=0; i<graph[currPair.n].size(); i++){
                    
                    Edge e = graph[currPair.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int w = e.wt;

                    // update distance of src to v
                    if(dist[u] + w < dist[v]){
                        dist[v] = dist[u] + w;
                        pq.add(new Pair(v, dist[v]));
                    }

                }
            }
        }

        // print all src to vertices shortest paths
        for(int i=0; i<dist.length; i++){
            System.out.println(dist[i] + " ");
        }

    }

    public static void main(String[] args) {

        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        int src = 0;
        dijkstras(graph, src);
    }
}
