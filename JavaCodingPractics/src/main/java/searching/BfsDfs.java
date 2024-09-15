package searching;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BfsDfs {
    private static LinkedList<Integer>  arr[];

    /**
     * this constructor is to initialize the graph in the form adjacency list
     * @param v
     */
    public BfsDfs(int v){
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


    /**
     * this DFS method is to find the path available between given source and destination
     *
     * @param source
     * @param destination
     * @return
     */
    public static boolean dfs(int source, int destination){
        boolean[] vis =  new boolean[arr.length];
        Stack<Integer> s =  new Stack<>();

        vis[source] = true;
        s.push(source);

        while (!s.isEmpty()){
            int cur =  s.pop();

            if(cur == destination)
                return true;

            for(int neighbor: arr[cur]){

                if(!vis[neighbor])
                {
                    vis[neighbor] =  true;
                    s.push(neighbor);
                }
            }
        }
        return false;
    }
    /**
     * This method to find sortest path between given source and destination
     *
     * @param source
     * @param destination
     */
    public static void bfs(int source, int destination){
        boolean[] vis =  new boolean[arr.length];
        Queue<Integer> q =  new LinkedList();
        int[] par =  new int[arr.length];

        vis[source] = true;
        par[source] = -1;
        q.add(source);

        while (!q.isEmpty())
        {
            int cur = q.poll();
            for(int neighbor : arr[cur])
            {
                if(!vis[neighbor]){
                    q.add(neighbor);
                    vis[neighbor] = true;
                    par[neighbor] = cur;
                }
            }
        }

        int distance = 0;
        int cur =  destination;
        while (par[cur] !=-1){
            System.out.print(cur+ "->");
            cur = par[cur];
            distance++;
        }
        System.out.println("The distance between source and destination is "+ distance);

    }

    public  static void main(String[] args){

        try(Scanner sc =  new Scanner(System.in)){
            System.out.println("Enter number of vertex and edge of graph respectivily");
            int v = sc.nextInt();
            int e = sc.nextInt();
            BfsDfs  graphTraverse = new BfsDfs(v);
            System.out.println("Please "+e+ " edges of the graph ");
            for(int j=0;j<e;j++){
                int source = sc.nextInt();
                int destination = sc.nextInt();
                //addEdges(source,destination);
                directedGraphAddEdges(source,destination);
            }

            /**
             * Topological sort using DFS
             */
           int[] result =  topologicalSortByDfs(v,arr);
           for(int res:result)
               System.out.print(res+" ");


            /*if(isCycleDirectedGraph(v,arr))
                System.out.println("Cycle is present");
            else
                System.out.println("Cycle is not present");*/
            //bfs(2,5);

            /*if(dfs(2,9))
                System.out.println("Path is available between source and destination");
            else
                System.out.println("Path is not available between source and destination");*/
           // printGrapgh(arr);
        }
    }
}
