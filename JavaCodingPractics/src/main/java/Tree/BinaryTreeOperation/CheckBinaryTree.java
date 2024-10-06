package Tree.BinaryTreeOperation;

import java.util.Scanner;

public class CheckBinaryTree extends CreateBinaryTree{

    static boolean isBst(Node root,int min, int max)
    {
        if(root == null)
            return true;

        if(root.data < min || root.data > max)
            return false;

        return (isBst(root.left, min, root.data-1) && isBst(root.right, root.data+1,max));

    }
    public static void main(String[] args){
        sc = new Scanner(System.in);
        CheckBinaryTree checkBinaryTree =  new CheckBinaryTree();
        Node root =  checkBinaryTree.createNode();

        if(isBst(root, Integer.MIN_VALUE,Integer.MAX_VALUE))
            System.out.println("Yes, it is binary tree");
        else
            System.out.println("No, It is not a binary tree");
    }
}
