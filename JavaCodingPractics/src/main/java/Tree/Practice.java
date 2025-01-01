package Tree;

import java.util.*;

public class Practice {
    static Scanner sc;

    public class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
        }
    }

    public Node createNode(){
        Node root = null;
        System.out.println("Enter Data:");
        int data = sc.nextInt();

        if(data == -1)
            return null;

        root = new Node(data);

        System.out.println("Enter left data for "+data);
        root.left = createNode();

        System.out.println("Enter right data for "+data);
        root.right = createNode();

        return root;
    }

    public Node deleteNode(Node root, int target){
        if(root == null)
            return null;

        if(root.data > target)
            root.left = deleteNode(root.left,target);
        else if(root.data<target)
                root.right = deleteNode(root.right,target);
        else{
            if(root.left ==null)
                return root.right;
            else if(root.right == null)
                return root.left;

            root.data = minValue(root.left);

            root.right = deleteNode(root.right,root.data);
        }
        return root;
    }

    public int minValue(Node root)
    {
        int minV =  root.data;
        while (root.left!=null)
        {
            minV =  root.left.data;
            root = root.left;
        }
        return minV;
    }

    public void inOrder(Node root){
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void main (String[] args){
        sc=  new Scanner(System.in);
        Practice p = new Practice();
        Node root =  p.createNode();
        p.inOrder(root);

    }
}
