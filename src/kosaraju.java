import Graphs.kosaRajuAlgorithm;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;

public class kosaraju {
    static class Edge{
        int src;
        int desc;

        public Edge(int src, int desc) {
            this.src = src;
            this.desc = desc;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,4));

    }

    public static void topSort(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s){
        vis[curr] = true;
        for (int i=0; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if (!vis[e.desc]){
                topSort(graph,e.desc, vis,s);
            }
        }
        s.push(curr);
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]){
        vis[curr] = true;
        System.out.print(curr+" ");
        for (int i =0; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if (!vis[e.desc]){
                dfs(graph,e.desc,vis);
            }
        }
    }

    public static void kosarajuu(ArrayList<Edge> graph[], int V){
        //step1
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[V];
        for (int i=0; i<V; i++){
            if (!vis[i]){
                topSort(graph,i,vis,s);
            }
        }

        //step 2
        ArrayList<Edge> temp[] = new ArrayList[V];
        for (int i=0; i< temp.length;i++){
            vis[i] = false;
            temp[i] = new ArrayList<>();
        }

        for (int i=0;i<V;i++){
            for (int j=0; j<graph[i].size();j++){
                Edge e = graph[i].get(j);
                temp[e.desc].add(new Edge(e.desc,e.src));
            }
        }

        //step 3
        while(!s.isEmpty()){
            int curr = s.pop();
            if (!vis[curr]){
                dfs(temp,curr,vis);
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        int V =5;

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        kosarajuu(graph,V);
    }
}
