package Graphs;

import java.util.ArrayList;

public class findCycleInDirectedGraph {
    static class Edge{
        int src;
         int desc;

         public Edge(int src, int desc){
             this.src = src;
             this.desc = desc;
         }
    }

    public static void createGraph(ArrayList<Edge> graph[]){

        for (int i =0; i< graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[1].add(new Edge(1,0));
        graph[0].add(new Edge(0,2));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,0));

    }

    public static boolean findCycle(ArrayList<Edge> graph[], int curr, boolean vis[], boolean recStack[]){

        vis[curr] = true;
        recStack[curr] = true;

        for (int i=0; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if (recStack[e.desc]){
                return true;
            } else if (!vis[e.desc]) {
                if (findCycle(graph, e.desc, vis, recStack)){
                    return true;
                }
            }
        }
        recStack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        boolean vis[] = new boolean[v];
        boolean recStack[] = new boolean[v];
        for (int i=0; i<v;i++){
            if (!vis[i]){
                boolean isCycle = findCycle(graph,0,vis,recStack);
                if (isCycle){
                    System.out.println(isCycle);
                    break;
                }
            }
        }
    }
}
