package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BiPartiteGraph {

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

    public static ArrayList<Edge>[] createGraph(int V){

        ArrayList<Edge>[] graph = new ArrayList[V];

        for(int i = 0; i < V; i++){
            graph[i] = new ArrayList<>();
        }

        // 0 ↔ 1
        graph[0].add(new Edge(0, 1, 1));
        graph[1].add(new Edge(1, 0, 1));

        // 0 ↔ 2
        graph[0].add(new Edge(0, 2, 1));
        graph[2].add(new Edge(2, 0, 1));

        // 1 ↔ 3
        graph[1].add(new Edge(1, 3, 1));
        graph[3].add(new Edge(3, 1, 1));

        // 2 ↔ 4
        graph[2].add(new Edge(2, 4, 1));
        graph[4].add(new Edge(4, 2, 1));

        // 3 ↔ 4  (circled edge)
        graph[3].add(new Edge(3, 4, 1));
        graph[4].add(new Edge(4, 3, 1));

        return graph;
    }

    // O(V+E)
    public static boolean BiPartiteGraph(ArrayList<Edge>[] graph){

        Queue<Integer> q = new LinkedList();
        int[] colorArray = new int[graph.length];

        for(int i=0; i<colorArray.length; i++){
            colorArray[i] = -1;
        }

        for(int i=0; i<graph.length; i++){
            if(colorArray[i] == -1){    // BFS
                q.add(i);
                colorArray[i] = 0;  // yellow
                while(!q.isEmpty()){
                    int curr = q.poll();
                    for(int j=0; j<graph[curr].size(); j++){
                        Edge e = graph[curr].get(j);

                        // if neighbour has no color
                        if(colorArray[e.dest] == -1){
                            int neighColor = colorArray[curr] == 0? 1: 0;
                            colorArray[e.dest] = neighColor;
                            q.add(e.dest);
                        }
                        // not bipartite
                        else if(colorArray[e.dest] == colorArray[curr]){
                            return false;
                        }
                    }
                }
            }   
        }

        return true;
        

    }

    public static void main(String[] args) {
        
        int V = 5;
        ArrayList<Edge>[] graph = createGraph(V);

        boolean ans = BiPartiteGraph(graph);
        System.out.println(ans);
        
        

    }
}
