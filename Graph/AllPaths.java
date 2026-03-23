package Graph;

import java.util.ArrayList;

public class AllPaths {

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

        // 5 → 0
        graph[5].add(new Edge(5, 0, 1));

        // 5 → 2
        graph[5].add(new Edge(5, 2, 1));

        // 4 → 0
        graph[4].add(new Edge(4, 0, 1));

        // 4 → 1
        graph[4].add(new Edge(4, 1, 1));

        // 0 → 3
        graph[0].add(new Edge(0, 3, 1));

        // 2 → 3
        graph[2].add(new Edge(2, 3, 1));

        // 3 → 1
        graph[3].add(new Edge(3, 1, 1));

        return graph;
    }

    public static void dfs(ArrayList<Edge>[] graph, int src, int dest, ArrayList<Integer> path){

        if(src == dest){
            for(int i: path){
                System.out.print(i+" ");
            }
            System.out.println();
            return ;
        }

        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            path.add(e.dest);
            dfs(graph, e.dest, dest, path);
            path.remove(path.size()-1);
        }


    }


    public static void main(String[] args) {

        int V = 6;
        ArrayList<Edge>[] graph = createGraph(V);
        ArrayList<Integer> path = new ArrayList<>();
        path.add(5);

        dfs(graph, 5, 1, path);

    

 

    }    
}
