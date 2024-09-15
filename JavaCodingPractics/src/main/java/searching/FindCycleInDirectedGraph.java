package searching;

import java.util.LinkedList;
import java.util.Scanner;

public class FindCycleInDirectedGraph {
    private static LinkedList<Integer> arr[];

    /**
     * this constructor is to initialize the graph in the form adjacency list
     * @param v
     */
    public FindCycleInDirectedGraph(int v){
        arr =  new LinkedList[v];
        for(int i=0;i<v;i++){
            arr[i] = new LinkedList<Integer>();
        }
    }

    public static void directedGraphAddEdges(int source, int destination){
        arr[source].add(destination);
    }

    /**
     * this will print the graph
     * @param arr
     */
    public static void printGrapgh(LinkedList<Integer> arr[]){
        for(int i=0;i<arr.length-1;i++)
            System.out.println(arr[i]);
    }

    public static boolean isCycleDirectedGraph(int V, LinkedList<Integer> arr[]){
        boolean[] vis = new boolean[V];
        boolean[] recS =  new boolean[V];

        for(int i=0;i<V;i++){
            if(!vis[i]){
                if(dfsInDirectedGraph(i,arr,vis,recS))
                    return true;
            }
        }
        return false;
    }

    public static boolean dfsInDirectedGraph(int v, LinkedList<Integer>[] arr, boolean[] vis, boolean[] recS){
        if(!vis[v]) {
            vis[v] = true;
            recS[v] = true;

            for (int neighbor : arr[v]) {
                if (!vis[neighbor]) {
                    if (dfsInDirectedGraph(neighbor, arr, vis, recS)) {
                        return true;
                    } else if (recS[neighbor]) {
                        return true;
                    }
                }
            }
        }
        recS[v] = false;
        return false;
    }

    public  static void main(String[] args){

        try(Scanner sc =  new Scanner(System.in)){
            System.out.println("Enter number of vertex and edge of graph respectivily");
            int v = sc.nextInt();
            int e = sc.nextInt();
            FindCycleInDirectedGraph  graphTraverse = new FindCycleInDirectedGraph(v);
            System.out.println("Please "+e+ " edges of the graph ");
            for(int j=0;j<e;j++){
                int source = sc.nextInt();
                int destination = sc.nextInt();
                directedGraphAddEdges(source,destination);
            }

            if(isCycleDirectedGraph(v,arr))
                System.out.println("Cycle is present");
            else
                System.out.println("Cycle is not present");

        }
    }
}


