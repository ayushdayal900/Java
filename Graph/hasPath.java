
// for given src and dest , tell if path exist from src to dest
/*
        1-----3
        /        \
        0          5---6
        \        /
        2------4
        
        */

import java.util.ArrayList;

public class hasPath {

    public static class Edge {
        
        int s;
        int d;

        public Edge(int s, int d){
            this.s = s;
            this.d = d;
        }
        
    }

    public static void createGraph(ArrayList<Edge>[] graph){
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


    // has Path
    public static boolean pathExists(ArrayList<Edge>[] graph, int s, int d, boolean[] v){
                 
        System.out.println(s);
        v[s] = true;

        // if s == d
        if(s==d){return true;}

        for(int i=0; i<graph[s].size(); i++){

            Edge e = graph[s].get(i);
            // neighbour = e.d
            if(!v[e.d] && pathExists(graph, e.d, d, v)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);
        boolean ans = pathExists(graph, 0, 60, new boolean[V]);
        System.out.println(ans);

    }
}
