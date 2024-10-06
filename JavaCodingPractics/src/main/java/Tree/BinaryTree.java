package Tree;

import java.util.Scanner;

/**
 * Tree  coding practice  https://www.techiedelight.com/data-structures-and-algorithms-problems/
 */
public class BinaryTree {
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

    static void inOrder(Node root){
         if(root == null)
             return;

         inOrder(root.left);
         System.out.print(root.data+" ");
         inOrder(root.right);
    }
    static void preOrder(Node root){
        if(root == null)
            return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root){
        if(root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }


    public static void main(String[] args){
       sc =  new Scanner(System.in);
       Node root = createNode();
       inOrder(root);
       preOrder(root);
       postOrder(root);
    }


}
