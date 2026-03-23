package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TopologicalSort {

    public static class  Edge {
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

        // 5 → 2
        graph[5].add(new Edge(5, 2, 1));

        // 5 → 0
        graph[5].add(new Edge(5, 0, 1));

        // 4 → 0
        graph[4].add(new Edge(4, 0, 1));

        // 4 → 1
        graph[4].add(new Edge(4, 1, 1));

        // 2 → 3
        graph[2].add(new Edge(2, 3, 1));

        // 3 → 1
        graph[3].add(new Edge(3, 1, 1));

        return graph;
    }

    public static void topoSortDFS(ArrayList<Edge>[] graph, Stack<Integer> stack, boolean[] vis, int src){

        vis[src] = true;

        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            if(!vis[e.dest]){
                topoSortDFS(graph, stack, vis, e.dest);
            }   
        }
        stack.add(src);

    }

    public static void calInDegree(ArrayList<Edge>[] graph, int[] indeg){
        for(int i=0; i<graph.length; i++){
            int v = i;
            for(int j=0; j<graph[v].size(); j++){
                Edge e = graph[v].get(j);
                indeg[e.dest]++;
            }
        }
    }

    public static void topoSortBFS(ArrayList<Edge>[] graph){

        int[] indeg = new int[graph.length];
        calInDegree(graph, indeg);

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<indeg.length; i++){
            if(indeg[i]==0){
                q.offer(i);
            }
        }

        // bfs
        while(!q.isEmpty()){

            int curr = q.remove();
            System.out.print(curr+" ");

            for(int i=0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;

                if(indeg[e.dest] == 0){
                    q.offer(e.dest);
                }
            }
        }

        System.out.println();


    }


    public static void main(String[] args) {

        int V = 6;
        ArrayList<Edge>[] graph = createGraph(V);
        Stack<Integer> stack = new Stack<>();
        boolean[] vis = new boolean[V];
        
        // for(int i=0; i<graph.length; i++){
        //     if(!vis[i]){
        //         topoSortBFS(graph);
        //     }
        // }
        
                topoSortBFS(graph);
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }

    }
    
}
