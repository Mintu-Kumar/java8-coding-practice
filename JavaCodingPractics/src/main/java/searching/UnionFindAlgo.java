package searching;

public class UnionFindAlgo {

    private static int[] P,rank;
     UnionFindAlgo(int V){
         P = new int[V];
         rank = new int[V];
         for(int i=0;i<V;i++){
             P[i] = i;
         }
     }
    public static int find(int x){
        if(P[x] ==x)
            return x;

        return find(P[x]);
    }

    public static void union(int a, int b){
        int x =  find(a);
        int y =  find(b);
        if(x==y)
            return;

        if(rank[x]<rank[y])
            P[x] = y;

        else if (rank[y] < rank[x])
            P[y] = x;

        else{
            P[y] = x;
            rank[x] = rank[x]+1;
        }
    }

    public static void main(String[] args){
        //TODO
    }
}
