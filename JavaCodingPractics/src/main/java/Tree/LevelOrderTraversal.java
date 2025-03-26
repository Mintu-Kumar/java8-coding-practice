package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelOrderTraversal extends CreateBinaryTree{

    static void printLevelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
       // q.add(null);
        while (!q.isEmpty()){
          Node cur = q.poll();
            /**
             * line 18 to 24 is for print data in level we can remove this code and line 12 code also.
             */
         /*   if(cur == null){
                if(q.isEmpty())
                    return;

                q.add(null);
                System.out.println();
            }*/
            System.out.print(cur.data+" ");

            if(cur.left !=null)
                q.add(cur.left);
            if (cur.right!= null)
                q.add(cur.right);
        }
    }
    public static void main(String[] args){
        sc =  new Scanner(System.in);
        LevelOrderTraversal lot = new LevelOrderTraversal();
        Node root = lot.createNode();
        printLevelOrder(root);
    }
}
