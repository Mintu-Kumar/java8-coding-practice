package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrintLeftViewRightViewOfBinaryTree extends CreateBinaryTree{

    static void printLeftView(Node root){
        Queue<Node> q =  new LinkedList<>();
        q.add(root);
         while (!q.isEmpty()){
             int n = q.size();
             for(int i=1;i<=n;i++) {
                 Node cur = q.poll();
                 if(i==1)
                     System.out.print(cur.data + " ");

                 if (cur.left != null)
                     q.add(cur.left);

                 if (cur.right != null)
                     q.add(cur.right);
             }
         }
    }
    public static void main(String[] args){
        sc =  new Scanner(System.in);
        PrintLeftViewRightViewOfBinaryTree leftRightView =  new PrintLeftViewRightViewOfBinaryTree();

        Node root = leftRightView.createNode();
        printLeftView(root);

    }
}
