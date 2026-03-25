package Graph;

import java.util.*;

public class ChipestFlightWithinKStops {

    public static class Edge {
        int src, dest, wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static ArrayList<Edge>[] createGraph(int V) {
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 100));
        graph[0].add(new Edge(0, 2, 100));

        graph[1].add(new Edge(1, 2, 100));
        graph[1].add(new Edge(1, 3, 600));

        graph[2].add(new Edge(2, 3, 200));

        return graph;
    }

    public static class Info {
        int node, cost, stops;

        public Info(int n, int c, int s) {
            this.node = n;
            this.cost = c;
            this.stops = s;
        }
    }

    public static int cheapestFlight(ArrayList<Edge>[] graph, int src, int dest, int k) {

        int n = graph.length;

        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while (!q.isEmpty()) {
            Info curr = q.remove();

            if (curr.stops > k) continue;

            for (Edge e : graph[curr.node]) {
                int newCost = curr.cost + e.wt;

                if (newCost < dist[e.dest]) {
                    dist[e.dest] = newCost;
                    q.add(new Info(e.dest, newCost, curr.stops + 1));
                }
            }
        }

        return dist[dest] == Integer.MAX_VALUE ? -1 : dist[dest];
    }

    public static void main(String[] args) {

        int V = 4;
        ArrayList<Edge>[] graph = createGraph(V);

        int src = 0;
        int dest = 3;
        int k = 1;

        System.out.println(cheapestFlight(graph, src, dest, k));
    }
}