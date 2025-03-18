import java.util.ArrayList;

public class test {
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

    public static boolean bpt(ArrayList<Edge>[] graph){

        



        return false;
    }


    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        
        createGraph(graph);
        System.out.println(bpt(graph));
    }
}
