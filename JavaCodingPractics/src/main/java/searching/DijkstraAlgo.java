package searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair>{
    int v;
    int wt;
    Pair(int v,int wt){
        this.v = v;
        this.wt = wt;
    }


    @Override
    public int compareTo(Pair o) {
        return Integer.compare(this.wt,o.wt);
    }
}
public class DijkstraAlgo {

    public static void addEdges(ArrayList<ArrayList<ArrayList<Integer>>> graph, int v, int u, int wt){
        graph.get(u).add(new ArrayList<>(java.util.Arrays.asList(v,wt)));
        graph.get(v).add(new ArrayList<>(java.util.Arrays.asList(u,wt)));
    }

    public static int[] dijikstraAlgo(int S, int v, ArrayList<ArrayList<ArrayList<Integer>>> adj){
        boolean[] vis =  new boolean[v];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(S,0));
        int[] ans =  new int[v];
        Arrays.fill(ans,10000000);
        ans[S] = 0;

        while (!pq.isEmpty()){
            Pair p = pq.poll();
            int cur = p.v;


            if(vis[cur])
                continue;

            vis[cur] =  true;
            ArrayList<ArrayList<Integer>>  neighbors = adj.get(cur);

            for(ArrayList<Integer> list:neighbors){
                int vertex = list.get(0);
                int wt = list.get(1);
                if(ans[vertex]> ans[cur]+wt){
                    ans[vertex] = ans[cur]+wt;
                    pq.add(new Pair(vertex,ans[vertex]));
                }
            }
        }

        return ans;
    }
    public static void  main(String[] args){
       int numberOfVertix = 6;
        ArrayList<ArrayList<ArrayList<Integer>>> graph = new ArrayList<>();

        for(int i=0;i<numberOfVertix;i++){
            graph.add(new ArrayList<>());
        }

        addEdges(graph,0,3,2);
        addEdges(graph,0,2,4);
        addEdges(graph,3,2,3);
        addEdges(graph,3,5,1);
        addEdges(graph,2,5,1);
        addEdges(graph,2,1,9);
        addEdges(graph,5,4,2);
        addEdges(graph,4,1,1);

        int[] res =  dijikstraAlgo(0,6,graph);
        for(int i=0;i<res.length;i++)
            System.out.print(res[i]+" ");
    }
}
