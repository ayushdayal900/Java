package Graph.Algo;

import java.util.ArrayList;
import java.util.Arrays;

public class BellmanFordAlgo {

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

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));
        graph[1].add(new Edge(1, 4, -1));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        return graph;
    }

    public static void bellmanFordAlgo(int src, ArrayList<Edge>[] graph, int V){

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        // relax edges V-1 times
        for(int i = 0; i < V-1; i++){
            for(int u = 0; u < V; u++){
                for(Edge e : graph[u]){
                    if(dist[e.src] != Integer.MAX_VALUE &&
                       dist[e.dest] > dist[e.src] + e.cost){
                        dist[e.dest] = dist[e.src] + e.cost;
                    }
                }
            }
        }


        // detect negative weight cycle
        for(int u = 0; u < V; u++){
            for(Edge e : graph[u]){
                if(dist[e.src] != Integer.MAX_VALUE &&
                dist[e.dest] > dist[e.src] + e.cost){
                    System.out.println("Negative weight cycle detected");
                    return;
                }
            }
        }

        // print result
        for(int d: dist){
            System.out.print(d + " ");
        }
    }

    public static void main(String[] args) {

        int V = 5;  // FIXED
        ArrayList<Edge>[] graph = createGraph(V);

        bellmanFordAlgo(0, graph, V);
    }
}