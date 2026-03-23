package Graph;

import java.util.ArrayList;

import Graph.Basics.Edge;

public class HasPath {

    static class Edge {
        
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
        
    }


    public static ArrayList<Edge>[] createGraph(int V){

        ArrayList<Edge>[] graph = new ArrayList[V];

        for(int i=0; i<V; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,1));
        
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,1));
        
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,2,1));

        return graph;
    }



    public static boolean getPath(ArrayList<Edge>[] graph, int src, int d, boolean[] vis){

        if(src == d){
            return true;
        }

        vis[src] = true;  
        for(int i=0; i<graph[src].size(); i++){
            int neighbour = graph[src].get(i).dest;
            if(!vis[neighbour] && getPath(graph, neighbour, d, vis)){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {

        int V = 5;
        ArrayList<Edge>[] graph = createGraph(V);
        boolean[] vis = new boolean[V];
        boolean ans = getPath(createGraph(V), 0, 4, vis);
        System.out.println(ans);


    }
}
