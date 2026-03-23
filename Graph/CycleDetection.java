package Graph;

import java.util.ArrayList;

public class CycleDetection {

    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }


// cycle undirectede
    public static  ArrayList<Edge>[] createGraph1(int V) {
    
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        // 1
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        // 2
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        // 3
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        // 4
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        // 5
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        // 6
        graph[6].add(new Edge(6, 5, 1));

        return graph;
    }

// no cycle undirectede
    public static ArrayList<Edge>[] createGraph(int V) {

    ArrayList<Edge>[] graph = new ArrayList[V];

    for (int i = 0; i < V; i++) {
        graph[i] = new ArrayList<>();
    }

    // 0
    graph[0].add(new Edge(0, 1, 1));
    graph[1].add(new Edge(1, 0, 1));

    graph[0].add(new Edge(0, 2, 1));
    graph[2].add(new Edge(2, 0, 1));

    // 1
    graph[1].add(new Edge(1, 3, 1));
    graph[3].add(new Edge(3, 1, 1));

    // 3
    graph[3].add(new Edge(3, 5, 1));
    graph[5].add(new Edge(5, 3, 1));

    // 5
    graph[5].add(new Edge(5, 6, 1));
    graph[6].add(new Edge(6, 5, 1));

    // 3 → 4
    graph[3].add(new Edge(3, 4, 1));
    graph[4].add(new Edge(4, 3, 1));

    return graph;
}


// cycle directed
public static ArrayList<Edge>[] createGraphDirected(int V) {

    ArrayList<Edge>[] graph = new ArrayList[V];

    for (int i = 0; i < V; i++) {
        graph[i] = new ArrayList<>();
    }

    // 1 → 0
    graph[1].add(new Edge(1, 0, 1));

    // 0 → 2
    graph[0].add(new Edge(0, 2, 1));

    // 2 → 3
    graph[2].add(new Edge(2, 3, 1));

    // 3 → 0
    graph[3].add(new Edge(3, 0, 1));

    return graph;
}


    public static boolean dfsCycle(int src, int par, ArrayList<Edge>[] graph, boolean[] vis){
        
        System.out.println(src+ " ");
        vis[src] = true;

        for(int i=0; i<graph[src].size(); i++){

            Edge e = graph[src].get(i);

            if(vis[e.dest] == true && e.dest == par){
                continue;
            }
            else if(vis[e.dest] == true && e.dest != par){
                return true;
            }else if(!vis[e.dest] && dfsCycle(e.dest, src, graph, vis)){
                return true;
            }
        }

        return false;
    } 
  
    public static boolean dfsCycleDirected(int src, ArrayList<Edge>[] graph, boolean[] vis, boolean[] stack){
        
        vis[src] = true;
        stack[src] = true;

        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            int neigh = e.dest;

            if(stack[neigh] == true){
                return true;
            }

            if(!vis[neigh]){
                if(dfsCycleDirected(neigh, graph, vis, stack)){
                    return true;
                }
            }
        }

        stack[src] = false;
        return false;

    }

    public static void main(String[] args) {
        
        // int V = 7;
        
        // ArrayList<Edge>[] graph = createGraph(V); 
        // boolean[] vis = new boolean[V];
        // boolean ans = false;

        // for(int i=0; i<vis.length; i++){
        //     if(!vis[i]){
        //         if(dfsCycle(i, -1, graph, vis)){
        //             ans = true;
        //             break;
        //         }
        //     }
        // }


        int V = 7;
        ArrayList<Edge>[] graph = createGraphDirected(V); 
        boolean[] vis = new boolean[V];
        boolean[] stack = new boolean[V];
        boolean ans = false;

        for(int i=0; i<vis.length; i++){
            if(!vis[i]){
                if(dfsCycleDirected(i, graph, vis, stack)){
                    ans = true;
                    break;
                }
            }
        }

        System.out.println(ans);

    }
}
