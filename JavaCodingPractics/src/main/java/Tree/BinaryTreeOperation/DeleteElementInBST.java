package Tree.BinaryTreeOperation;

import java.util.Scanner;

public class  DeleteElementInBST extends CreateBinaryTree{

    static Node deleteElement(Node root, int target){
        if(root == null)
            return null;

        if(root.data>target)
            root.left =  deleteElement(root.left,target);
        else if(root.data<target)
            root.right =  deleteElement(root.right,target);
        else{
            if(root.left == null)
                return root.right;
            else if(root.right == null)
                return  root.left;

            root.data =  minValue(root.left);

            root.right =  deleteElement(root.right,root.data);
        }
        return root;
    }

    static int minValue(Node root){
        int minV =  root.data;
        while (root.left!= null){
            minV =  root.left.data;
            root = root.left;
        }

        return minV;
    }
    public static void main(String[] args){
        sc =  new Scanner(System.in);
        DeleteElementInBST deleteElementInBST =  new DeleteElementInBST();
        Node root =  deleteElementInBST.createNode();
        Node newTree =  deleteElement(root,4);
        deleteElementInBST.inOrder(newTree);
    }
}
