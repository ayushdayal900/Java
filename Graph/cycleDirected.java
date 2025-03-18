import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class cycleDirected {

    public static class Edge {
        int s;
        int d;
        int w;

        public Edge(int s, int d, int w){
            this.s = s;
            this.d = d;
            this.w = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){

        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2, -1));
        
        graph[1].add(new Edge(1, 0, -1));
        
        // graph[2].add(new Edge(2, 3, -1));
        
        graph[3].add(new Edge(3, 0, -1));        

    }

    public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis, boolean[] stack){
        vis[curr] = true;
        stack[curr] = true;
        
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(stack[e.d]){
                return true;
            }
            else if(!vis[e.d] && isCycleUtil(graph, e.d, vis, stack)){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }

    public static boolean isCycle(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                if(isCycleUtil(graph,i,vis,stack)){
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        /*
           
         */

         int V = 4;
         ArrayList<Edge> graph[] = new ArrayList[V];
         createGraph(graph);

         System.out.println(isCycle(graph));
    }
}








