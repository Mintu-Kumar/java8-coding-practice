package Tree.BinaryTreeOperation;

import java.util.Scanner;

public class BinarySearch extends CreateBinaryTree {

    static boolean searchElement(Node root, int target){
        if(root ==null)
            return false;
        if(root.data == target)
            return true;

        if(target>root.data)
            return searchElement(root.right,target);

        return searchElement(root.left,target);
    }
    public static void main(String[] arge) {
        sc =  new Scanner(System.in);
        BinarySearch binarySearch =  new BinarySearch();
        Node root = binarySearch.createNode();
        if(searchElement(root,25))
            System.out.println("Element present");
        else
            System.out.println("Not present");
    }
}
