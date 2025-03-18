import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite {

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

    // public static Edge root = new Edge();

    public static void createGraph(ArrayList<Edge> graph[]){

        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, -1));
        graph[0].add(new Edge(0, 2, -1));
        
        graph[1].add(new Edge(1, 0, -1));
        graph[1].add(new Edge(1, 3, -1));
        
        graph[2].add(new Edge(2, 0, -1));
        graph[2].add(new Edge(2, 4, -1));
        
        graph[3].add(new Edge(3, 1, -1));
        // graph[3].add(new Edge(3, 4, -1));
        
        graph[4].add(new Edge(4, 2, -1));
        // graph[4].add(new Edge(4, 3, -1));
        

    }



    public static boolean isBipartite(ArrayList<Edge> graph[]){

        int colours[] = new int[graph.length];
        for(int i=0; i<colours.length; i++){
            colours[i] = -1;    // no colour
        }


        Queue<Integer> q = new LinkedList<>();
        q.add(0);

        // for all vertices 
        for(int i=0; i<graph.length; i++){
            if(colours[i] == -1){

                // bfs
                q.add(i);
                colours[i] = 0; // orange
                
                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j=0; j<graph[curr].size(); j++){
                        Edge e = graph[curr].get(j);    //edge

                        // case 1: no colour
                        if(colours[e.d] == -1){
                            colours[e.d] = colours[curr]==0?1:0;
                            q.add(e.d);
                        }
                        // case 2: same colour
                        else if(colours[e.d] == colours[curr]){
                            return false;
                        }
                        // cas2 3: diff colour
                        else{
                            // do nothing
                        }

                    }
                }
            }
        }



        return true;
    }

    public static void main(String[] args) {
        /*
            0-----------2
            |           |
            |           |
            1           4
              \       /
                \    /
                   3
         */

         int V = 5;
         ArrayList<Edge> graph[] = new ArrayList[V];
         createGraph(graph);

         boolean ans = isBipartite(graph);
         System.out.println(ans);
    }
}





