import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TopologicalSortBFS {

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

    
    


    public static void calIndg(ArrayList<Edge>[] graph, int indeg[]){
        for(int i=0; i<graph.length; i++){
            int vertex = i; //cal all edges for vertex i
            for(int j=0; j<graph[vertex].size(); j++){
                Edge e = graph[vertex].get(j);
                indeg[e.d]++;
            }
        }
    }
    public static void topoSortBFS(ArrayList<Edge>[] graph){

        
        
        int indeg[] = new int[graph.length];

        calIndg(graph, indeg);
        
        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<indeg.length; i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }

        // bfs
        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr + " ");

            for(int i=0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                indeg[e.d]--;
                if(indeg[e.d]==0){
                    q.add(e.d);
                }
            }
        }

        System.out.println();


    }
    


    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        topoSortBFS(graph);
        
    }
}
