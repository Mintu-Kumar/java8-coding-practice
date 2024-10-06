package Tree;

import java.util.Scanner;

public class CreateBinaryTree {
    static Scanner sc;
    static class Node
    {
        Node left, right;
        int data;
        Node(int data){
            this.data = data;
        }
    }
    public Node createNode(){
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


}

