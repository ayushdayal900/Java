package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Basics {

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

    // TC: Adj Matrix: O(V^2)                     Adj List: O(V+E)
    public static void graphBFS(ArrayList<Edge>[] graph, int src){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
        q.offer(src);

        while(!q.isEmpty()){
            int curr = q.poll();

            if(!vis[curr]){
                System.out.println(curr+" ");
                vis[curr] = true;

                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.offer(e.dest);
                }
            }
        }

        
    }

    public static void graphDFS(ArrayList<Edge>[] graph, int curr, boolean[] vis){

        // visite the curr node
        System.out.println(curr+ " ");
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                graphDFS(graph, e.dest, vis);
            }
        }

    }

    public static void main(String[] args) {
        
        // 0,1,5
        // 1,0,5,    1,2,1,   1,3,3
        // 2,1,1     2,3,1,   2,4,2
        // 3,1,3,    3,2,1

        int V = 5;
        ArrayList<Edge>[] graph = createGraph(V);

        for(int i=0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.println(e.src + "-->" + e.dest + " " + e.wt);
        }

        // BFS over graphs from node 0
        System.out.println();
        System.out.println();
        graphBFS(graph, 0);

        System.out.println();
        System.out.println();
        boolean[] vis = new boolean[V];
        graphDFS(graph, 0, vis);
        


    }



}
