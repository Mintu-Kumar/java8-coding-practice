
package searching;

import java.util.ArrayList;
import java.util.PriorityQueue;


public class PrimsAlgo {

    static int spanningTree(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj){
        boolean[] vis  =  new boolean[v];
        PriorityQueue<Pair> q = new PriorityQueue<>();
        q.add(new Pair(0,0));
        int ans = 0;
        while (!q.isEmpty()){
            Pair cur = q.poll();
            int u = cur.v;
            if(vis[u]) {
                continue;
            }
            ans+=cur.wt;

            ArrayList<ArrayList<Integer>> neighbors = adj.get(u);
            for(ArrayList<Integer> list: neighbors)
            {
                int vertex = list.get(0);
                int weight = list.get(1);
                if(vis[vertex] == false){
                    q.add(new Pair(vertex,weight));
                }
            }

        }
        return  ans;
    }
    private static void addEdge(ArrayList<ArrayList<ArrayList<Integer>>> graph, int u, int v, int weight) {
        graph.get(u).add(new ArrayList<>(java.util.Arrays.asList(v, weight)));
        graph.get(v).add(new ArrayList<>(java.util.Arrays.asList(u, weight)));
    }
    public static void main(String[] args){
        int numVertices = 5;

        // Initialize the graph as a 3D ArrayList
        ArrayList<ArrayList<ArrayList<Integer>>> graph = new ArrayList<>();
        for (int i = 0; i < numVertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges to the graph (u, v, weight)
        addEdge(graph, 0, 1, 2);
        addEdge(graph, 0, 3, 6);
        addEdge(graph, 1, 2, 3);
        addEdge(graph, 1, 3, 8);
        addEdge(graph, 1, 4, 5);
        addEdge(graph, 2, 4, 7);
        addEdge(graph, 3, 4, 9);

        // Run Prim's Algorithm
        int mstWeight = spanningTree(numVertices, graph);
        System.out.println("Total weight of MST: " + mstWeight);
    }
}

