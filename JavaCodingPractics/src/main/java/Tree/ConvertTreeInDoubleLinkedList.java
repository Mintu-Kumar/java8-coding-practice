package Tree;

import java.util.Scanner;

public class ConvertTreeInDoubleLinkedList extends CreateBinaryTree {

    static Node prev = null, head=null;
    static void convertTreeDLL(Node root){

        if(root == null)
            return;

        convertTreeDLL(root.left);
        if(prev == null)
            head =  root;
        else{
            root.left = prev;
            prev.right = root;
        }
        prev =  root;
        convertTreeDLL(root.right);


    }

    public static void main(String[] args){
        sc =  new Scanner(System.in);
        ConvertTreeInDoubleLinkedList  convertList =  new ConvertTreeInDoubleLinkedList();
        Node root =  convertList.createNode();
        convertTreeDLL(root);
    }
}
