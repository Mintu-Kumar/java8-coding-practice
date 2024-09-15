package searching;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class FindCycleInUndirectedGraph {
    private static LinkedList<Integer> arr[];

    /**
     * this constructor is to initialize the graph in the form adjacency list
     * @param v
     */
    public FindCycleInUndirectedGraph(int v){
        arr =  new LinkedList[v];
        for(int i=0;i<v;i++){
            arr[i] = new LinkedList<Integer>();
        }
    }

    /**
     * This method is to create the undirected graph
     * @param source
     * @param destination
     */
    public static void addEdges(int source,int destination){
        arr[source].add(destination);
        arr[destination].add(source);
    }
    /**
     * this will print the graph
     * @param arr
     */
    public static void printGrapgh(LinkedList<Integer> arr[]){
        for(int i=0;i<arr.length-1;i++)
            System.out.println(arr[i]);
    }

    /**
     * Method will detect the cycle
     *
     * @param V
     * @param arr
     * @return
     */
    public static boolean isCycleUndirectedGraph(int V, LinkedList<Integer> arr[]){
        boolean[] vis =  new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                if(dfsInUndirectedGraph(i,arr,vis,-1))
                    return true;
            }
        }
        return false;
    }
    /**
     * This DFS methos is to detect the cycle in the undirected graph
     *
     * @param v
     * @param arr
     * @param vis
     * @param parent
     * @return
     */
    public static boolean dfsInUndirectedGraph(int v, LinkedList<Integer> arr[], boolean[] vis, int parent){
        vis[v]= true;

        for(int neighbor: arr[v]){
            if(!vis[neighbor]){
                if(dfsInUndirectedGraph(neighbor,arr,vis,v))
                    return true;
            }else if(parent != neighbor){
                return true;
            }
        }
        return false;
    }


    public  static void main(String[] args){

        try(Scanner sc =  new Scanner(System.in)){
            System.out.println("Enter number of vertex and edge of graph respectivily");
            int v = sc.nextInt();
            int e = sc.nextInt();
            FindCycleInUndirectedGraph  graphTraverse = new FindCycleInUndirectedGraph(v);
            System.out.println("Please "+e+ " edges of the graph ");
            for(int j=0;j<e;j++){
                int source = sc.nextInt();
                int destination = sc.nextInt();
                addEdges(source,destination);

            }


            if(isCycleUndirectedGraph(v,arr))
                System.out.println("Cycle is present");
            else
                System.out.println("Cycle is not present");
        }
    }
}
