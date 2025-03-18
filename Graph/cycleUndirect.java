import java.util.ArrayList;

public class cycleUndirect {

    public static class Edge {    
        int s;
        int d;
        public Edge(int s, int d){
            this.s= s;
            this.d = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));

    }

    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean visited[] = new boolean[graph.length];
        for(int i=0; i<visited.length; i++){
            if(!visited[i]){
                // if cycle exists in one of the part
                if(detectCycleUtil(graph, visited, i, -1)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean[] vis, int curr, int p){
        // vis[curr] = true;
        // for(int i=0; i<graph[curr].size(); i++){
        //     int neigh = graph[curr].get(i).d;
        //     if(vis[neigh]){
        //         if(neigh != p){
        //             return true;
        //         }else{
        //             continue;
        //         }
        //     }else{
        //         detectCycleUtil(graph, vis, neigh, curr);
        //     }
        // }
        // return false;



        vis[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            int neigh = graph[curr].get(i).d;
            // case 3 : neigh not visited
            if(!vis[neigh] ){
                if(detectCycleUtil(graph, vis, neigh, curr)){
                    return true;
                }
            }

            // case 1 : neigh is visited and curr is not parent
            else if(vis[curr] && neigh != p){
                return true;
            }

            // case 2  -> continue
        }

        return false;

    }



    public static void main(String[] args) {
        
        /*
              0------------3
             /|            | 
            / |            |
           1  |            |
            \ |            4
             \|
              2
         */

         int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
         createGraph(graph);
         System.out.println(detectCycle(graph));
        
    }
}
