package searching;

import java.util.ArrayList;
import java.util.Collections;

public class KruskalAlgoToFindMinimumSpanningTree {

    /**
     * condition to find MST using this algo =  connected weighted undirected graph
     * using union find concept
     */

    static int p[] ,rank[];

    static void union(int x, int y){
        int rx = find(x);
        int ry = find(y);
        if(rx == ry)
            return;

        p[ry] = rx;

    }
    static int find(int a){
        if(p[a] == a)
            return a;

        return find(p[a]);
    }
     static  class Edge  implements Comparable<Edge>{
       int src, dest,wt;
       Edge(int src, int dest,int wt){
           this.src = src;
           this.dest = dest;
           this.wt = wt;
       }
        @Override
        public int compareTo(Edge o) {
            return this.wt-o.wt;
        }
    }

    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj){
        boolean added[][] =  new boolean[V][V];
        ArrayList<Edge> edges =  new ArrayList<>();

        for(int i=0;i<adj.size();i++){
            for(int j=0;j<adj.get(i).size();j++){
                ArrayList<Integer> cur = adj.get(i).get(j);
                if(!added[i][cur.get(0)]){
                    added[i][cur.get(0)] = true;
                    added[cur.get(0)][i] = true;
                    edges.add(new Edge(i, cur.get(0), cur.get(1) ));
                }
            }
        }

        p = new int[V];
        for(int i=0;i<V;i++)
            p[i] = i;

        Collections.sort(edges);
        int count = 1;
        int ans = 0;

        for(int i=0; count<V;i++){
            Edge edge =  edges.get(i);
            int rx = find(edge.src);
            int ry = find(edge.dest);
            if(rx!=ry) {
                union(rx, ry);
                count++;
                ans+=edge.wt;
            }
        }
        return ans;

    }

    public static void  addEdges(int a, int b, int wt, ArrayList<ArrayList<ArrayList<Integer>>> graph){
         graph.get(a).add(new ArrayList<>(java.util.Arrays.asList(b,wt)));
         graph.get(b).add(new ArrayList<>(java.util.Arrays.asList(a,wt)));
    }


    public static void main(String[] args){
        int numberOfVertex = 5;
        ArrayList<ArrayList<ArrayList<Integer>>> graph =  new ArrayList<>();
       for (int i=0; i<numberOfVertex;i++){
           graph.add(new ArrayList<>());
       }

        addEdges(0,1,1,graph);
        addEdges(1,2,2,graph);
        addEdges(0,3,5,graph);
        addEdges(2,3,4,graph);
        addEdges(1,3,6,graph);
        addEdges(2,4,7,graph);
        addEdges(3,4,8,graph);

        int res = spanningTree(numberOfVertex,graph);
        System.out.println(res);




        //TODO
    }
}
