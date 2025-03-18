import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_DFS_Breaked {
    public static class Edge {
        int s;
        int d;
        // int w;  //optional w = 1

        public Edge(int s, int d){
            this.s = s;
            this.d = d;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph){
        
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        
        // neighbours of 0
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        
        // 1
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));
        
        // 2
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));
        
        // 3
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,5));
        
        // 4
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,5));
        
        // 5
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));
        
        // 6
        graph[6].add(new Edge(6,5));
    }

    public static void bfs(ArrayList<Edge>[] graph, int src){
        boolean[] visited = new boolean[graph.length];
        for(int i=0; i<visited.length; i++){
            if(!visited[i]){
                bfsUtil(graph, visited);
            }
        }

    }
    public static void bfsUtil(ArrayList<Edge>[] graph, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(0);

        while(!q.isEmpty()){
            // remove q.front()
            int curr = q.poll();

            // if not visited
            if(visited[curr] == false){

                // print
                System.out.print(curr+ " ");

                // visited = true
                visited[curr] = true;

                // add neighbours of q.front()
                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.d);
                }
            }
        }

    }

    public static void dfs(ArrayList<Edge>[] graph){
        boolean visited[] = new boolean[graph.length];
        for(int i=0; i<visited.length; i++){
            dfsUtil(graph, i, visited);
        }
    }

    public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean visited[]){
        
        // tc : O(V + E)
        // visite

        System.out.print(curr + " ");
        visited[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.d]){
                dfs(graph, e.d, visited);
            }
        }
    }



    public static void main(String[] args) {
        /*
          1-----3
        /         \
        0          5---6
        \         /
          2------4
        
        */
        
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);
        bfs(graph, 0);
        // dfs(graph,0,new boolean[V]);
        
    }
}
