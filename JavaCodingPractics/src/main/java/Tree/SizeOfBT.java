package Tree;

import java.util.Scanner;

class sizeOfBT extends CreateBinaryTree {

    static int sizeOfBinaryTree(Node root){

        if (root == null)
            return 0;

        return sizeOfBinaryTree(root.left)+sizeOfBinaryTree(root.right)+1;
    }

    public static void main(String[] args){
        sc =  new Scanner(System.in);
        sizeOfBT bt =  new sizeOfBT();
        Node root = bt.createNode();
        int res = sizeOfBinaryTree(root);
        System.out.println("Size of binary tree "+ res);



    }

}
