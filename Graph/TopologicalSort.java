import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {

    public static class Edge{
        int s;
        int d;
        int w;

        public Edge(int s, int d, int w){
            this.s = s;
            this.d = d;
            this.w = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        int V = graph.length;

        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[5].add(new Edge(5, 0, -1));
        graph[5].add(new Edge(5, 2, -1));

        graph[4].add(new Edge(4, 0, -1));
        graph[4].add(new Edge(4, 1, -1));
                
        graph[2].add(new Edge(2, 3, -1));
        
        graph[3].add(new Edge(3, 1, -1));        
    }

    
    public static void topoSortUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], Stack<Integer> s){
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.d]){
                topoSortUtil(graph, e.d, vis, s);
            }
        }

        s.push(curr);

    } 

    public static void topoSort(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                topoSortUtil(graph, i, vis, s); //mofified dfs
            }
        }

        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }


    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        topoSort(graph);
        
    }
}
