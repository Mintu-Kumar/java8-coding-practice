package Tree.BinaryTreeOperation;

import java.util.*;

public class
VerticalOrderTraversalInBST extends CreateBinaryTree{

   static class Pair{
        int hd;
        Node root;
        Pair(int hd, Node root){
            this.hd =  hd;
            this.root = root;
        }
    }
    static void verticalTraverse(Node root){
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer,ArrayList<Integer>>  map =  new TreeMap<>();

        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            Pair cur = q.poll();

            if(map.containsKey(cur.hd))
                map.get(cur.hd).add(cur.root.data);
            else {
                ArrayList<Integer>  list =  new ArrayList<>();
                list.add(cur.root.data);
                map.put(cur.hd, list);
            }

            if(cur.root.left!= null)
                q.add(new Pair(cur.hd-1,cur.root.left));
            if(cur.root.right!=null)
                q.add(new Pair(cur.hd+1,cur.root.right));
        }
        ArrayList<Integer> arrayList =  new ArrayList<>();
        for(Map.Entry<Integer,ArrayList<Integer>> entry : map.entrySet()){
            arrayList.addAll(entry.getValue());
        }
        System.out.println(arrayList);
    }
    public static void main(String[] args){
        sc =  new Scanner(System.in);
        VerticalOrderTraversalInBST verticalOrderTraversalInBST =  new VerticalOrderTraversalInBST();
        Node root =  verticalOrderTraversalInBST.createNode();
        verticalTraverse(root);
    }
}
