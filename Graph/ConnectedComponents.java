package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ConnectedComponents {

    static class Edge {
        
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = 1;
        }
    }


    public static ArrayList<Edge>[] createGraph(int V){

        ArrayList<Edge>[] graph = new ArrayList[V];

        for(int i = 0; i < V; i++){
            graph[i] = new ArrayList<>();
        }

        // -------- Component 1 --------
        // 0 ↔ 1
        graph[0].add(new Edge(0, 1, 1));
        graph[1].add(new Edge(1, 0, 1));

        // 1 ↔ 2
        graph[1].add(new Edge(1, 2, 1));
        graph[2].add(new Edge(2, 1, 1));


        // -------- Component 2 --------
        // 3 ↔ 4
        graph[3].add(new Edge(3, 4, 1));
        graph[4].add(new Edge(4, 3, 1));


        // -------- Component 3 --------
        // 5 ↔ 6
        graph[5].add(new Edge(5, 6, 1));
        graph[6].add(new Edge(6, 5, 1));

        return graph;
    }

    public static void bfs(int src, ArrayList<Edge>[] graph, boolean[] vis){
        
        Queue<Integer> q = new LinkedList<>();
        q.offer(src);

        while(!q.isEmpty()){

            int curr = q.poll();

            if(!vis[curr]){
                vis[curr] = true;

                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.offer(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        
        int V = 7;
        ArrayList<Edge>[] graph = createGraph(V);
        boolean[] vis = new boolean[V];

        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                bfs(i, graph, vis);
            }
        }

        for(boolean flag: vis){
            System.out.println(flag+" ");
        }

    }


}
