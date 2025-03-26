package searching;

import java.util.*;

public class BFSUsingArrayList {

    public static void bfs(ArrayList<ArrayList<Integer>> adj,int source, int destination){
        boolean[] vis = new boolean[adj.size()];
        Queue<Integer> q =  new LinkedList<>();
        int[] par =  new int[adj.size()];
        q.add(source);
        vis[source] = true;
        par[source] = -1;

        while (!q.isEmpty()){
            int cur =  q.poll();

            for(int x:adj.get(cur)){
                if(!vis[x]){
                    vis[x] = true;
                    q.add(x);
                    par[x] = cur;
                }
            }
        }
        int res = 0;
        int cur = destination;
        while (par[cur] !=-1){
            System.out.println(cur +"->");
            cur = par[cur];
            res++;
        }

        System.out.println("Total distance is ->"+ res);

    }

    public static boolean dfs(ArrayList<ArrayList<Integer>> adj, int source, int destination){
        boolean[] vis =  new boolean[adj.size()];
        Stack<Integer> s =  new Stack<>();

        s.push(source);
        vis[source] = true;

        while (!s.empty());
        {
            int cur =  s.pop();

            if(cur == destination)
               return true;

            for(int x :adj.get(cur)){
                if(!vis[x]){
                    s.push(x);
                    vis[x]= true;
                }
            }
        }

      return false;
    }

   public static boolean isCycleUndirectedGraph(ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[adj.size()];
        for(int i=0;i<adj.size();i++){
            if(!vis[i]) {
                if (detectCycle(i,adj,vis,-1 )) {
                    return true;
                }
            }
        }
        return false;
   }
    public static boolean detectCycle(int v,ArrayList<ArrayList<Integer>> adj,boolean[] vis,int parent){
        vis[v] =  true;
        for(int x: adj.get(v)){
            if(!vis[x])
                if(detectCycle(x,adj,vis,v))
                    return true;
                else if( parent != x)
                    return true;
        }
        return false;
    }
    public static boolean isCycleDirectedGraph(ArrayList<ArrayList<Integer>> adj){
      boolean[] vis =  new boolean[adj.size()];
      boolean[] recS = new boolean[adj.size()];

      for(int i=0;i<adj.size();i++){
          if(!vis[i]){
              if(detectCycleInDirectedGraph(i,adj,vis,recS)){
                  return true;
              }
          }
      }
      return false;
    }
    public static boolean detectCycleInDirectedGraph(int v,ArrayList<ArrayList<Integer>> adj,boolean[] vis,boolean[] recS) {
        if (!vis[v]) {
            vis[v] = true;
            recS[v] = true;

            for (int x : adj.get(v)) {
                if (!vis[x]) {
                    if (detectCycleInDirectedGraph(x, adj, vis, recS))
                        return true;
                } else if (recS[x]) {
                    return true;
                }
            }

        }
        recS[v] = false;
        return false;
    }

    public static void topo( ArrayList<ArrayList<Integer>> adj){
        Stack<Integer> s =  new Stack<>();
        boolean[] vis =  new boolean[adj.size()];

        for(int i=0;i<adj.size();i++){
            if(!vis[i]){
                topoLigicalSort(i,adj,vis,s);
            }
        }
        int[] ans = new int[s.size()];
        int i=0;
        while (!s.isEmpty()){
            System.out.print(" "+s.pop());

        }

    }
   public static void topoLigicalSort(int v, ArrayList<ArrayList<Integer>> adj,boolean[] vis, Stack<Integer> s){
        vis[v] = true;
        for(int x:adj.get(v)){
            if(!vis[x])
                topoLigicalSort(x,adj,vis,s);
        }
        s.push(v);
   }

    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> adj =  new ArrayList<>();

        adj.add(new ArrayList<>(Arrays.asList(1)));
        adj.add(new ArrayList<>(Arrays.asList(1)));
        adj.add(new ArrayList<>(Arrays.asList(1,3,4)));
        adj.add(new ArrayList<>(Arrays.asList(4)));
       adj.add(new ArrayList<>(Arrays.asList(4)));
        //bfs(adj,0,4);
       /* if(dfs(adj,0,4))
            System.out.println("Path available");
        else
            System.out.println("path not available");*/

        if(isCycleDirectedGraph(adj))
            System.out.println("Cycle present");
        else
            System.out.println("Not present");

    }
}
