import Graphs.findBridge;

import java.util.ArrayList;

public class bridge {
    static class Edge{
        int src;
        int desc;

        public Edge(int src, int desc) {
            this.src = src;
            this.desc = desc;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i=0; i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
    }
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[], int dt[], int low[], int time, int par){
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;

        for (int i=0; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if (e.desc == par){
                continue;
            }else if (!vis[e.desc]){
                dfs(graph,e.desc,vis,dt,low,time,curr);
                low[curr] = Math.min(low[curr],low[e.desc]);
                if (dt[curr] < low[e.desc]){
                    System.out.print("bridge: "+curr+" ----------- "+e.desc);
                }
            }else {
                low[curr] = Math.min(low[curr],dt[e.desc]);
            }
        }
    }

    public static void findBridge(ArrayList<Edge> graph[], int V){
        int dt[] = new int[V];
        int low[] = new int[V];
        int time = 0;
        boolean vis[] = new boolean[V];

        for (int i=0; i<V;i++){
            if (!vis[i]){
                dfs(graph,i,vis,dt,low,time,-1);
            }
        }
    }

    public static void main(String[] args) {
        int V = 6;

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        findBridge(graph,V);
    }
}
