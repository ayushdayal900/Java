import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AllPathsFromSourceToDest {

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
        
        graph[3].add(new Edge(3, 1, -1));        
        graph[2].add(new Edge(2, 3, -1));
        
        graph[0].add(new Edge(0, 3, -1));
    }

    
    // exponential 
    public static void printAllPaths(ArrayList<Edge>[] graph, int s, int d, String path){
        if(s == d){
            System.out.println(path + d);
            return;
        }

        for(int i=0; i<graph[s].size(); i++){
            Edge e = graph[s].get(i);
            printAllPaths(graph, e.d, d, path+s);
        }
    }

    
    


    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        int s = 5;
        int t = 1;        

        printAllPaths(graph, s, t, "");
    }
}
