package Tree.BinaryTreeOperation;

import java.util.Scanner;

public class InsertElementInBT extends CreateBinaryTree{

    static Node insertElement(Node root, int target){
        if(root == null)
            return new Node(target);

        if(target> root.data)
            root.right =  insertElement(root.right,target);
        else
            root.left =  insertElement(root.left,target);

        return root;
    }
    public static void main(String[] args){
        sc =  new Scanner(System.in);
        InsertElementInBT insertElementInBT =  new InsertElementInBT();

        Node root =  insertElementInBT.createNode();
        Node newRoot =  insertElement(root,7);
         insertElementInBT.inOrder(newRoot);

    }
}
