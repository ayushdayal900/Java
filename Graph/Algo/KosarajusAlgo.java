package Graph.Algo;

import java.util.ArrayList;
import java.util.Stack;

public class KosarajusAlgo {

    public static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static ArrayList<Edge>[] createGraph(int V) {
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // make cycle between 0,1,2
        graph[0].add(new Edge(0, 1, 1));
        graph[1].add(new Edge(1, 2, 1));
        graph[2].add(new Edge(2, 0, 1));

        // rest same
        graph[0].add(new Edge(0, 3, 1));
        graph[3].add(new Edge(3, 4, 1));

        return graph;
    }

    public static void topoSort(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> s){

        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                topoSort(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis){
        vis[curr] = true;
        System.out.print(curr + " ");

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void kosaraju(ArrayList<Edge>[] graph, int V){

        // a: topological sort
        Stack<Integer> st = new Stack<>();
        boolean[] vis = new boolean[V];

        for(int i=0; i<V; i++){
            if(!vis[i]){
                topoSort(graph, i, vis, st);
            }
        }


        // b: transpose
        ArrayList<Edge>[] transpose = new ArrayList[V];

        for(int i=0; i<graph.length; i++){
            vis[i] = false;
            transpose[i] = new ArrayList<Edge>();
        }

        for(int i=0; i<V; i++){
            for(int j=0; j<graph[i].size(); j++){
                Edge e = graph[i].get(j);

                // reversing the edge
                transpose[e.dest].add(new Edge(e.dest, e.src, e.wt));

            }
        }

        // c:

        while(!st.isEmpty()){
            int curr = st.pop();
            if(!vis[curr]){
                // print ssc
                System.out.print("SSC -> ");
                dfs(transpose, curr, vis);
                System.out.println();
            }
            
        }



    }


    public static void main(String[] args) {

        int V = 5;
        ArrayList<Edge>[] graph = createGraph(V);

        kosaraju(graph, V);

    }
}
