package searching;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class TopologicalSort {
    private static LinkedList<Integer> arr[];

    /**
     * Note -  Topological is applicable for directed acyclic graph
     * Topological sorting for Directed Acyclic Graph (DAG) is a linear
     * ordering of vertices such that for every directed edge u-v, vertex u comes before v in the ordering.
     */


    /**
     * this constructor is to initialize the graph in the form adjacency list
     * @param v
     */
    public TopologicalSort(int v){
        arr =  new LinkedList[v];
        for(int i=0;i<v;i++){
            arr[i] = new LinkedList<Integer>();
        }
    }

    /**
     * This method is to create the directed graph
     * @param source
     * @param destination
     */

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

    public static void topologicalDfs(int v,LinkedList<Integer>[] arr, boolean[] vis, Stack<Integer> stack){
        vis[v] = true;
        for(int neighbor: arr[v]){
            if(!vis[neighbor])
                topologicalDfs(neighbor,arr,vis,stack);
        }
        stack.push(v);
    }

    public static int[] topologicalSortByDfs(int V, LinkedList<Integer>[] arr){
        boolean[] vis =  new boolean[V];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<V;i++){
            if(!vis[i])
                topologicalDfs(i,arr,vis,stack);
        }

        int[] ans = new int[stack.size()];
        int i=0;
        while (!stack.isEmpty()){
            ans[i++] = stack.pop();

        }
        return ans;

    }

    public  static void main(String[] args){

        try(Scanner sc =  new Scanner(System.in)){
            System.out.println("Enter number of vertex and edge of graph respectively");
            int v = sc.nextInt();
            int e = sc.nextInt();
            TopologicalSort  graphTraverse = new TopologicalSort(v);
            System.out.println("Please "+e+ " edges of the graph ");
            for(int j=0;j<e;j++){
                int source = sc.nextInt();
                int destination = sc.nextInt();
                directedGraphAddEdges(source,destination);
            }

            /**
             * Topological sort using DFS
             */
            int[] result =  topologicalSortByDfs(v,arr);
            for(int res:result)
                System.out.print(res+" ");
        }
    }
}

