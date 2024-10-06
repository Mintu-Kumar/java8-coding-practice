package Tree;

import java.util.*;

public class TopAndBottomVIewOfBT extends CreateBinaryTree{


    static class Pair{
        int hd;
        Node root;
        Pair(int hd, Node root){
            this.hd = hd;
            this.root =  root;
        }
    }
    static ArrayList<Integer> topAndBottomView(Node root){
        Queue<Pair> q =  new ArrayDeque<>();
        Map<Integer, Integer> map =  new TreeMap<>();

        q.add(new Pair(0,root));
        while (!q.isEmpty()){
            Pair cur = q.poll();

            /**
             * for bottom view remove line number 27 if condition
             */
           if(!map.containsKey(cur.hd))
                map.put(cur.hd,cur.root.data);

            if(cur.root.left != null)
                q.add(new Pair(cur.hd-1,cur.root.left));

            if(cur.root.right != null)
                q.add(new Pair(cur.hd+1,cur.root.right));


        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
    public static void main(String[] args){
        sc = new Scanner(System.in);
        TopAndBottomVIewOfBT tbv =  new TopAndBottomVIewOfBT();

        Node root = tbv.createNode();
        ArrayList<Integer> list = topAndBottomView(root);
        System.out.println(list);


    }
}
