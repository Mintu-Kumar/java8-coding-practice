package Tree;

import java.util.Scanner;

public class HeightOfBT {


    static Scanner sc;
    static class Node
    {
        Node left, right;
        int data;
        Node(int data){
            this.data = data;
        }
    }
    public static Node createNode(){
        Node root = null;
        System.out.println("Enter data: ");
        int data =  sc.nextInt();

        if(data == -1)
            return null;

        root = new Node(data);

        System.out.println("Enter left for: "+data);
        root.left = createNode();

        System.out.println("Enter right for: "+ data);
        root.right = createNode();

        return root;
    }

    static int heightOfBinaryTree(Node root){

        if (root == null)
            return 0;

        return Math.max(heightOfBinaryTree(root.left),heightOfBinaryTree(root.right))+1;
    }

    public static void main(String[] args){
        sc =  new Scanner(System.in);
        Node root = createNode();
        int hgt =  heightOfBinaryTree(root);
        System.out.println("Height of tree is= "+ hgt);

    }


}
