package Tree;

import java.util.Scanner;

public class LowestCommonAcestorOfBT extends CreateBinaryTree {

    public static void main(String[] args){
        sc =  new Scanner(System.in);
        LowestCommonAcestorOfBT lowestCommonAcestorOfBT =  new LowestCommonAcestorOfBT();
        Node root = lowestCommonAcestorOfBT.createNode();
        Node roo = lca(root,7,6);
        System.out.println(roo.data);
    }

    static Node lca(Node root, int e1, int e2){

        if(root == null)
           return null;

        if(root.data == e1 || root.data ==e2)
            return root;

        Node left = lca(root.left,e1,e2);
        Node right =  lca(root.right,e1,e2);

        if(left == null) return root.right;
        if(right == null) return root.left;

        return root;
    }
}
