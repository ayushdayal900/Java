package Graph.Algo;

import java.util.*;

public class TarjansAlgorithm {

    static class Edge {
        int src, dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static ArrayList<Edge>[] createGraph(int V) {
        ArrayList<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Graph from image
        graph[1].add(new Edge(1, 0));
        graph[0].add(new Edge(0, 1));

        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 1));

        graph[2].add(new Edge(2, 0));
        graph[0].add(new Edge(0, 2));

        graph[0].add(new Edge(0, 3));
        graph[3].add(new Edge(3, 0));

        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 3));

        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 4));

        graph[3].add(new Edge(3, 5));
        graph[5].add(new Edge(5, 3));

        return graph;
    }

    static ArrayList<Edge>[] createGraph1(int V) {
    ArrayList<Edge>[] graph = new ArrayList[V];
    for (int i = 0; i < V; i++) {
        graph[i] = new ArrayList<>();
    }

    // 1 - 0
    graph[1].add(new Edge(1, 0));
    graph[0].add(new Edge(0, 1));

    // 1 - 2
    graph[1].add(new Edge(1, 2));
    graph[2].add(new Edge(2, 1));

    // 2 - 0
    graph[2].add(new Edge(2, 0));
    graph[0].add(new Edge(0, 2));

    // 0 - 3
    graph[0].add(new Edge(0, 3));
    graph[3].add(new Edge(3, 0));

    // 3 - 4
    graph[3].add(new Edge(3, 4));
    graph[4].add(new Edge(4, 3));

    return graph;
}

    static int time = 0;

    public static void tarjansBridge(ArrayList<Edge>[] graph, int V) {

        int[] dt = new int[V];
        int[] low = new int[V];
        boolean[] vis = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, i, -1, vis, dt, low);
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, int par,
                           boolean[] vis, int[] dt, int[] low) {

        vis[curr] = true;
        dt[curr] = low[curr] = ++time;

        for (Edge e : graph[curr]) {
            int neigh = e.dest;

            if (neigh == par) continue;

            if (!vis[neigh]) {
                dfs(graph, neigh, curr, vis, dt, low);
                low[curr] = Math.min(low[curr], low[neigh]);

                if (dt[curr] < low[neigh]) {
                    System.out.println(curr + " --- " + neigh);
                }
            } else {
                low[curr] = Math.min(low[curr], dt[neigh]);
            }
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = createGraph1(V);
        tarjansBridge(graph, V);
    }
}