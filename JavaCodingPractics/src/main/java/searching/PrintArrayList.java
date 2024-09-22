/*
package searching;

import java.util.ArrayList;
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
public class PrintArrayList {

    public static void addEdges(ArrayList<ArrayList<ArrayList<Integer>>> grapgh, int u, int v,int wt){
        grapgh.get(u).add(new ArrayList<>(java.util.Arrays.asList(v,wt)));
        grapgh.get(v).add(new ArrayList<>(java.util.Arrays.asList(u,wt)));
    }

    public static int minimumSpannigTree(int v,ArrayList<ArrayList<ArrayList<Integer>>> adj){
        boolean[] vis =  new boolean[v];
        PriorityQueue<Pair> pq =  new PriorityQueue<>();
        pq.add(new Pair(0,0));
        int ans =0;

        while(!pq.isEmpty()){
            Pair p = pq.poll();
            int cur = p.v;

            if(vis[cur])
                continue;

            vis[cur] = true;
            ans+=p.wt;
            ArrayList<ArrayList<Integer>> neighbor = adj.get(cur);
            for(ArrayList<Integer> list: neighbor){
                int vertex = list.get(0);
                int weight =  list.get(1);
                if(!vis[vertex])
                    pq.add(new Pair(vertex,weight));
            }
        }

        return ans;
    }
    public static void main(String[] args)
    {
        int numberOfVertex = 5;
        ArrayList<ArrayList<ArrayList<Integer>>> graph =  new ArrayList<>();

        for (int i=0; i<numberOfVertex;i++){
            graph.add(new ArrayList<>());
        }
        addEdges(graph,0,3,1);
        addEdges(graph,0,2,2);
        addEdges(graph,0,1,5);
        addEdges(graph,2,1,2);
        addEdges(graph,3,1,7);
        addEdges(graph,1,4,3);

        int result =  minimumSpannigTree(numberOfVertex,graph);
        System.out.println("minimum distance ="+result);




    }
}
*/
