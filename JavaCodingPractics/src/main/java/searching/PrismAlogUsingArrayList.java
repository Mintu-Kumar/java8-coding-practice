package searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Pairr implements Comparable<Pairr>{
   int wt;
   int v;

   Pairr(int v, int wt){
       this.v = v;
       this.wt =wt;
   }
    @Override
    public int compareTo(Pairr o) {
        return this.wt-o.wt;
    }

}
public class PrismAlogUsingArrayList {

    public static int spanningTree(ArrayList<ArrayList<ArrayList<Integer>>> adj){
        boolean[] vis =  new boolean[adj.size()];
        PriorityQueue<Pairr> q = new PriorityQueue<>();
        q.add(new Pairr(0,0));
        int ans=0;

        while (q.size()!=0){
            Pairr cur = q.poll();
            int u =  cur.v;

            if(vis[u])
                continue;

            ans += cur.wt;
            vis[u] = true;
            ArrayList<ArrayList<Integer>> x = adj.get(u);
            for(ArrayList<Integer> y : x  ){
                 int vertex = y.get(0);
                 int weight = y.get(1);
                 if(!vis[vertex]){
                     q.add(new Pairr(vertex,weight));
                 }
            }
        }
     return ans;
    }
    public static void main(String[] args){
        ArrayList<ArrayList<ArrayList<Integer>>> adj =  new ArrayList<>();
        int numOfVertices =5;

        for(int i=0;i<numOfVertices;i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(new ArrayList<>(Arrays.asList(1,2)));
        adj.get(1).add(new ArrayList<>(Arrays.asList(0,2)));

        adj.get(0).add(new ArrayList<>(Arrays.asList(3,6)));
        adj.get(3).add(new ArrayList<>(Arrays.asList(0,6)));

        adj.get(1).add(new ArrayList<>(Arrays.asList(2,3)));
        adj.get(2).add(new ArrayList<>(Arrays.asList(1,3)));

        adj.get(1).add(new ArrayList<>(Arrays.asList(3,8)));
        adj.get(3).add(new ArrayList<>(Arrays.asList(1,8)));

        adj.get(1).add(new ArrayList<>(Arrays.asList(4,5)));
        adj.get(4).add(new ArrayList<>(Arrays.asList(1,5)));

        adj.get(2).add(new ArrayList<>(Arrays.asList(4,7)));
        adj.get(4).add(new ArrayList<>(Arrays.asList(2,7)));

        adj.get(3).add(new ArrayList<>(Arrays.asList(4,9)));
        adj.get(4).add(new ArrayList<>(Arrays.asList(3,9)));

        System.out.println(adj.size());
        System.out.println(spanningTree(adj));

    }
}
