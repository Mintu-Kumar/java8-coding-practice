package Tree.BinaryTreeOperation;

import java.util.Scanner;

public class FloorAndCeilInBST extends CreateBinaryTree{

    static int floor(Node root, int key){
        int ans  =  Integer.MAX_VALUE;
        while (root != null){

            if(root.data == key)
                return  root.data;

            if(root.data> key)
                root =  root.left;
            else {
                ans =  root.data;
                root =  root.right;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        sc =  new Scanner(System.in);
        FloorAndCeilInBST floorAndCeilInBST =  new FloorAndCeilInBST();
        Node root =  floorAndCeilInBST.createNode();
        int floor =  floor(root, 16);
        System.out.println(floor);
    }
}
